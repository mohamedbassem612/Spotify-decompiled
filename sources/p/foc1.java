package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class foc1 extends dt71 implements zob1 {
    @Override // p.zob1
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.h;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) mgo1.h(objArr, (this.i + ((long) ((int) ((q() + ((long) this.X)) - this.i)))) - 1)).intValue());
        }
        return numValueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            Object[] objArr = this.h;
            objArr.getClass();
            a(Integer.valueOf(((Number) mgo1.h(objArr, (this.i + ((long) ((int) ((q() + ((long) this.X)) - this.i)))) - 1)).intValue() + i));
        }
    }
}
