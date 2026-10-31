package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wfx {
    public final gw70 a;
    public final Context b;

    public wfx(gw70 gw70Var, Context context) {
        this.a = gw70Var;
        this.b = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object a(Uri uri, onm onmVar) {
        mw70 mw70Var;
        if (onmVar instanceof mw70) {
            mw70Var = (mw70) onmVar;
            int i = mw70Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mw70Var.d = i - Integer.MIN_VALUE;
            } else {
                mw70Var = new mw70(this, onmVar);
            }
        } else {
            mw70Var = new mw70(this, onmVar);
        }
        Object objR = mw70Var.b;
        int i2 = mw70Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objR);
                if (u890.j(uri, Uri.EMPTY)) {
                    return new pbn(uri, b());
                }
                mw70Var.a = uri;
                mw70Var.d = 1;
                ohd ohdVar = new ohd(1, aym.t(mw70Var));
                ohdVar.t();
                ixg ixgVarF = this.a.f(uri.toString());
                ixgVarF.b();
                ixgVarF.g = false;
                ixgVarF.q(this.b, 2131166451, 2131166451, 2);
                ixgVarF.e();
                ixgVarF.r("MediaSession_AlbumArtTarget");
                ixgVarF.j(new st60(ohdVar, uri, this, (byte) 11));
                ohdVar.n(new zi50(ixgVarF, (byte) 29));
                objR = ohdVar.r();
                d9n d9nVar = d9n.a;
                if (objR == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = mw70Var.a;
                hm5.M(objR);
            }
            return (pbn) objR;
        } catch (Exception unused) {
            return new pbn(uri, b());
        }
    }

    public Bitmap b() {
        Context context = this.b;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166451);
        Drawable drawableJ = f0o1.j(context, 2131231384);
        if (drawableJ != null) {
            y1a1.T(drawableJ, context.getResources().getColor(2131101184));
        }
        if (drawableJ == null) {
            return null;
        }
        if ((drawableJ instanceof BitmapDrawable) && ((BitmapDrawable) drawableJ).getBitmap() == null) {
            return null;
        }
        return mno1.y(drawableJ, dimensionPixelSize, dimensionPixelSize, null);
    }

    public void c(Uri uri) {
        if (uri.equals(Uri.EMPTY)) {
            return;
        }
        ixg ixgVarB = this.a.b(uri);
        ixgVarB.q(this.b, 2131166451, 2131166451, 2);
        ixgVarB.e();
        ixgVarB.n();
    }

    public wfx(Context context, gw70 gw70Var) {
        this.b = context;
        this.a = gw70Var;
    }
}
