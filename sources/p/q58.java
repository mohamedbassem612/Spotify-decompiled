package p;

import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.common.VideoFrameProcessingException;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class q58 implements e9d0, Predicate, Function, Init, os40, t151, jrn0, uhd, qy70, kpd {
    public final /* synthetic */ byte a;

    public static /* bridge */ /* synthetic */ ColorSpace d(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillId f(Object obj) {
        return (AutofillId) obj;
    }

    public static /* synthetic */ void g(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.lcd1 */
    public static /* synthetic */ void h(Object obj, String str) throws lcd1 {
        throw new lcd1(str + obj);
    }

    public static /* synthetic */ void i(Object obj, StringBuilder sb) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        oon1.w("Exception caught by default BaseGlShaderProgram errorListener.", videoFrameProcessingException);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return new lq8((jm70) obj);
            case 3:
                return new nq8((th61) obj);
            case 4:
                return new kq8((fr8) obj);
            case 5:
                return new jq8((tal) obj);
            default:
                HashMap map = new HashMap(1);
                if (!((Boolean) obj).booleanValue()) {
                    map.put("Cache-Control", String.format(Locale.getDefault(), "max-stale=%d", 604800L));
                }
                return map;
        }
    }

    public Object b(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                ((c8c0) obj).getClass();
                ((izu0) obj2).getClass();
                return new ic3((byte) 2);
            case 25:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new xne((byte) 0);
            case 26:
                ((qop) obj).getClass();
                ((gl90) obj2).getClass();
                return new boe((byte) 0);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((qop) obj).getClass();
                ((gl90) obj2).getClass();
                return new doe((byte) 0);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((qop) obj).getClass();
                ((gl90) obj2).getClass();
                return new foe((byte) 0);
            default:
                qop qopVar = (qop) obj;
                bct bctVar = (bct) obj2;
                qopVar.getClass();
                bctVar.getClass();
                return new qpg(bctVar.b, bctVar.d, qopVar.d(), new fyo((byte) 7));
        }
    }

    public boolean c() {
        return false;
    }

    public void cancel() {
    }

    public void e(ry70 ry70Var) throws Exception {
        try {
            zx70 zx70VarC = ry70Var.c();
            if (zx70VarC != null) {
                w8p1.m();
                zx70VarC.toString();
                j2h1.M("CaptureNode");
                zx70VarC.close();
            }
        } catch (IllegalStateException unused) {
        }
    }

    public First e0(Object obj) {
        int i = t380.c;
        return First.c((tq8) obj, new b291(yp8.a));
    }

    public void invoke(Object obj) {
        exs exsVar;
        z8c0 z8c0Var = ((tgr) obj).a.o;
        if (z8c0Var != null) {
            zjh0 zjh0Var = (zjh0) z8c0Var.b;
            synchronized (zjh0Var.a) {
                exsVar = zjh0Var.S0;
            }
            if (exsVar != null) {
                exsVar.g.getClass();
            }
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        String string = intent.getData().toString();
        Set set = s4b1.f;
        String strZ = uic.x(string).z();
        strZ.getClass();
        Parcelable parcelableB = nik1.N.b(strZ);
        Bundle bundle = new Bundle();
        bundle.putParcelable("artist_uri", parcelableB);
        return new frn0(bundle, qva.class);
    }

    public void onStopRecording() {
    }

    public boolean test(Object obj) {
        return ((ln41) obj) instanceof jn41;
    }
}
