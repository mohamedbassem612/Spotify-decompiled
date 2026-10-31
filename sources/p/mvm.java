package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mvm extends nvm {
    public final String a;
    public final String b;
    public final String c;
    public final Long d;

    public mvm(String str, String str2, String str3, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvm)) {
            return false;
        }
        mvm mvmVar = (mvm) obj;
        return u890.j(this.a, mvmVar.a) && u890.j(this.b, mvmVar.b) && u890.j(this.c, mvmVar.c) && u890.j(this.d, mvmVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.d;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }
}
