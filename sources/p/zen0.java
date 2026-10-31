package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zen0 extends k9 {
    public final hrr0 c;
    public final hrr0 d;

    public zen0(Object obj) {
        super((byte) 18);
        this.c = xto.t(obj);
        this.d = xto.t(obj);
    }

    public final Object P0() {
        return this.c.getValue();
    }

    public final Object Y0() {
        return this.d.getValue();
    }

    public final void o1(Object obj) {
        this.c.setValue(obj);
    }

    public final boolean v1() {
        return u890.j(this.c.getValue(), this.d.getValue()) && !d1();
    }

    public final void w1(Boolean bool) {
        this.d.setValue(bool);
    }
}
