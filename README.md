# ANTOINERIE-le-singe-originel
C'est toi le singe
## GROS SINGE

### ANTOINERIE n'est JAMAIS FINI

    @Override
    public String toString()
    {
        String phrase = "";

        if (!this.estMarquee() && !this.estDecouvert())
        {
            phrase = " ";
        }

        if (this.estMarquee())
        {
            phrase = "?";
        }

        else if (this.estDecouvert())
        {
            if(this.contientUneBombe())
            {
                phrase = "@";
            }

            else if(this.estDecouvert())
            {
                phrase = this.nombreBombesVoisines() + "";
            }
        }

        return phrase;
    }
