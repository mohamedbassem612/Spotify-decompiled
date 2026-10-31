package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.car.app.k;
import androidx.compose.ui.platform.ComposeView;
import androidx.credentials.exceptions.CreateCredentialException;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encoremobile.viewstub.EncoreViewStub;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import io.reactivex.rxjava3.subjects.Subject;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i6b implements w9k1, Function, Producer, xi7, rjw0, i060, k1q0, qiw, dl4, c0g, ya {
    public final /* synthetic */ byte a;
    public Object b;

    public i6b(byte b) {
        this.a = b;
        switch (b) {
            case 17:
                break;
            default:
                this.b = UnicastSubject.f(1, (Runnable) new idd1(new ptb(this, (byte) 10)).getValue()).c();
                break;
        }
    }

    public static i6b k(rwg rwgVar) {
        i6b i6bVar = rwgVar.a;
        return i6bVar != null ? i6bVar : new i6b(rwgVar);
    }

    public void A(int i) {
        ((rwg) this.b).z(i, 4);
    }

    public void B(int i, int i2) {
        ((rwg) this.b).r(i, i2);
    }

    public void C(int i, List list, boolean z) {
        boolean z2 = list instanceof er80;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rwgVar.r(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += rwg.g(((Integer) list.get(i3)).intValue());
            }
            rwgVar.B(iG);
            while (i2 < list.size()) {
                rwgVar.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        er80 er80Var = (er80) list;
        if (!z) {
            while (i2 < er80Var.c) {
                rwgVar.r(i, er80Var.e(i2));
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < er80Var.c; i4++) {
            iG2 += rwg.g(er80Var.e(i4));
        }
        rwgVar.B(iG2);
        while (i2 < er80Var.c) {
            rwgVar.s(er80Var.e(i2));
            i2++;
        }
    }

    public void D(int i, int i2) {
        ((rwg) this.b).n(i, i2);
    }

    public void E(int i, List list, boolean z) {
        boolean z2 = list instanceof er80;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rwgVar.n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            rwgVar.B(i3);
            while (i2 < list.size()) {
                rwgVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        er80 er80Var = (er80) list;
        if (!z) {
            while (i2 < er80Var.c) {
                rwgVar.n(i, er80Var.e(i2));
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < er80Var.c; i6++) {
            er80Var.e(i6);
            i5 += 4;
        }
        rwgVar.B(i5);
        while (i2 < er80Var.c) {
            rwgVar.o(er80Var.e(i2));
            i2++;
        }
    }

    public void F(int i, long j) {
        ((rwg) this.b).p(i, j);
    }

    public void G(int i, List list, boolean z) {
        boolean z2 = list instanceof t4f0;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rwgVar.p(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            rwgVar.B(i3);
            while (i2 < list.size()) {
                rwgVar.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        t4f0 t4f0Var = (t4f0) list;
        if (!z) {
            while (i2 < t4f0Var.c) {
                rwgVar.p(i, t4f0Var.e(i2));
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < t4f0Var.c; i6++) {
            t4f0Var.e(i6);
            i5 += 8;
        }
        rwgVar.B(i5);
        while (i2 < t4f0Var.c) {
            rwgVar.q(t4f0Var.e(i2));
            i2++;
        }
    }

    public void H(float f, int i) {
        rwg rwgVar = (rwg) this.b;
        rwgVar.getClass();
        rwgVar.n(i, Float.floatToRawIntBits(f));
    }

    public void I(int i, List list, boolean z) {
        boolean z2 = list instanceof yq20;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    float fFloatValue = ((Float) list.get(i2)).floatValue();
                    rwgVar.getClass();
                    rwgVar.n(i, Float.floatToRawIntBits(fFloatValue));
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            rwgVar.B(i3);
            while (i2 < list.size()) {
                rwgVar.o(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        yq20 yq20Var = (yq20) list;
        if (!z) {
            while (i2 < yq20Var.c) {
                yq20Var.d(i2);
                float f = yq20Var.b[i2];
                rwgVar.getClass();
                rwgVar.n(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < yq20Var.c; i6++) {
            yq20Var.d(i6);
            float f2 = yq20Var.b[i6];
            i5 += 4;
        }
        rwgVar.B(i5);
        while (i2 < yq20Var.c) {
            yq20Var.d(i2);
            rwgVar.o(Float.floatToRawIntBits(yq20Var.b[i2]));
            i2++;
        }
    }

    public void J(int i, Object obj, sm41 sm41Var) {
        rwg rwgVar = (rwg) this.b;
        rwgVar.z(i, 3);
        sm41Var.h((s2j0) obj, rwgVar.a);
        rwgVar.z(i, 4);
    }

    public void K(int i, List list, sm41 sm41Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            J(i, list.get(i2), sm41Var);
        }
    }

    public void L(int i, int i2) {
        ((rwg) this.b).r(i, i2);
    }

    public void M(int i, List list, boolean z) {
        boolean z2 = list instanceof er80;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rwgVar.r(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += rwg.g(((Integer) list.get(i3)).intValue());
            }
            rwgVar.B(iG);
            while (i2 < list.size()) {
                rwgVar.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        er80 er80Var = (er80) list;
        if (!z) {
            while (i2 < er80Var.c) {
                rwgVar.r(i, er80Var.e(i2));
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < er80Var.c; i4++) {
            iG2 += rwg.g(er80Var.e(i4));
        }
        rwgVar.B(iG2);
        while (i2 < er80Var.c) {
            rwgVar.s(er80Var.e(i2));
            i2++;
        }
    }

    public void N(int i, long j) {
        ((rwg) this.b).C(i, j);
    }

    public void O(int i, List list, boolean z) {
        boolean z2 = list instanceof t4f0;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rwgVar.C(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += rwg.g(((Long) list.get(i3)).longValue());
            }
            rwgVar.B(iG);
            while (i2 < list.size()) {
                rwgVar.D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        t4f0 t4f0Var = (t4f0) list;
        if (!z) {
            while (i2 < t4f0Var.c) {
                rwgVar.C(i, t4f0Var.e(i2));
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < t4f0Var.c; i4++) {
            iG2 += rwg.g(t4f0Var.e(i4));
        }
        rwgVar.B(iG2);
        while (i2 < t4f0Var.c) {
            rwgVar.D(t4f0Var.e(i2));
            i2++;
        }
    }

    public void P(int i, w6e0 w6e0Var, Map map) {
        rwg rwgVar = (rwg) this.b;
        rwgVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            rwgVar.z(i, 2);
            rwgVar.B(dng0.a(w6e0Var, entry.getKey(), entry.getValue()));
            Object key = entry.getKey();
            Object value = entry.getValue();
            l220.n(rwgVar, (kul1) w6e0Var.d, 1, key);
            l220.n(rwgVar, (kul1) w6e0Var.e, 2, value);
        }
    }

    public void Q(int i, Object obj, sm41 sm41Var) {
        s8 s8Var = (s8) obj;
        rwg rwgVar = (rwg) this.b;
        rwgVar.z(i, 2);
        rwgVar.B(s8Var.getSerializedSize(sm41Var));
        sm41Var.h(s8Var, this);
    }

    public void R(int i, List list, sm41 sm41Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Q(i, list.get(i2), sm41Var);
        }
    }

    public void S(int i, Object obj) {
        boolean z = obj instanceof phc;
        rwg rwgVar = (rwg) this.b;
        if (z) {
            rwgVar.w(i, (phc) obj);
        } else {
            rwgVar.v(i, (s2j0) obj);
        }
    }

    public void T(int i, int i2) {
        ((rwg) this.b).n(i, i2);
    }

    public void U(int i, List list, boolean z) {
        boolean z2 = list instanceof er80;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rwgVar.n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            rwgVar.B(i3);
            while (i2 < list.size()) {
                rwgVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        er80 er80Var = (er80) list;
        if (!z) {
            while (i2 < er80Var.c) {
                rwgVar.n(i, er80Var.e(i2));
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < er80Var.c; i6++) {
            er80Var.e(i6);
            i5 += 4;
        }
        rwgVar.B(i5);
        while (i2 < er80Var.c) {
            rwgVar.o(er80Var.e(i2));
            i2++;
        }
    }

    public void V(int i, long j) {
        ((rwg) this.b).p(i, j);
    }

    public void W(int i, List list, boolean z) {
        boolean z2 = list instanceof t4f0;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rwgVar.p(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            rwgVar.B(i3);
            while (i2 < list.size()) {
                rwgVar.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        t4f0 t4f0Var = (t4f0) list;
        if (!z) {
            while (i2 < t4f0Var.c) {
                rwgVar.p(i, t4f0Var.e(i2));
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < t4f0Var.c; i6++) {
            t4f0Var.e(i6);
            i5 += 8;
        }
        rwgVar.B(i5);
        while (i2 < t4f0Var.c) {
            rwgVar.q(t4f0Var.e(i2));
            i2++;
        }
    }

    public void X(int i, int i2) {
        ((rwg) this.b).A(i, (i2 >> 31) ^ (i2 << 1));
    }

    public void Y(int i, List list, boolean z) {
        boolean z2 = list instanceof er80;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    rwgVar.A(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += rwg.b(((Integer) list.get(i3)).intValue());
            }
            rwgVar.B(iB);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                rwgVar.B((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        er80 er80Var = (er80) list;
        if (!z) {
            while (i2 < er80Var.c) {
                int iE = er80Var.e(i2);
                rwgVar.A(i, (iE >> 31) ^ (iE << 1));
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < er80Var.c; i4++) {
            iB2 += rwg.b(er80Var.e(i4));
        }
        rwgVar.B(iB2);
        while (i2 < er80Var.c) {
            int iE2 = er80Var.e(i2);
            rwgVar.B((iE2 >> 31) ^ (iE2 << 1));
            i2++;
        }
    }

    public void Z(int i, long j) {
        ((rwg) this.b).C(i, (j >> 63) ^ (j << 1));
    }

    public Long a() {
        pjw0 pjw0Var = (pjw0) this.b;
        if (pjw0Var != null) {
            mjw0 mjw0Var = pjw0Var.b;
            mjw0 mjw0Var2 = mjw0Var instanceof mjw0 ? mjw0Var : null;
            ojw0 ojw0Var = mjw0Var2 != null ? mjw0Var2.b : null;
            if (ojw0Var != null) {
                long jU = jfv.u(ojw0Var.b, ngv.e);
                se11 se11Var = na10.a;
                return Long.valueOf(TimeUnit.SECONDS.toMillis(jU));
            }
        }
        return null;
    }

    public void a0(int i, List list, boolean z) {
        boolean z2 = list instanceof t4f0;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    rwgVar.C(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += rwg.c(((Long) list.get(i3)).longValue());
            }
            rwgVar.B(iC);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                rwgVar.D((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        t4f0 t4f0Var = (t4f0) list;
        if (!z) {
            while (i2 < t4f0Var.c) {
                long jE = t4f0Var.e(i2);
                rwgVar.C(i, (jE >> 63) ^ (jE << 1));
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < t4f0Var.c; i4++) {
            iC2 += rwg.c(t4f0Var.e(i4));
        }
        rwgVar.B(iC2);
        while (i2 < t4f0Var.c) {
            long jE2 = t4f0Var.e(i2);
            rwgVar.D((jE2 >> 63) ^ (jE2 << 1));
            i2++;
        }
    }

    public boolean accept(Object obj) {
        le30 le30Var = ((ksk) obj).c;
        return (le30Var == le30.Y || le30Var == le30.Z) && ((w7r) this.b).d();
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 7:
                return Collections.singletonMap(((dsd) this.b).a, (mvd) obj);
            case 10:
                s6g s6gVar = (s6g) this.b;
                j7m0 j7m0Var = s6gVar.a;
                j7m0 j7m0Var2 = j7m0Var;
                j7m0 j7m0Var3 = j7m0Var;
                return Single.zip(j7m0Var2.h.doOnSubscribe(new ekg(j7m0Var2, (byte) 6)).firstOrError(), j7m0Var3.i.doOnSubscribe(new ekg(j7m0Var3, (byte) 5)).firstOrError(), new fp8(s6gVar, (byte) 17));
            case 12:
                lrg lrgVar = (lrg) this.b;
                return j2h1.D(lrgVar.d, new tc1((g8u) obj, lrgVar, (lnm) null, (byte) 16));
            default:
                u0h u0hVar = (u0h) obj;
                return new CompletableDefer(new wtu(((z0h) this.b).g, u0hVar.b, u0hVar.a, (byte) 0));
        }
    }

    public void b(f060 f060Var) {
        if (f060Var.equals(b060.a)) {
            ((iu30) ((ven0) this.b).getValue()).invoke(cyj.a);
        }
    }

    public void b0(int i) {
        ((rwg) this.b).z(i, 3);
    }

    public String c() {
        pjw0 pjw0Var = (pjw0) this.b;
        if (pjw0Var == null) {
            return null;
        }
        String str = pjw0Var.c;
        if (str.length() == 0) {
            return null;
        }
        return str;
    }

    public void c0(int i, String str) {
        ((rwg) this.b).x(i, str);
    }

    public Subject d() {
        return (Subject) this.b;
    }

    public void d0(int i, List list) {
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!(list instanceof nvb0)) {
            while (i2 < list.size()) {
                rwgVar.x(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        nvb0 nvb0Var = (nvb0) list;
        while (i2 < list.size()) {
            Object objJ = nvb0Var.j(i2);
            if (objJ instanceof String) {
                rwgVar.x(i, (String) objJ);
            } else {
                rwgVar.l(i, (phc) objJ);
            }
            i2++;
        }
    }

    public mr20 e(boolean z) {
        return z ? ((ov20) ((ifl1) ((rjn) this.b).b).b).a("has-mobile-data-download", false) : new huz(Boolean.FALSE, (byte) 10);
    }

    public void e0(int i, int i2) {
        ((rwg) this.b).A(i, i2);
    }

    public Long f() {
        pjw0 pjw0Var = (pjw0) this.b;
        if (pjw0Var != null) {
            mjw0 mjw0Var = pjw0Var.b;
            mjw0 mjw0Var2 = mjw0Var instanceof mjw0 ? mjw0Var : null;
            ojw0 ojw0Var = mjw0Var2 != null ? mjw0Var2.b : null;
            if (ojw0Var != null) {
                long jU = jfv.u(ojw0Var.a, ngv.e);
                se11 se11Var = na10.a;
                return Long.valueOf(TimeUnit.SECONDS.toMillis(jU));
            }
        }
        return null;
    }

    public void f0(int i, List list, boolean z) {
        boolean z2 = list instanceof er80;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rwgVar.A(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += rwg.f(((Integer) list.get(i3)).intValue());
            }
            rwgVar.B(iF);
            while (i2 < list.size()) {
                rwgVar.B(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        er80 er80Var = (er80) list;
        if (!z) {
            while (i2 < er80Var.c) {
                rwgVar.A(i, er80Var.e(i2));
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < er80Var.c; i4++) {
            iF2 += rwg.f(er80Var.e(i4));
        }
        rwgVar.B(iF2);
        while (i2 < er80Var.c) {
            rwgVar.B(er80Var.e(i2));
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(fso fsoVar, ArrayList arrayList, onm onmVar) {
        cso csoVar;
        if (onmVar instanceof cso) {
            csoVar = (cso) onmVar;
            int i = csoVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                csoVar.d = i - Integer.MIN_VALUE;
            } else {
                csoVar = new cso(this, onmVar);
            }
        } else {
            csoVar = new cso(this, onmVar);
        }
        Object objB = csoVar.b;
        int i2 = csoVar.d;
        if (i2 == 0) {
            hm5.M(objB);
            if (!(fsoVar instanceof eso)) {
                if (fsoVar instanceof dso) {
                    return new lv20(arrayList);
                }
                eg.o();
                return null;
            }
            eg40 eg40Var = (eg40) this.b;
            dkn dknVar = ((eso) fsoVar).c;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((oyh) it.next()).b);
            }
            ArrayList<n4z0> arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof n4z0) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
            for (n4z0 n4z0Var : arrayList3) {
                String str = n4z0Var.a;
                List list = n4z0Var.b;
                ArrayList arrayList5 = n4z0Var.c;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj2 : arrayList5) {
                    if (((r6i1) obj2).b) {
                        arrayList6.add(obj2);
                    }
                }
                ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
                Iterator it2 = arrayList6.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(((r6i1) it2.next()).a);
                }
                arrayList4.add(new zub1(str, arrayList7, list));
            }
            dkn dknVar2 = new dkn(dknVar.a, dknVar.b, dknVar.c, dknVar.d, arrayList4);
            csoVar.a = arrayList;
            csoVar.d = 1;
            objB = eg40Var.b(dknVar2, csoVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = csoVar.a;
            hm5.M(objB);
        }
        return new mv20(arrayList, (ekn) objB);
    }

    public void g0(int i, long j) {
        ((rwg) this.b).C(i, j);
    }

    public Object get() {
        switch (this.a) {
            case 8:
                return new DispatcherWorker(((lie) this.b).f);
            default:
                return new DispatcherWorker(((qko) this.b).c);
        }
    }

    public String getImageUri() {
        List list;
        Object next;
        pjw0 pjw0Var = (pjw0) this.b;
        if (pjw0Var != null) {
            mjw0 mjw0Var = pjw0Var.b;
            mjw0 mjw0Var2 = mjw0Var instanceof mjw0 ? mjw0Var : null;
            z6j1 z6j1Var = mjw0Var2 != null ? mjw0Var2.a : null;
            if (z6j1Var != null && (list = z6j1Var.b.a) != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((up70) next).b != vp70.d);
                up70 up70Var = (up70) next;
                if (up70Var != null) {
                    return up70Var.a.a;
                }
            }
        }
        return null;
    }

    public jhm h(String str) {
        return new jhm("genalpha_block", pox.c, (fhm) null, 2131956167, (String) null, false, (tm81) null, new ihm(new bhm(2), new ghm(rza.a1, rza.b1), new kd8((Object) this, (Object) str, (byte) 22)), 244);
    }

    public void h0(int i, List list, boolean z) {
        boolean z2 = list instanceof t4f0;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rwgVar.C(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += rwg.g(((Long) list.get(i3)).longValue());
            }
            rwgVar.B(iG);
            while (i2 < list.size()) {
                rwgVar.D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        t4f0 t4f0Var = (t4f0) list;
        if (!z) {
            while (i2 < t4f0Var.c) {
                rwgVar.C(i, t4f0Var.e(i2));
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < t4f0Var.c; i4++) {
            iG2 += rwg.g(t4f0Var.e(i4));
        }
        rwgVar.B(iG2);
        while (i2 < t4f0Var.c) {
            rwgVar.D(t4f0Var.e(i2));
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    public String i() {
        y6j1 y6j1Var;
        pjw0 pjw0Var = (pjw0) this.b;
        if (pjw0Var != null) {
            mjw0 mjw0Var = pjw0Var.b;
            mjw0 mjw0Var2 = mjw0Var instanceof mjw0 ? mjw0Var : null;
            z6j1 z6j1Var = mjw0Var2 != null ? mjw0Var2.a : null;
            if (z6j1Var != null) {
                y6j1Var = z6j1Var.a;
            } else {
                y6j1Var = null;
            }
        } else {
            y6j1Var = null;
        }
        x6j1 x6j1Var = y6j1Var instanceof x6j1 ? (x6j1) y6j1Var : null;
        if (x6j1Var != null) {
            return x6j1Var.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(rqn rqnVar, ArrayList arrayList, String str, o8d o8dVar, onm onmVar) {
        njn njnVar;
        i8d h8dVar;
        if (onmVar instanceof njn) {
            njnVar = (njn) onmVar;
            int i = njnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                njnVar.c = i - Integer.MIN_VALUE;
            } else {
                njnVar = new njn(this, onmVar);
            }
        } else {
            njnVar = new njn(this, onmVar);
        }
        Object objE = njnVar.a;
        int i2 = njnVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objE);
                if (rqnVar instanceof qqn) {
                    h8dVar = new i8d(arrayList, o8dVar, ((qqn) rqnVar).a, ((qqn) rqnVar).b, str);
                } else {
                    if (!(rqnVar instanceof pqn)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h8dVar = new h8d((String) o7h.q0(arrayList), o8dVar);
                }
                bfd bfdVar = (bfd) this.b;
                njnVar.c = 1;
                objE = bfdVar.e(h8dVar, njnVar);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objE);
            }
            return (goe) objE;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    public Single l(Intent intent, th61 th61Var) {
        ru9 ru9Var = (ru9) this.b;
        return rqt0.F((q8n) ru9Var.d, new sxa(ru9Var, intent, th61Var, (lnm) null, (byte) 26)).onErrorReturn(uh21.P0).observeOn((Scheduler) ru9Var.b);
    }

    public ixl1 m() {
        return (vvb0) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(String str, onm onmVar) {
        q6m q6mVar;
        if (onmVar instanceof q6m) {
            q6mVar = (q6m) onmVar;
            int i = q6mVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q6mVar.c = i - Integer.MIN_VALUE;
            } else {
                q6mVar = new q6m(this, onmVar);
            }
        } else {
            q6mVar = new q6m(this, onmVar);
        }
        Object objZ = q6mVar.a;
        int i2 = q6mVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objZ);
                v1k v1kVar = (v1k) this.b;
                q6mVar.c = 1;
                objZ = v1kVar.z(str, q6mVar);
                d9n d9nVar = d9n.a;
                if (objZ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objZ);
            }
            return (c380) objZ;
        } catch (Exception unused) {
            return fg91.b;
        }
    }

    public void o(Exception exc) {
        CreateCredentialException createCredentialException = (CreateCredentialException) exc;
        ohd ohdVar = (ohd) this.b;
        if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith(new m231(createCredentialException));
        }
    }

    public tq71 p() {
        tjq tjqVar = (tjq) this.b;
        Context context = (Context) tjqVar.b;
        return new tq71(context, new r961(new i2i1((kq71) ((RetrofitMaker) tjqVar.e).createWebgateService(kq71.class, "android-share-shareables-impl"), (byte) 10), new mhc((byte) 9), new wb00((xmu0) tjqVar.d, (byte) 17), (byte) 8), new cab((Object) mid.t((lid) tjqVar.a), tjqVar.c, (Object) context, (byte) 19));
    }

    public void q(String str, String str2, tv80 tv80Var, nk51 nk51Var) {
        ((yhm) this.b).a(new z73(str, new lik1(str2), str2, new mb3(true, true, false, null, str, false, 0, false, false, nk51Var, false, null, 226549)), tv80Var);
    }

    public void r(int i, boolean z) {
        ((rwg) this.b).j(i, z);
    }

    public void s(int i, List list, boolean z) {
        boolean z2 = list instanceof zob;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rwgVar.j(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            rwgVar.B(i3);
            while (i2 < list.size()) {
                rwgVar.i(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zob zobVar = (zob) list;
        if (!z) {
            while (i2 < zobVar.c) {
                zobVar.d(i2);
                rwgVar.j(i, zobVar.b[i2]);
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zobVar.c; i6++) {
            zobVar.d(i6);
            boolean z3 = zobVar.b[i6];
            i5++;
        }
        rwgVar.B(i5);
        while (i2 < zobVar.c) {
            zobVar.d(i2);
            rwgVar.i(zobVar.b[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public void t(int i, phc phcVar) {
        ((rwg) this.b).l(i, phcVar);
    }

    public void u(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((rwg) this.b).l(i, (phc) list.get(i2));
        }
    }

    public void v(Object obj) {
        EncoreViewStub encoreViewStubFindViewById;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        avn avnVar = (avn) this.b;
        if (avnVar.P0 && zBooleanValue && (encoreViewStubFindViewById = avnVar.V0.findViewById(2131428384)) != null) {
            encoreViewStubFindViewById.setVisibility(0);
            ComposeView composeView = new ComposeView(encoreViewStubFindViewById.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            composeView.setContent(ygi.b);
            k8p1.o(encoreViewStubFindViewById, composeView);
        }
    }

    public void w(Object obj) {
        rz40 rz40Var = (rz40) obj;
        v5q v5qVar = (v5q) this.b;
        rz40Var.I1 = (k0s) v5qVar.d5.get();
        rz40Var.H1 = new dh30(new rp5((Context) v5qVar.b.x1.a, new n9x0(false)), mc40.p((Activity) v5qVar.i.a), (byte) 10);
        rz40Var.J1 = (ujb1) v5qVar.c5.get();
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(655);
        ((FrameLayout) ((jbn) this.b).a.b).setPadding(nk80VarI.a, nk80VarI.b, nk80VarI.c, nk80VarI.d);
        return hsl1.b;
    }

    public void y(double d, int i) {
        rwg rwgVar = (rwg) this.b;
        rwgVar.getClass();
        rwgVar.p(i, Double.doubleToRawLongBits(d));
    }

    public void z(int i, List list, boolean z) {
        boolean z2 = list instanceof uqu;
        rwg rwgVar = (rwg) this.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                    rwgVar.getClass();
                    rwgVar.p(i, Double.doubleToRawLongBits(dDoubleValue));
                    i2++;
                }
                return;
            }
            rwgVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            rwgVar.B(i3);
            while (i2 < list.size()) {
                rwgVar.q(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        uqu uquVar = (uqu) list;
        if (!z) {
            while (i2 < uquVar.c) {
                uquVar.d(i2);
                double d = uquVar.b[i2];
                rwgVar.getClass();
                rwgVar.p(i, Double.doubleToRawLongBits(d));
                i2++;
            }
            return;
        }
        rwgVar.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < uquVar.c; i6++) {
            uquVar.d(i6);
            double d2 = uquVar.b[i6];
            i5 += 8;
        }
        rwgVar.B(i5);
        while (i2 < uquVar.c) {
            uquVar.d(i2);
            rwgVar.q(Double.doubleToRawLongBits(uquVar.b[i2]));
            i2++;
        }
    }

    public i6b(k kVar) {
        this.a = (byte) 18;
        this.b = kVar.e(bil.class);
    }

    public i6b(rwg rwgVar) {
        this.a = (byte) 13;
        l290.a(rwgVar, "output");
        this.b = rwgVar;
        rwgVar.a = this;
    }

    public /* synthetic */ i6b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public i6b(CameraCaptureSession cameraCaptureSession, Handler handler) {
        this.a = (byte) 4;
        if (Build.VERSION.SDK_INT >= 28) {
            this.b = new r2d(cameraCaptureSession, (s2d) null);
        } else {
            this.b = new q59(cameraCaptureSession, new s2d(handler));
        }
    }
}
