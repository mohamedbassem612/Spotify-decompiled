package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yza {
    public final uza a;
    public final uza b;
    public final int c;

    public yza(uza uzaVar, uza uzaVar2, int i) {
        this.a = uzaVar;
        this.b = uzaVar2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yza)) {
            return false;
        }
        yza yzaVar = (yza) obj;
        return this.a.equals(yzaVar.a) && this.b.equals(yzaVar.b) && this.c == yzaVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
