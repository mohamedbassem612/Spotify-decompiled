package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class ooc1 {
    public static final noc1 Companion = new noc1();
    public final String a;
    public final String b;

    public /* synthetic */ ooc1(int i, String str, String str2) {
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
    }

    public ooc1() {
        this.a = "";
        this.b = "";
    }
}
