package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class bhf1 {
    public static final ahf1 Companion = new ahf1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ bhf1(int i, String str, String str2, String str3, String str4) {
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
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
    }

    public bhf1() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }
}
