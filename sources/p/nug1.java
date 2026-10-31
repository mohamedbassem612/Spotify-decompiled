package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nug1 extends lug1 {
    public final /* synthetic */ byte d;

    public final Object next() {
        switch (this.d) {
            case 0:
                int i = ((lug1) this).c;
                ((lug1) this).c = i + 2;
                Object[] objArr = ((lug1) this).a;
                return new bng0(objArr[i], objArr[i + 1], (byte) 1);
            case 1:
                int i2 = ((lug1) this).c;
                ((lug1) this).c = i2 + 2;
                return ((lug1) this).a[i2];
            default:
                int i3 = ((lug1) this).c;
                ((lug1) this).c = i3 + 2;
                return ((lug1) this).a[i3 + 1];
        }
    }
}
