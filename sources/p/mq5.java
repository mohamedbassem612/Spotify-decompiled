package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class mq5 extends cv5 {
    public static final lq5 Companion = new lq5();
    public final String b;
    public final Integer c;
    public final Integer d;

    public mq5(int i, String str, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
    }
}
