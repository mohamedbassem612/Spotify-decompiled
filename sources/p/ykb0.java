package p;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.Magnifier;
import androidx.compose.ui.text.font.FontWeight;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ykb0 implements ukb0, wct0, izq0, zdt0 {
    public static final ykb0 a = new ykb0();
    public static final ykb0 b = new ykb0();
    public static final ykb0 c = new ykb0();

    public static Typeface i(String str, FontWeight fontWeight, int i) {
        if (i == 0 && u890.j(fontWeight, FontWeight.t) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && u890.j(fontWeight, FontWeight.Z) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), fontWeight.a, i == 1);
    }

    public static void j(uim uimVar, Context context, s3e1 s3e1Var) {
        if (context == null) {
            return;
        }
        int i = s3e1Var.c;
        TextClassification textClassification = s3e1Var.b;
        Drawable drawable = s3e1Var.d;
        byte b2 = 18;
        if (i < 0) {
            uim.b(uimVar, new w9(textClassification, (byte) 27), drawable != null ? new j2i(-1123224187, new l3e1(drawable, (byte) 0), true) : null, new qga0(context, textClassification, b2), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            uim.b(uimVar, new w9(remoteAction, (byte) 28), drawable != null ? new j2i(1106162332, new l3e1(drawable, (byte) 1), true) : null, new ww21(remoteAction, (byte) 18), 6);
        }
    }

    public static final String k(TextClassification textClassification, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(950061013);
        String strValueOf = String.valueOf(textClassification.getLabel());
        x340Var.r(false);
        return strValueOf;
    }

    public static final String l(RemoteAction remoteAction, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1376593684);
        String string = remoteAction.getTitle().toString();
        x340Var.r(false);
        return string;
    }

    public static final void m(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            sf.H(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public ArrayList a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
        ArrayList arrayList = new ArrayList();
        SigningInfo signingInfo = packageInfo.signingInfo;
        if (!signingInfo.hasMultipleSigners()) {
            arrayList.add(kln1.w(signingInfo.getSigningCertificateHistory()[0]));
            return arrayList;
        }
        for (Signature signature : signingInfo.getApkContentsSigners()) {
            arrayList.add(kln1.w(signature));
        }
        return arrayList;
    }

    public Typeface b(int i, FontWeight fontWeight) {
        return i(null, fontWeight, i);
    }

    @Override // p.wct0
    public boolean c() {
        return false;
    }

    public Typeface d(zh40 zh40Var, FontWeight fontWeight, int i) {
        return i(zh40Var.f, fontWeight, i);
    }

    public Object e(be50 be50Var, lnm lnmVar) {
        return Bitmap.createBitmap(new xkb0(be50Var));
    }

    public void f(Drawable drawable, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(257732500);
        byte b2 = 2;
        int i2 = (x340Var.i(drawable) ? 4 : 2) | i;
        byte b3 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarR = u291.r(nim0.a, ajm.e);
            boolean zI = x340Var.i(drawable);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new w7d1(drawable, b2);
                x340Var.s0(objT);
            }
            t1c.a(exd0.q(qim0VarR, (iu30) objT), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sr91(this, drawable, i, b3);
        }
    }

    @Override // p.wct0
    public vct0 g(View view, boolean z, long j, float f, float f2, boolean z2, wat watVar, float f3) {
        return new xct0(new Magnifier(view));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(Activity activity, onm onmVar) {
        elx0 elx0Var;
        g2z g2zVar;
        Activity activity2;
        if (onmVar instanceof elx0) {
            elx0Var = (elx0) onmVar;
            int i = elx0Var.e;
            if ((i & os00.INVALID_ID) != 0) {
                elx0Var.e = i - os00.INVALID_ID;
            } else {
                elx0Var = new elx0(this, onmVar);
            }
        } else {
            elx0Var = new elx0(this, onmVar);
        }
        Object obj = elx0Var.c;
        int i2 = elx0Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            if (!rkx0.d(activity)) {
                hhg1.n("Provided Activity is not running on a Projected device.");
                return null;
            }
            g2z g2zVar2 = new g2z(activity);
            elx0Var.a = activity;
            elx0Var.b = g2zVar2;
            elx0Var.e = 1;
            Object objW = g2zVar2.w(elx0Var);
            d9n d9nVar = d9n.a;
            if (objW == d9nVar) {
                return d9nVar;
            }
            g2zVar = g2zVar2;
            obj = objW;
            activity2 = activity;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g2zVar = elx0Var.b;
            activity2 = elx0Var.a;
            hm5.M(obj);
        }
        new mv2(activity2, Handler.createAsync(Looper.getMainLooper()));
        return new flx0(g2zVar, (vj70) obj);
    }
}
