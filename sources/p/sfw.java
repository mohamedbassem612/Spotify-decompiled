package p;

import j$.time.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sfw implements niw {
    public final Duration a;
    public final String b;
    public final String c;

    public sfw(String str, String str2, Duration duration) {
        this.a = duration;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfw)) {
            return false;
        }
        sfw sfwVar = (sfw) obj;
        if (!this.a.equals(sfwVar.a) || !u890.j(this.b, sfwVar.b)) {
            return false;
        }
        String str = sfwVar.c;
        nl7 nl7Var = v4t.b;
        return this.c.equals(str);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        nl7 nl7Var = v4t.b;
        return this.c.hashCode() + iD;
    }
}
