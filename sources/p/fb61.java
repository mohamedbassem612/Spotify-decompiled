package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class fb61 {
    public static final eb61 Companion = new eb61();
    public final String a;
    public final String b;

    public /* synthetic */ fb61(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb61)) {
            return false;
        }
        fb61 fb61Var = (fb61) obj;
        return u890.j(this.a, fb61Var.a) && u890.j(this.b, fb61Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public fb61() {
        this.a = "Google Meet";
        this.b = "https://misc.spotifycdn.com/livesharing/meet_logo_large.png";
    }
}
