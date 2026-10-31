package p;

import android.view.ScaleGestureDetector;
import com.spotify.profile.editprofile.imageutils.CroppingImageView;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k8o implements ScaleGestureDetector.OnScaleGestureListener {
    public float a;
    public final /* synthetic */ CroppingImageView b;

    public k8o(CroppingImageView croppingImageView) {
        this.b = croppingImageView;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0021 A[PHI: r5
      0x0021: PHI (r5v9 float) = (r5v0 float), (r5v1 float) binds: [B:5:0x001f, B:8:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float currentSpan = scaleGestureDetector.getCurrentSpan();
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        CroppingImageView croppingImageView = this.b;
        float f = croppingImageView.W0;
        if (f > 0.0f) {
            float f2 = currentSpan / f;
            float f3 = croppingImageView.N0;
            float f4 = f3 * f2;
            float f5 = croppingImageView.T0;
            if (f4 > f5) {
                f2 = f5 / f3;
            } else {
                f5 = croppingImageView.S0;
                if (f4 < f5) {
                    f2 = f5 / f3;
                }
            }
            float f6 = (focusX - croppingImageView.Q0) + croppingImageView.O0;
            float f7 = (focusY - croppingImageView.R0) + croppingImageView.P0;
            float f8 = croppingImageView.a1 * f3;
            float f9 = croppingImageView.b1 * f3;
            croppingImageView.O0 = f6 - (((f8 * f2) - f8) * ((focusX - f6) / f8));
            croppingImageView.P0 = f7 - (((f9 * f2) - f9) * ((focusY - f7) / f9));
            croppingImageView.N0 = f3 * f2;
            croppingImageView.d();
        }
        croppingImageView.W0 = currentSpan;
        croppingImageView.Q0 = focusX;
        croppingImageView.R0 = focusY;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float currentSpan = scaleGestureDetector.getCurrentSpan();
        CroppingImageView croppingImageView = this.b;
        croppingImageView.W0 = currentSpan;
        this.a = croppingImageView.N0;
        croppingImageView.Q0 = scaleGestureDetector.getFocusX();
        croppingImageView.R0 = scaleGestureDetector.getFocusY();
        croppingImageView.V0 = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        CroppingImageView croppingImageView = this.b;
        ewn0 ewn0Var = croppingImageView.c1;
        if (ewn0Var != null) {
            PictureSelectionActivity pictureSelectionActivity = (PictureSelectionActivity) ewn0Var.b;
            float f = croppingImageView.N0;
            float f2 = this.a;
            b7x b7xVar = b7x.a;
            if (f > f2) {
                r0w r0wVarP0 = pictureSelectionActivity.p0();
                i8h1 i8h1Var = r0wVarP0.a;
                x6h1 x6h1VarC = r0wVarP0.b.b.c();
                x6h1VarC.i.add(new a7h1("image_preview_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("image", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                String str = i8h1Var.m(new w7h1("", "", new z7h1("spread", 1, b7xVar), new x7h1("resize_image", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
            } else if (f < f2) {
                r0w r0wVarP1 = pictureSelectionActivity.p0();
                i8h1 i8h1Var2 = r0wVarP1.a;
                x6h1 x6h1VarC3 = r0wVarP1.b.b.c();
                x6h1VarC3.i.add(new a7h1("image_preview_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("image", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                String str2 = i8h1Var2.m(new w7h1("", "", new z7h1("pinch", 1, b7xVar), new x7h1("resize_image", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
            }
        }
        croppingImageView.V0 = false;
    }
}
