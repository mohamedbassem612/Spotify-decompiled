package p;

import j$.time.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tfw implements niw {
    public final Duration a;
    public final String b;
    public final String c;

    public tfw(String str, String str2, Duration duration) {
        this.a = duration;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfw)) {
            return false;
        }
        tfw tfwVar = (tfw) obj;
        if (!this.a.equals(tfwVar.a) || !u890.j(this.b, tfwVar.b)) {
            return false;
        }
        String str = tfwVar.c;
        nl7 nl7Var = v4t.b;
        return this.c.equals(str);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        nl7 nl7Var = v4t.b;
        return this.c.hashCode() + iD;
    }
}
