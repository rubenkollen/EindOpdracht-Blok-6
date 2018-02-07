package eindopdracht;

public class Virus implements Comparable{

    public Virus(String Virus_Id, String Virus_Name, String Virus_Classificatie, String Refseq_Id, String Kegg_Genome, String Kegg_Disease, String Disease,String Virus_Hosts, String Host_Name, String Host_Lineage, String pmid, String Evidence) {
        this.Virus_Id = Virus_Id;
        this.Virus_Name = Virus_Name;                                                                       //constructer  van een virus object, wordt later in een viruslijst toegevoegd
        this.Virus_Hosts = Virus_Hosts;
        this.Virus_Classificatie = Virus_Classificatie;
        this.Refseq_Id = Refseq_Id;
        this.Kegg_Genome = Kegg_Genome;
        this.Kegg_Disease = Kegg_Disease;
        this.Disease = Disease;
        this.Host_Name = Host_Name;
        this.Host_Lineage = Host_Lineage;
        this.pmid = pmid;
        this.Evidence = Evidence;
    }
    String Virus_Id;
    String Virus_Name;                                                      // het aanmaken van de 12 items
    String Virus_Hosts;  //host tax id, 
    String Virus_Classificatie; //linage
    String Refseq_Id;
    String Kegg_Genome;
    String Kegg_Disease;
    String Disease;
    String Host_Name;
    String Host_Lineage;
    String pmid;
    String Evidence;
    Integer getal;

    public Integer getGetal() {                                                                         //de getter van getal die met compare wordt gebruikt bij het sorteren op het aantal hosts
        return getal;
    }

    public void setGetal(Integer getal) {                                                               // de setter van getal de met compare wordt gebruikt bij het sorteren op het aantal hosts
        this.getal = getal;
    }
 
    public void setVirus_Id(String Virus_Id){
        this.Virus_Id = Virus_Id;                                                                           //de setter van het virus ID
    }
    public void setVirus_Name(String Virus_Name){                                                           //de setter van het virus naam
        this.Virus_Name = Virus_Name;
    }
    public void setVirus_Hosts(String Virus_Hosts){                                                          //de setter van de virus hosts id's
        this.Virus_Hosts = Virus_Hosts;
    }
    public void setVirus_Classificatie(String Virus_Classificatie){                                          //de setter van het virus classificatie
        this.Virus_Classificatie = Virus_Classificatie;
    }
    
    public void setRefseq_Id(String Refseq_Id) {                                                             //de setter van refseq id
        this.Refseq_Id = Refseq_Id;
    }

    public void setKegg_Genome(String Kegg_Genome) {                                                         //de setter van het Kegg Genome
        this.Kegg_Genome = Kegg_Genome;
    }

    public void setKegg_Disease(String Kegg_Disease) {                                                       //de setter van Kegg Disease
        this.Kegg_Disease = Kegg_Disease;
    }

    public void setDisease(String Disease) {                                                                //de setter van Disease
        this.Disease = Disease;
    }

    public void setHost_Name(String Host_Name) {                                                            //de setter van Hosts namen
        this.Host_Name = Host_Name;
    }

    public void setHost_Lineage(String Host_Lineage) {                                                       //de setter van host lineage
        this.Host_Lineage = Host_Lineage;
    }

    public void setPmid(String pmid) {                                                                      //de setter van pmid
        this.pmid = pmid;
    }

    public void setEvidence(String Evidence) {                                                             //de setter van de evidence
        this.Evidence = Evidence;
    }
    
    public String getVirus_Id(){                                                                            //getter van virus id
    return Virus_Id;
}
    public String getVirus_Name(){                                                                          //getter van virus naam
    return Virus_Name;
}
    public String getVirus_Hosts(){                                                                         //getter van virus hosts id's
    return Virus_Hosts;
}
    public String getVirus_Classificatie(){                                                                 //getter van virus classificatie
    return Virus_Classificatie;
}
    public String getRefseq_Id(){                                                                           //getter van het refseq id
    return Refseq_Id;
}
    public String getKegg_Genome(){                                                                         //getter van kegg genome
    return Kegg_Genome;
}
    public String getKegg_Disease(){                                                                        //getter van kegg disease
    return Kegg_Disease;  
}
    public String getDisease(){                                                                             //getter van de Disease
    return Disease;    
}
    public String getHost_Name(){                                                                           //getter van de host naam
    return Host_Name; 
}
    public String getHost_Lineage(){                                                                        //getter van host lineage
    return Refseq_Id;
}
    public String getpmid(){                                                                                //getter van pmid
    return pmid;
}
    public String getEvidence(){                                                                            //getter van de evidence
    return Evidence;  
}

@Override
public int compareTo(Object o){                                                                             //class voor het vergelijken van lijsten
   Virus k = (Virus)o;
   return this.Virus_Classificatie.compareTo(k.Virus_Classificatie);
}
}
