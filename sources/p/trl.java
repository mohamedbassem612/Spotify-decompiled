package p;

import android.os.Build;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class trl implements url {
    public final Object a;
    public final Object b;

    public /* synthetic */ trl(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionB = eqg.b(this.a);
            d69 d69VarH = t6p1.h((View) this.b);
            Objects.requireNonNull(d69VarH);
            contentCaptureSessionB.notifyViewsDisappeared(q58.f(d69VarH.a), new long[]{Long.MIN_VALUE});
        }
    }

    public AutofillId b(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionB = eqg.b(this.a);
        d69 d69VarH = t6p1.h((View) this.b);
        Objects.requireNonNull(d69VarH);
        return contentCaptureSessionB.newAutofillId(q58.f(d69VarH.a), j);
    }

    public ghk1 c(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new ghk1(eqg.b(this.a).newVirtualViewStructure(autofillId, j), (byte) 0);
        }
        return null;
    }

    public void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            eqg.b(this.a).notifyViewAppeared(viewStructure);
        }
    }

    public void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            eqg.b(this.a).notifyViewDisappeared(autofillId);
        }
    }

    public void f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.a).notifyViewTextChanged(autofillId, str);
        }
    }

    public void g() {
        ((PowerManager) this.a).removeThermalStatusListener((fk30) this.b);
    }
}
