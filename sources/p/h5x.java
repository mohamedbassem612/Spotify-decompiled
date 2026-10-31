package p;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h5x extends gio1 {
    public final g5x d;

    public h5x(TextView textView) {
        this.d = new g5x(textView);
    }

    public final void A(boolean z) {
        if (a4x.d()) {
            this.d.A(z);
        }
    }

    public final void B(boolean z) {
        boolean zD = a4x.d();
        g5x g5xVar = this.d;
        if (zD) {
            g5xVar.B(z);
        } else {
            g5xVar.f = z;
        }
    }

    public final TransformationMethod E(TransformationMethod transformationMethod) {
        return !a4x.d() ? transformationMethod : this.d.E(transformationMethod);
    }

    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        return !a4x.d() ? inputFilterArr : this.d.p(inputFilterArr);
    }

    public final boolean x() {
        return this.d.f;
    }
}
