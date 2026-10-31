package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class itk implements ahn {
    public String a = "unknown";
    public String b = "unknown";
    public String c = "unknown";
    public String d = "unknown";
    public String e = "unknown";

    public final wk21 a() {
        StringBuilder sb = new StringBuilder(2048);
        sb.append("Build variant: release\nBuild version: ");
        sb.append(this.a);
        sb.append("\nUser name: unknown\nUser locale: ");
        sb.append(this.b);
        sb.append("\nOrientation: ");
        sb.append(this.e);
        sb.append("\nFont scale: ");
        sb.append(this.c);
        sb.append("\nPackage signature: unknown\nInstaller package: ");
        return new wk21("Application Configuration", "A list of app properties at the time of reporting", gvg.k(sb, this.d, '\n'));
    }

    public final void b(ugn ugnVar) {
        if (ugnVar instanceof pgn) {
            this.a = eqr0.v(ugnVar);
            return;
        }
        if (ugnVar instanceof sfn) {
            this.b = eqr0.v(ugnVar);
            return;
        }
        if (ugnVar instanceof zen) {
            this.c = eqr0.v(ugnVar);
        } else if (ugnVar instanceof vfn) {
            this.e = eqr0.v(ugnVar);
        } else if (ugnVar instanceof ifn) {
            this.d = eqr0.v(ugnVar);
        }
    }
}
