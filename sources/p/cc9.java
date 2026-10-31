package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cc9 {
    public int a;
    public int b;
    public int c;

    public cc9(int i, int i2, int i3) {
        i = (i3 & 1) != 0 ? 50 : i;
        i2 = (i3 & 2) != 0 ? 25 : i2;
        int i4 = (i3 & 4) != 0 ? 0 : 10;
        this.a = i;
        this.b = i2;
        this.c = i4;
    }

    public /* synthetic */ cc9(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public cc9() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
}
