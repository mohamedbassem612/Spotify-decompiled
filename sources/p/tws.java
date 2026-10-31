package p;

import android.graphics.Point;
import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.car.app.model.Alert;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class tws implements bxs, Function, nzc, ci7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tws(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        o6x o6xVar = o6x.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (b) {
            case 1:
                vvc0 vvc0Var = (vvc0) obj5;
                String str = (String) obj4;
                return yoi1.i(new yvc0(vvc0Var.b.k(str, (trc0) obj), (fkv) obj3, (byte) 0), o6xVar).distinctUntilChanged().doOnError(k530.Z0).doOnNext(k530.a1).doOnComplete(ps4.Q0).switchMap(new k65(vvc0Var, str, (ObservableRefCount) obj2, (byte) 11));
            case 2:
                vvc0 vvc0Var2 = (vvc0) obj5;
                String str2 = (String) obj4;
                return rqt0.F(o6xVar, new z290(vvc0Var2.b, str2, (trc0) obj, (fkv) obj3, (lnm) null, (byte) 8)).flatMap(new k65(vvc0Var2, str2, (Observable) obj2, (byte) 12));
            default:
                oh61 oh61Var = (oh61) obj5;
                String strG = (String) obj4;
                PreparePlayOptions preparePlayOptionsBuild = (PreparePlayOptions) obj3;
                String str3 = (String) obj2;
                LoggingParams loggingParams = (LoggingParams) obj;
                wyu0 wyu0VarC = oxu0.a.c(strG);
                if ((wyu0VarC instanceof wyu0 ? wyu0VarC : null) != null) {
                    Set set = s4b1.f;
                    strG = uic.x(uic.x(strG).A("playlist:")).G(1, 2);
                }
                String str4 = strG;
                String str5 = ((m210) oh61Var.s.c).b;
                Set set2 = s4b1.f;
                s4b1 s4b1VarX = uic.x(str4);
                if (!"9cc4aaeb43f24b098cff096385f00233".equals(str5) || s4b1VarX.c != blc0.ti) {
                    return oh61Var.c.c().e(new z610(str4, (Context) null, Collections.EMPTY_MAP, preparePlayOptionsBuild, oh61.d(str3), loggingParams));
                }
                m5a1 m5a1Var = oh61Var.x;
                PlayOrigin playOriginD = oh61.d(str3);
                m5a1Var.getClass();
                gg11 gg11VarL = j380.l("autoplay_candidate", "false");
                if (preparePlayOptionsBuild == null) {
                    preparePlayOptionsBuild = PreparePlayOptions.builder().build();
                }
                Suppressions suppressions = (Suppressions) preparePlayOptionsBuild.suppressions().h();
                HashSet hashSet = new HashSet((Collection) (suppressions != null ? suppressions.providers() : Collections.EMPTY_SET));
                hashSet.add("mft/inject_random_tracks");
                Suppressions suppressionsCreate = Suppressions.create(hashSet);
                PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
                Boolean bool = Boolean.FALSE;
                return m5a1Var.a.c().e(new z610(str4, (Context) null, gg11VarL, preparePlayOptionsBuild.toBuilder().suppressions(suppressionsCreate).playerOptionsOverride(builder.repeatingContext(bool).repeatingTrack(bool).shufflingContext(bool).build()).build(), playOriginD, loggingParams));
        }
    }

    public Object attachCompleter(mzc mzcVar) {
        String str;
        hdd1 hdd1Var = (hdd1) this.c;
        List list = (List) this.b;
        mp8 mp8Var = (mp8) this.d;
        jb61 jb61Var = (jb61) this.e;
        synchronized (hdd1Var.a) {
            synchronized (hdd1Var.a) {
                synchronized (hdd1Var.a) {
                    try {
                        List list2 = hdd1Var.k;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((j2t) it.next()).b();
                            }
                            hdd1Var.k = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!list.isEmpty()) {
                    int i = 0;
                    do {
                        try {
                            ((j2t) list.get(i)).d();
                            i++;
                        } catch (DeferrableSurface$SurfaceClosedException e) {
                            for (int i2 = i - 1; i2 >= 0; i2--) {
                                ((j2t) list.get(i2)).b();
                            }
                            throw e;
                        }
                    } while (i < list.size());
                }
                hdd1Var.k = list;
            }
            o0c.q("The openCaptureSessionCompleter can only set once!", hdd1Var.i == null);
            hdd1Var.i = mzcVar;
            ((it8) mp8Var.b).i(jb61Var);
            str = "openCaptureSession[session=" + hdd1Var + "]";
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    public bg11 b(int i, pnf1 pnf1Var, int[] iArr) {
        int i2;
        int i3;
        int i4;
        pnf1 pnf1Var2 = pnf1Var;
        zws zwsVar = (zws) this.c;
        String str = (String) this.b;
        int[] iArr2 = (int[]) this.d;
        Point point = (Point) this.e;
        int i5 = iArr2[i];
        int i6 = point != null ? point.x : zwsVar.i;
        int i7 = point != null ? point.y : zwsVar.j;
        boolean z = zwsVar.l;
        if (i6 == Integer.MAX_VALUE || i7 == Integer.MAX_VALUE) {
            i2 = Alert.DURATION_SHOW_INDEFINITELY;
        } else {
            int i8 = Integer.MAX_VALUE;
            for (int i9 = 0; i9 < pnf1Var2.a; i9++) {
                ie30 ie30Var = pnf1Var2.d[i9];
                int i10 = ie30Var.w;
                int i11 = ie30Var.x;
                if (i10 > 0 && i11 > 0) {
                    if (!z) {
                        i3 = i7;
                        i4 = i6;
                    } else if ((i10 > i11) != (i6 > i7)) {
                        i4 = i7;
                        i3 = i6;
                    } else {
                        i3 = i7;
                        i4 = i6;
                    }
                    int i12 = i10 * i3;
                    int i13 = i11 * i4;
                    Point point2 = i12 >= i13 ? new Point(i4, zoi1.g(i13, i10)) : new Point(zoi1.g(i12, i11), i3);
                    int i14 = ie30Var.w;
                    int i15 = i14 * i11;
                    if (i14 >= ((int) (point2.x * 0.98f)) && i11 >= ((int) (point2.y * 0.98f)) && i15 < i8) {
                        i8 = i15;
                    }
                }
            }
            i2 = i8;
        }
        v280 v280VarM = b380.m();
        int i16 = 0;
        while (i16 < pnf1Var2.a) {
            int iC = pnf1Var2.d[i16].c();
            v280VarM.c(new dxs(i, pnf1Var2, i16, zwsVar, iArr[i16], str, i5, i2 == Integer.MAX_VALUE || (iC != -1 && iC <= i2)));
            i16++;
            pnf1Var2 = pnf1Var;
        }
        return v280VarM.g();
    }

    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public n8d0 m711apply(Object obj) {
        hdd1 hdd1Var = (hdd1) this.c;
        CameraDevice cameraDevice = (CameraDevice) this.b;
        jb61 jb61Var = (jb61) this.d;
        List list = (List) this.e;
        if (hdd1Var.v.b) {
            Iterator it = hdd1Var.b.i().iterator();
            while (it.hasNext()) {
                ((hdd1) it.next()).j();
            }
        }
        hdd1Var.l("start openCaptureSession");
        synchronized (hdd1Var.a) {
            try {
                if (hdd1Var.m) {
                    return new e280(new CancellationException("Opener is disabled"), (byte) 1);
                }
                a680 a680Var = hdd1Var.b;
                synchronized (a680Var.b) {
                    ((LinkedHashSet) a680Var.e).add(hdd1Var);
                }
                pzc pzcVarT = upn1.t(new tws(hdd1Var, list, new mp8(cameraDevice, hdd1Var.c), jb61Var, (byte) 4));
                hdd1Var.h = pzcVarT;
                c681 c681Var = new c681(hdd1Var, (byte) 20);
                pzcVarT.b(new nx30(pzcVarT, c681Var, (byte) 0), n5u.a());
                return poz0.F(hdd1Var.h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
