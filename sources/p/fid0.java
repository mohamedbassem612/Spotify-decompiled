package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class fid0 {
    public static final eid0 Companion = new eid0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ fid0(String str, String str2, int i, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
    }

    public fid0() {
        this.a = "";
        this.b = "";
        this.c = "";
    }
}
