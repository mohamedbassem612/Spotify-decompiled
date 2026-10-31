package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oug1 extends mug1 {
    public final /* synthetic */ byte d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                int i = this.c;
                this.c = i + 2;
                Object[] objArr = this.a;
                return new bng0(objArr[i], objArr[i + 1], (byte) 0);
            default:
                int i2 = this.c;
                this.c = i2 + 2;
                return this.a[i2 + 1];
        }
    }
}
