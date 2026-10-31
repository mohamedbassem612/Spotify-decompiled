package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nwb {
    public final owb a;
    public final owb b;
    public final owb c;

    public nwb(owb owbVar, owb owbVar2, owb owbVar3) {
        this.a = owbVar;
        this.b = owbVar2;
        this.c = owbVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwb)) {
            return false;
        }
        nwb nwbVar = (nwb) obj;
        return this.a == nwbVar.a && this.b == nwbVar.b && this.c == nwbVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
