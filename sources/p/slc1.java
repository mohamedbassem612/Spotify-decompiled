package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class slc1 {
    public final vlc1 a;
    public vmb0 b;
    public final plc1 c = new plc1(this, (byte) 0);
    public final plc1 d = new plc1(this, (byte) 1);
    public final plc1 e = new plc1(this, (byte) 2);

    public slc1(vlc1 vlc1Var) {
        this.a = vlc1Var;
    }

    public final vmb0 a() {
        vmb0 vmb0Var = this.b;
        if (vmb0Var != null) {
            return vmb0Var;
        }
        hhg1.n("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
