package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class vnd0 {
    public static final und0 Companion = new und0();
    public final String a;
    public final String b;

    public /* synthetic */ vnd0(int i, String str, String str2) {
        this.a = (i & 1) == 0 ? "Live event" : str;
        if ((i & 2) == 0) {
            this.b = "https://betamax.akamaized.net/cmaf/live/2003445/{eventid}/master.m3u8";
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnd0)) {
            return false;
        }
        vnd0 vnd0Var = (vnd0) obj;
        return u890.j(this.a, vnd0Var.a) && u890.j(this.b, vnd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public vnd0() {
        this.a = "Live event";
        this.b = "https://betamax.akamaized.net/cmaf/live/2003445/{eventid}/master.m3u8";
    }
}
