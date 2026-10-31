package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.common.drm.DrmException;
import com.spotify.betamax.common.drm.DrmLicenseServerException;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.home.slotloading.events.proto.LayoutLoadingErrorEvent;
import com.spotify.home.slotloading.events.proto.LayoutLoadingEvent;
import com.spotify.home.slotloading.events.proto.SlotContentLoadingErrorEvent;
import com.spotify.home.slotloading.events.proto.SlotContentLoadingEvent;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ua91 implements Predicate, Function, yjh0, imh0 {
    public static ua91 f;
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public ua91(long j, long j2, long j3) {
        this.a = (byte) 27;
        this.b = v8r.q(new Size(j));
        this.c = v8r.q(new Offset(j2));
        this.d = v8r.q(new Offset(j3));
        this.e = v8r.q(new Offset(j2));
    }

    public static ua91 F() {
        ua91 ua91Var = f;
        if (ua91Var != null) {
            return ua91Var;
        }
        ua91 ua91Var2 = new ua91();
        f = ua91Var2;
        return ua91Var2;
    }

    public static ua91 K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131626231, viewGroup, false);
        int i = 2131428179;
        EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131428179);
        if (encoreButtonT != null) {
            i = 2131428647;
            if (m5n1.t(constraintLayoutInflate, 2131428647) != null) {
                i = 2131430000;
                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131430000);
                if (textView != null) {
                    i = 2131431070;
                    if (m5n1.t(constraintLayoutInflate, 2131431070) != null) {
                        i = 2131431226;
                        if (((TextView) m5n1.t(constraintLayoutInflate, 2131431226)) != null) {
                            i = 2131431227;
                            RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131431227);
                            if (recyclerViewT != null) {
                                i = 2131431228;
                                if (((TextView) m5n1.t(constraintLayoutInflate, 2131431228)) != null) {
                                    return new ua91((Object) constraintLayoutInflate, (Object) encoreButtonT, (Object) textView, (Object) recyclerViewT, (byte) 29);
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public void A(String str, List list, String str2, String str3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            Maybe maybeFilter = Single.create(new oj80(str4, (eo0) this.c, (byte) 10)).subscribeOn((Scheduler) this.e).filter(s9x0.R0);
            maybeFilter.getClass();
            maybeFilter.f(Functions.b(w3i1.class)).subscribe(new lba((byte) 3, str4, this, str, str2, str3));
        }
    }

    public y0d1 B(o60 o60Var) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            y0d1 y0d1Var = (y0d1) arrayList.get(i);
            if (y0d1Var != null && y0d1Var.b == o60Var) {
                return y0d1Var;
            }
        }
        y0d1 y0d1Var2 = new y0d1((Context) this.c, o60Var);
        arrayList.add(y0d1Var2);
        return y0d1Var2;
    }

    public mmr0 C(List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        if (list.isEmpty()) {
            hhg1.n("No base URLs");
            return null;
        }
        String str = (String) list.get(0);
        Iterator it = list.iterator();
        int iIntValue = Integer.MAX_VALUE;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            String strA = v2b1.a(Uri.parse(str2));
            if (strA != null) {
                Integer num = (Integer) linkedHashMap.get(strA);
                int iIntValue2 = num != null ? num.intValue() : 0;
                if (iIntValue2 >= 2) {
                    Long l = (Long) ((LinkedHashMap) this.c).get(strA);
                    long jLongValue = l != null ? l.longValue() : -1L;
                    if (jLongValue != -1 && 30000 * ((long) Math.pow(2.0d, Math.min(iIntValue2 - 2, 6))) > ((yqg) this.b).e() - jLongValue) {
                        Integer num2 = (Integer) linkedHashMap.get(strA);
                        if ((num2 != null ? num2.intValue() : Integer.MAX_VALUE) < iIntValue) {
                            Integer num3 = (Integer) linkedHashMap.get(strA);
                            iIntValue = num3 != null ? num3.intValue() : Integer.MAX_VALUE;
                            str = str2;
                        }
                    }
                }
                return new mmr0(str2, Boolean.FALSE);
            }
        }
        return new mmr0(str, Boolean.TRUE);
    }

    public boolean D() {
        Restrictions restrictions;
        t380 t380VarDisallowSleepTimerClearReasons;
        xe01 xe01Var = (xe01) this.e;
        boolean z = false;
        if (xe01Var != null && (restrictions = (Restrictions) xe01Var.a.getValue()) != null && (t380VarDisallowSleepTimerClearReasons = restrictions.disallowSleepTimerClearReasons()) != null && !t380VarDisallowSleepTimerClearReasons.isEmpty()) {
            z = true;
        }
        return !z;
    }

    public boolean E() {
        Restrictions restrictions;
        t380 t380VarDisallowSleepTimerDurationReasons;
        xe01 xe01Var = (xe01) this.e;
        boolean z = false;
        if (xe01Var != null && (restrictions = (Restrictions) xe01Var.a.getValue()) != null && (t380VarDisallowSleepTimerDurationReasons = restrictions.disallowSleepTimerDurationReasons()) != null && !t380VarDisallowSleepTimerDurationReasons.isEmpty()) {
            z = true;
        }
        return !z;
    }

    public android.util.Size[] G(int i) {
        HashMap map = (HashMap) this.d;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((android.util.Size[]) map.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (android.util.Size[]) ((android.util.Size[]) map.get(Integer.valueOf(i))).clone();
        }
        android.util.Size[] outputSizes = ((StreamConfigurationMap) ((ezb1) this.b).b).getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            j2h1.M("StreamConfigurationMapCompat");
            return outputSizes;
        }
        android.util.Size[] sizeArrC = ((zhq0) this.c).c(outputSizes, i);
        map.put(Integer.valueOf(i), sizeArrC);
        return (android.util.Size[]) sizeArrC.clone();
    }

    public ConstraintLayout H() {
        return (ConstraintLayout) this.b;
    }

    public mr20 I() {
        return (mr20) this.e;
    }

    public long J() {
        return ((Size) ((hrr0) this.b).getValue()).a;
    }

    public boolean L(eda edaVar) {
        et91 et91Var = (et91) this.d;
        return (et91Var == null || edaVar == null || et91Var.a.get() != edaVar) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x023b  */
    /* JADX WARN: Code duplicated, block: B:126:0x023f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0241  */
    /* JADX WARN: Code duplicated, block: B:131:0x024d  */
    /* JADX WARN: Code duplicated, block: B:132:0x024f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0252  */
    /* JADX WARN: Code duplicated, block: B:136:0x0255 A[PHI: r4
      0x0255: PHI (r4v22 int) = (r4v20 int), (r4v23 int) binds: [B:131:0x024d, B:135:0x0253] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x0257 A[Catch: all -> 0x0264, CancellationException -> 0x026c, TryCatch #1 {all -> 0x0264, blocks: (B:129:0x0245, B:137:0x0257, B:138:0x025c, B:141:0x0260), top: B:186:0x0245 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x025d  */
    /* JADX WARN: Code duplicated, block: B:140:0x025f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0273  */
    /* JADX WARN: Code duplicated, block: B:150:0x0278 A[Catch: CancellationException -> 0x026c, all -> 0x02aa, TRY_LEAVE, TryCatch #4 {all -> 0x02aa, blocks: (B:121:0x0231, B:148:0x0274, B:150:0x0278), top: B:191:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:169:0x02de A[Catch: all -> 0x02ef, TRY_ENTER, TryCatch #7 {all -> 0x02ef, blocks: (B:169:0x02de, B:171:0x02e7, B:174:0x02f1, B:175:0x02f7, B:177:0x02fa, B:178:0x0301, B:179:0x0307), top: B:197:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x02e7 A[Catch: all -> 0x02ef, TryCatch #7 {all -> 0x02ef, blocks: (B:169:0x02de, B:171:0x02e7, B:174:0x02f1, B:175:0x02f7, B:177:0x02fa, B:178:0x0301, B:179:0x0307), top: B:197:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x02fa A[Catch: all -> 0x02ef, TryCatch #7 {all -> 0x02ef, blocks: (B:169:0x02de, B:171:0x02e7, B:174:0x02f1, B:175:0x02f7, B:177:0x02fa, B:178:0x0301, B:179:0x0307), top: B:197:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0245 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x029f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x030c: IGET (r2 I:java.lang.Object) = (r12 I:p.p811) A[Catch: all -> 0x0313] (LINE:781) p.p811.a java.lang.Object, block:B:180:0x0308 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0310: INVOKE (r1v2 ?? I:p.tp60), (r13 I:p.fq60), (r2 I:p.cq60) INTERFACE call: p.tp60.b(p.fq60, p.cq60):void A[Catch: all -> 0x0313, MD:(p.fq60, p.cq60):void (m), TRY_LEAVE] (LINE:785), block:B:180:0x0308 */
    /* JADX WARN: Type inference failed for: r12v0, types: [p.p811] */
    public Object M(ef91 ef91Var, ice0 ice0Var, boolean z, String str, hp60 hp60Var, onm onmVar) {
        re91 re91Var;
        ?? r12;
        fq60 fq60VarB;
        t45 t45Var;
        kq60 kq60Var;
        fq60 m231Var;
        fq60 fq60Var;
        p811 p811Var;
        String lowerCase;
        int i;
        int i2;
        int i3;
        ef91 ef91Var2;
        int i4;
        UUID uuid;
        int i5;
        UUID uuid2;
        Long l;
        String str2;
        nd91 nd91Var;
        int iOrdinal;
        int i6;
        bq60 bq60Var;
        int iOrdinal2;
        int i7;
        if (onmVar instanceof re91) {
            re91Var = (re91) onmVar;
            int i8 = re91Var.t;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                re91Var.t = i8 - Integer.MIN_VALUE;
            } else {
                re91Var = new re91(this, onmVar);
            }
        } else {
            re91Var = new re91(this, onmVar);
        }
        Object objInvoke = re91Var.h;
        d9n d9nVar = d9n.a;
        int i9 = re91Var.t;
        try {
            if (i9 == 0) {
                hm5.M(objInvoke);
                try {
                    t45 t45VarA = ((zle1) this.b).a("load_home_slot");
                    String strName = ef91Var.name();
                    Locale locale = Locale.ROOT;
                    t45VarA.a("slot_type", strName.toLowerCase(locale));
                    t45VarA.a("loading_strategy", ice0Var.name().toLowerCase(locale));
                    t45VarA.a("is_connected", String.valueOf(z));
                    t45.m(t45VarA, "load_slot_content", 4);
                    t45Var = t45VarA;
                } catch (Exception unused) {
                    t45Var = null;
                }
                int iOrdinal3 = ef91Var.ordinal();
                if (iOrdinal3 == 0) {
                    kq60Var = kq60.W0;
                } else if (iOrdinal3 == 1) {
                    kq60Var = kq60.T0;
                } else if (iOrdinal3 == 2) {
                    kq60Var = kq60.U0;
                } else {
                    if (iOrdinal3 != 3) {
                        eg.o();
                        return null;
                    }
                    kq60Var = kq60.V0;
                }
                try {
                    m231Var = ((tp60) this.c).d(kq60Var);
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                fq60Var = m231Var;
                p811Var = new p811();
                lowerCase = ef91Var.name().toLowerCase(Locale.ROOT);
                qlb0 qlb0Var = (qlb0) ((pb00) this.e).d;
                UUID uuid3 = qlb0Var != null ? qlb0Var.a : null;
                Integer num = qlb0Var != null ? qlb0Var.b : null;
                int i10 = ice0Var == ice0.a ? 1 : 0;
                if (uuid3 == null || num == null) {
                    d9nVar = d9nVar;
                    i10 = i10;
                    i = 1;
                    i2 = 0;
                    i3 = 4;
                } else {
                    if (str != null) {
                        wo60 wo60Var = (wo60) this.d;
                        synchronized (wo60Var) {
                            i = 1;
                            uo60 uo60Var = wo60Var.c;
                            if (uo60Var != null && !u890.j(uo60Var.b, str)) {
                                String str3 = uo60Var.b;
                                uo60Var.b = str;
                                hhp0.a.t("page.home.slot_loading", "home_session_changed", sqg0.J(new mmr0[]{new mmr0("load_id", uo60Var.a.toString()), new mmr0("previous_session_id", str3), new mmr0("current_session_id", str)}));
                            }
                        }
                    } else {
                        i = 1;
                    }
                    wo60 wo60Var2 = (wo60) this.d;
                    int iIntValue = num.intValue();
                    synchronized (wo60Var2) {
                        try {
                            uo60 uo60Var2 = wo60Var2.c;
                            if (uo60Var2 == null) {
                                i2 = 0;
                            } else if (uo60Var2.a.equals(uuid3) && uo60Var2.g == iIntValue) {
                                vo60 vo60Var = (vo60) uo60Var2.i.get(lowerCase);
                                if (vo60Var != null) {
                                    if ((vo60Var.q != 0 ? i : 0) == 0 && vo60Var.a == iIntValue) {
                                        wma1 wma1Var = vo60Var.d;
                                        if (wma1Var != null) {
                                            l = null;
                                            wma1Var.a((Long) null);
                                        } else {
                                            l = null;
                                        }
                                        vo60Var.d = vo60Var.b.c(l, "revalidate");
                                        vo60Var.g++;
                                        i2 = 0;
                                        vo60Var.l = false;
                                    }
                                }
                                i2 = 0;
                                uo60Var2.h.add(lowerCase);
                                i3 = 4;
                                nif1 nif1VarL = ihp0.l(hhp0.a, "page.home.load_slot", uuid3 + ":" + lowerCase, 4);
                                nif1VarL.setAttribute("load_id", uuid3.toString());
                                nif1VarL.setAttribute("layout_revision", String.valueOf(iIntValue));
                                nif1VarL.setAttribute("slot_type", lowerCase);
                                uo60Var2.i.put(lowerCase, new vo60(iIntValue, nif1VarL, nif1VarL.c((Long) null, "request")));
                            } else {
                                i2 = 0;
                                i3 = 4;
                            }
                            i3 = 4;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                ef91Var2 = ef91Var;
                try {
                    try {
                        re91Var.a = ef91Var2;
                        re91Var.b = t45Var;
                        re91Var.c = fq60Var;
                        re91Var.d = p811Var;
                        re91Var.e = lowerCase;
                        re91Var.f = uuid3;
                        i4 = i10;
                        try {
                            re91Var.g = i4;
                            re91Var.t = i;
                            objInvoke = hp60Var.invoke(re91Var);
                            Object obj = d9nVar;
                            if (objInvoke == obj) {
                                return obj;
                            }
                            uuid2 = uuid3;
                            str2 = lowerCase;
                            nd91Var = (nd91) objInvoke;
                            iOrdinal = nd91Var.b.ordinal();
                            if (iOrdinal != 0) {
                                i6 = 1;
                                if (iOrdinal == 1) {
                                    i2 = 1;
                                }
                            } else {
                                i6 = 1;
                                i2 = 2;
                            }
                            if (i2 != 0) {
                                iOrdinal2 = ef91Var2.ordinal();
                                if (iOrdinal2 != 0) {
                                    i7 = i3;
                                } else if (iOrdinal2 == i6) {
                                    i7 = i6;
                                } else if (iOrdinal2 != 2) {
                                    i6 = 3;
                                    if (iOrdinal2 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i7 = i6;
                                } else {
                                    i7 = 2;
                                }
                                bq60Var = new bq60(i7, i2);
                            } else {
                                bq60Var = null;
                            }
                            p811Var.a = bq60Var;
                            if (uuid2 != null) {
                                ((wo60) this.d).r(str2, uuid2, nd91Var.b.name().toLowerCase(Locale.ROOT), nd91Var.a.size(), nd91Var.a.hashCode());
                                lowerCase = str2;
                                uuid = uuid2;
                                if (i4 == 0) {
                                    ((wo60) this.d).q(lowerCase, uuid);
                                }
                            } else {
                                lowerCase = str2;
                                uuid = uuid2;
                            }
                            T(t45Var, "succeeded", nd91Var.b.name().toLowerCase(Locale.ROOT));
                            ((tp60) this.c).b(fq60Var, (cq60) p811Var.a);
                            return nd91Var;
                        } catch (Throwable th3) {
                            th = th3;
                            i5 = i4;
                            uuid = uuid3;
                            if (uuid != null) {
                                ((wo60) this.d).p(lowerCase, uuid);
                                if (i5 == 0) {
                                    ((wo60) this.d).q(lowerCase, uuid);
                                }
                            }
                            T(t45Var, "failed", null);
                            throw th;
                        }
                    } catch (CancellationException e) {
                        e = e;
                        uuid = uuid3;
                        if (uuid != null) {
                            ((wo60) this.d).o(lowerCase, uuid);
                        }
                        T(t45Var, "cancelled", null);
                        throw e;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i4 = i10;
                }
            } else {
                if (i9 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i5 = re91Var.g;
                uuid = re91Var.f;
                lowerCase = re91Var.e;
                p811Var = re91Var.d;
                fq60Var = re91Var.c;
                t45Var = re91Var.b;
                ef91 ef91Var3 = re91Var.a;
                try {
                    try {
                        hm5.M(objInvoke);
                        i4 = i5;
                        ef91Var2 = ef91Var3;
                        uuid2 = uuid;
                        i3 = 4;
                        i2 = 0;
                        str2 = lowerCase;
                        try {
                            try {
                                nd91Var = (nd91) objInvoke;
                                iOrdinal = nd91Var.b.ordinal();
                                if (iOrdinal != 0) {
                                    i6 = 1;
                                    if (iOrdinal == 1) {
                                        i2 = 1;
                                    }
                                } else {
                                    i6 = 1;
                                    i2 = 2;
                                }
                                if (i2 != 0) {
                                    try {
                                        iOrdinal2 = ef91Var2.ordinal();
                                        if (iOrdinal2 != 0) {
                                            i7 = i3;
                                        } else if (iOrdinal2 == i6) {
                                            i7 = i6;
                                        } else if (iOrdinal2 != 2) {
                                            i6 = 3;
                                            if (iOrdinal2 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            i7 = i6;
                                        } else {
                                            i7 = 2;
                                        }
                                        bq60Var = new bq60(i7, i2);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        i5 = i4;
                                        lowerCase = str2;
                                        uuid = uuid2;
                                        if (uuid != null) {
                                            ((wo60) this.d).p(lowerCase, uuid);
                                            if (i5 == 0) {
                                                ((wo60) this.d).q(lowerCase, uuid);
                                            }
                                        }
                                        T(t45Var, "failed", null);
                                        throw th;
                                    }
                                } else {
                                    bq60Var = null;
                                }
                                p811Var.a = bq60Var;
                                if (uuid2 != null) {
                                    ((wo60) this.d).r(str2, uuid2, nd91Var.b.name().toLowerCase(Locale.ROOT), nd91Var.a.size(), nd91Var.a.hashCode());
                                    lowerCase = str2;
                                    uuid = uuid2;
                                    if (i4 == 0) {
                                        try {
                                            ((wo60) this.d).q(lowerCase, uuid);
                                        } catch (Throwable th6) {
                                            th = th6;
                                            i5 = i4;
                                            if (uuid != null) {
                                                ((wo60) this.d).p(lowerCase, uuid);
                                                if (i5 == 0) {
                                                    ((wo60) this.d).q(lowerCase, uuid);
                                                }
                                            }
                                            T(t45Var, "failed", null);
                                            throw th;
                                        }
                                    }
                                } else {
                                    lowerCase = str2;
                                    uuid = uuid2;
                                }
                                T(t45Var, "succeeded", nd91Var.b.name().toLowerCase(Locale.ROOT));
                                try {
                                    ((tp60) this.c).b(fq60Var, (cq60) p811Var.a);
                                } catch (Throwable unused2) {
                                }
                                return nd91Var;
                            } catch (Throwable th7) {
                                th = th7;
                                lowerCase = str2;
                                uuid = uuid2;
                            }
                        } catch (CancellationException e2) {
                            e = e2;
                            lowerCase = str2;
                            uuid = uuid2;
                            if (uuid != null) {
                                ((wo60) this.d).o(lowerCase, uuid);
                            }
                            T(t45Var, "cancelled", null);
                            throw e;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        if (uuid != null) {
                            ((wo60) this.d).p(lowerCase, uuid);
                            if (i5 == 0) {
                                ((wo60) this.d).q(lowerCase, uuid);
                            }
                        }
                        T(t45Var, "failed", null);
                        throw th;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    if (uuid != null) {
                        ((wo60) this.d).o(lowerCase, uuid);
                    }
                    T(t45Var, "cancelled", null);
                    throw e;
                }
            }
        } catch (Throwable th9) {
            try {
                ((tp60) this.c).b(fq60VarB, (cq60) ((p811) r12).a);
            } catch (Throwable unused3) {
            }
            throw th9;
        }
    }

    public boolean N(o60 o60Var, ysi0 ysi0Var) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(B(o60Var), new dti0((Context) this.c, ysi0Var));
    }

    public boolean O(o60 o60Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        y0d1 y0d1VarB = B(o60Var);
        jv81 jv81Var = (jv81) this.e;
        tti0 tti0Var = (Menu) jv81Var.get(menu);
        if (tti0Var == null) {
            tti0Var = new tti0((Context) this.c, (msi0) menu);
            jv81Var.put(menu, tti0Var);
        }
        return callback.onCreateActionMode(y0d1VarB, tti0Var);
    }

    public void P(eda edaVar) {
        synchronized (this.b) {
            try {
                if (L(edaVar)) {
                    et91 et91Var = (et91) this.d;
                    if (!et91Var.c) {
                        et91Var.c = true;
                        ((Handler) this.c).removeCallbacksAndMessages(et91Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Q(eda edaVar) {
        synchronized (this.b) {
            try {
                if (L(edaVar)) {
                    et91 et91Var = (et91) this.d;
                    if (et91Var.c) {
                        et91Var.c = false;
                        S(et91Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object R(Bitmap bitmap, onm onmVar) {
        n7c1 n7c1Var;
        l420 l420Var;
        Uri uri;
        if (onmVar instanceof n7c1) {
            n7c1Var = (n7c1) onmVar;
            int i = n7c1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                n7c1Var.e = i - Integer.MIN_VALUE;
            } else {
                n7c1Var = new n7c1(this, onmVar);
            }
        } else {
            n7c1Var = new n7c1(this, onmVar);
        }
        Object objA = n7c1Var.c;
        int i2 = n7c1Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            o771 o771Var = (o771) this.e;
            n7c1Var.a = bitmap;
            n7c1Var.e = 1;
            objA = n771.a(o771Var, ".png", n7c1Var);
            if (objA != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            bitmap = n7c1Var.a;
            hm5.M(objA);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l420Var = n7c1Var.b;
            hm5.M(objA);
        }
        uri = (Uri) objA;
        if (uri != null) {
            return new u57(l420Var, uri);
        }
        l420Var.deleteOnExit();
        eg.m("Failed to create StoryFileUriHolder");
        return null;
        l420 l420Var2 = (l420) objA;
        gya gyaVar = (gya) this.d;
        n7c1Var.a = null;
        n7c1Var.b = l420Var2;
        n7c1Var.e = 2;
        Object objA2 = eya.a(gyaVar, bitmap, l420Var2, n7c1Var);
        if (objA2 != d9nVar) {
            objA = objA2;
            l420Var = l420Var2;
            uri = (Uri) objA;
            if (uri != null) {
                return new u57(l420Var, uri);
            }
            l420Var.deleteOnExit();
            eg.m("Failed to create StoryFileUriHolder");
            return null;
        }
        return d9nVar;
    }

    public void S(et91 et91Var) {
        Handler handler = (Handler) this.c;
        int i = et91Var.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(et91Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, et91Var), i);
    }

    public void T(t45 t45Var, String str, String str2) {
        if (t45Var == null) {
            return;
        }
        try {
            t45Var.g("load_slot_content");
            t45Var.a("outcome", str);
            if (str2 != null) {
                t45Var.a("load_source", str2);
            }
            ((zle1) this.b).b(t45Var.e());
        } catch (Exception unused) {
        }
    }

    public void U() {
        et91 et91Var = (et91) this.e;
        if (et91Var != null) {
            this.d = et91Var;
            this.e = null;
            eda edaVar = (eda) et91Var.a.get();
            if (edaVar == null) {
                this.d = null;
            } else {
                Handler handler = kda.p;
                handler.sendMessage(handler.obtainMessage(0, edaVar.a));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object V(List list, lnm lnmVar) throws Throwable {
        zp91 zp91Var;
        Object m231Var;
        g871 g871Var;
        Throwable th;
        List list2;
        List listA1;
        List listA2 = (cmt) this.e;
        if (lnmVar instanceof zp91) {
            zp91Var = (zp91) lnmVar;
            int i = zp91Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zp91Var.g = i - Integer.MIN_VALUE;
            } else {
                zp91Var = new zp91(this, (onm) lnmVar);
            }
        } else {
            zp91Var = new zp91(this, (onm) lnmVar);
        }
        Object objA = zp91Var.e;
        int i2 = zp91Var.g;
        Object obj = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                listA2 = o7h.a1(qyo1.t(list, ((cmt) listA2).a), new os6(((cmt) listA2).a, (byte) 1));
                b751 b751Var = new b751(this, (lnm) null, (byte) 26);
                zp91Var.a = listA2;
                zp91Var.g = 1;
                objA = rc2.M(1000L, b751Var, zp91Var);
                if (objA == obj) {
                }
                return obj;
            }
            if (i2 == 1) {
                listA2 = zp91Var.a;
                hm5.M(objA);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g871Var = zp91Var.d;
                Throwable th2 = zp91Var.c;
                m231Var = zp91Var.b;
                List list3 = zp91Var.a;
                hm5.M(objA);
                list2 = list3;
                th = th2;
            }
            Object obj2 = m231Var;
            vyo1.y(g871Var, (k771) objA, th, (p371) null, (ela1) null, (o571) null, (String) null, 60);
            listA2 = list2;
            m231Var = obj2;
            if (m231Var instanceof m231) {
                return listA2;
            }
            return m231Var;
            ArrayList arrayList = ((v571) objA).a;
            if (!listA2.isEmpty() && !arrayList.isEmpty()) {
                List list4 = listA2;
                listA1 = o7h.r1(list4, arrayList).isEmpty() ? listA2 : o7h.a1(list4, new xvd(arrayList, (byte) 25));
            }
            m231Var = listA1;
        } catch (Throwable th3) {
            m231Var = new m231(th3);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        Throwable thA2 = e331.a(m231Var);
        if (thA2 != null) {
            Logger.e(thA2, "Smart sorting destinations request failed", new Object[0]);
            boolean z = thA2 instanceof TimeoutCancellationException;
            g871 g871Var2 = (g871) this.c;
            if (!z) {
                u690 u690Var = (u690) this.d;
                zp91Var.a = listA2;
                zp91Var.b = m231Var;
                zp91Var.c = thA2;
                zp91Var.d = g871Var2;
                zp91Var.g = 2;
                objA = u690Var.a(k771.Z, zp91Var);
                if (objA != obj) {
                    g871Var = g871Var2;
                    th = thA2;
                    list2 = listA2;
                    Object obj3 = m231Var;
                    vyo1.y(g871Var, (k771) objA, th, (p371) null, (ela1) null, (o571) null, (String) null, 60);
                    listA2 = list2;
                    m231Var = obj3;
                }
                return obj;
            }
            vyo1.y(g871Var2, k771.N0, thA2, (p371) null, (ela1) null, (o571) null, (String) null, 60);
        }
        if (m231Var instanceof m231) {
            return listA2;
        }
        return m231Var;
    }

    public void a(Bundle bundle) {
        ((yjh0) this.b).a(bundle);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 8:
                Scheduler scheduler = (Scheduler) obj2;
                return ((g0l) obj3).j().map(wbx0.P0).filter(ybx0.P0).firstOrError().map(hcx0.P0).timeout(5000L, TimeUnit.MILLISECONDS, scheduler, Single.error(new TimeoutException())).doOnError(new z0u0((byte) 19, new Object[0], "Failed getting local device id")).compose(new s2a1((s1a1) obj, (n381) this.d, scheduler, (r1a1) this.e)).onErrorReturn(n9x0.O0).toObservable();
            case 9:
                x1a1 x1a1Var = (x1a1) obj;
                String string = UUID.randomUUID().toString();
                Scheduler scheduler2 = (Scheduler) obj2;
                Single singleDoOnError = ((g0l) obj3).j().map(wbx0.P0).filter(ybx0.P0).firstOrError().map(hcx0.P0).timeout(5000L, TimeUnit.MILLISECONDS, scheduler2, Single.error(new TimeoutException())).doOnError(new z0u0((byte) 19, new Object[0], "Failed getting local device id"));
                String str = x1a1Var.a;
                boolean z = x1a1Var.b;
                return singleDoOnError.compose(new a3a1(x1a1Var.e, (n381) this.d, str, x1a1Var.c, z, string, scheduler2)).compose(new yt91((g2z) this.e, x1a1Var, string, (byte) 4)).map(new up41(x1a1Var, (byte) 16)).toObservable().onErrorReturn(new nl51(x1a1Var, (byte) 17));
            default:
                Single singleDelaySubscription = (Single) obj3;
                Scheduler scheduler3 = (Scheduler) obj2;
                long j = ((y9c1) obj).c;
                if (j > 0) {
                    singleDelaySubscription = singleDelaySubscription.delaySubscription(j, TimeUnit.MILLISECONDS, scheduler3);
                }
                return singleDelaySubscription.doOnSuccess(new oac1((ptj) this.d, (byte) 0)).map(c4x0.R0).toObservable().startWithItem(s4c1.a).onErrorReturn(new acn1((String) this.e, (byte) 14)).map(e4x0.Q0);
        }
    }

    public void b(long j, int i, int i2, int i3) {
        ((yjh0) this.b).b(j, i, i2, i3);
    }

    public void c(int i, oco ocoVar, long j, int i2) {
        yjh0 yjh0Var = (yjh0) this.b;
        o5n o5nVar = (o5n) this.c;
        if (o5nVar == null) {
            yjh0Var.c(i, ocoVar, j, i2);
            return;
        }
        byte[] bArr = ocoVar.b;
        if (bArr == null) {
            throw new MediaCodec.CryptoException(6, "error 15-92");
        }
        int[] iArr = a860.a;
        if (o5nVar.b.W(new rpt0(a860.k(bArr, d860.d).substring(0, 32))) instanceof aqt0) {
            yjh0Var.c(i, ocoVar, j, i2);
            return;
        }
        n(new cv70(this, i, o5nVar, ocoVar));
        int i3 = ocoVar.f;
        int[] iArr2 = ocoVar.d;
        int iC1 = iArr2 != null ? o7h.c1(f46.I0(i3, iArr2)) : 0;
        int[] iArr3 = ocoVar.e;
        b(j, i, iC1 + (iArr3 != null ? o7h.c1(f46.I0(i3, iArr3)) : 0), i2);
    }

    public void d(lkh0 lkh0Var, Handler handler) {
        ((yjh0) this.b).d(lkh0Var, handler);
    }

    public MediaFormat e() {
        return ((yjh0) this.b).e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.drm.MediaDrmCallbackException */
    public hmh0 f(UUID uuid, xn00 xn00Var) throws MediaDrmCallbackException {
        ((Handler) this.e).post(new xfz0(this, (byte) 17));
        String str = xn00Var.b;
        byte[] bArr = xn00Var.a;
        String str2 = (String) this.d;
        if (!uuid.equals(h9v.a)) {
            throw p5b1.a(new DrmException("Unsupported DRM scheme", xjz.N0, (Throwable) null));
        }
        if (str2.length() == 0 && (str == null || str.length() == 0)) {
            throw p5b1.a(new DrmException("No license server", xjz.O0, (Throwable) null));
        }
        if (str == null || str.length() == 0) {
            str = str2;
        }
        ne neVar = new ne((byte) 9);
        neVar.e0(str);
        neVar.L("POST", zov0.d(6, p5b1.a, bArr));
        try {
            ry21 ry21VarE = ((cxc) this.c).a(new ln21(neVar)).e();
            try {
                int i = ry21VarE.d;
                if (i == 200) {
                    byte[] bArrC = ry21VarE.g.c();
                    ry21VarE.close();
                    return new hmh0(bArrC);
                }
                throw p5b1.a(new DrmLicenseServerException("HTTP status: " + i + ", " + ry21VarE.c));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(ry21VarE, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            throw p5b1.a(e);
        }
    }

    public void flush() {
        ((yjh0) this.b).flush();
    }

    public void g() {
        ((yjh0) this.b).g();
    }

    public boolean h(jpa0 jpa0Var) {
        return ((yjh0) this.b).h(jpa0Var);
    }

    public ByteBuffer i(int i) {
        return ((yjh0) this.b).i(i);
    }

    public void j(Surface surface) {
        ((yjh0) this.b).j(surface);
    }

    public void k(int i) {
        ((yjh0) this.b).k(i);
    }

    public void l(int i) {
        ((yjh0) this.b).l(i);
    }

    public boolean m() {
        return ((yjh0) this.b).m();
    }

    public void n(Runnable runnable) {
        ((yjh0) this.b).n(runnable);
    }

    public void o(int i, long j) {
        ((yjh0) this.b).o(i, j);
    }

    public int p() {
        return ((yjh0) this.b).p();
    }

    public int q(MediaCodec.BufferInfo bufferInfo) {
        return ((yjh0) this.b).q(bufferInfo);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.drm.MediaDrmCallbackException */
    public hmh0 r(UUID uuid, zn00 zn00Var) throws MediaDrmCallbackException {
        String str = zn00Var.b;
        byte[] bArr = zn00Var.a;
        if (!u890.j(h9v.a, uuid)) {
            throw p5b1.a(new DrmException("Unsupported DRM scheme", xjz.N0, (Throwable) null));
        }
        String strH = gvg.h(str, ihc1.h0(str, "?", false) ? "&" : "?", "signedRequest=", new String(bArr, StandardCharsets.UTF_8));
        ne neVar = new ne((byte) 9);
        neVar.e0(strH);
        neVar.L("POST", zov0.d(6, p5b1.b, new byte[0]));
        try {
            ry21 ry21VarE = ((cxc) this.c).a(new ln21(neVar)).e();
            try {
                byte[] bArrC = ry21VarE.g.c();
                ry21VarE.close();
                return new hmh0(bArrC);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(ry21VarE, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            throw p5b1.a(e);
        }
    }

    public void release() {
        ((yjh0) this.b).release();
    }

    public ByteBuffer s(int i) {
        return ((yjh0) this.b).s(i);
    }

    public void t(ArrayList arrayList) {
        ((yjh0) this.b).t(arrayList);
    }

    public boolean test(Object obj) {
        ij91 ij91Var = (ij91) obj;
        l811 l811Var = (l811) this.e;
        ui91 ui91Var = (ui91) this.d;
        if (((AtomicBoolean) this.b).getAndSet(false)) {
            ((cj91) this.c).a.C(ui91Var);
        }
        boolean zContains = ij91Var.c.contains(Integer.valueOf(ui91Var.a()));
        if (zContains && !l811Var.a) {
            l811Var.a = true;
        }
        return l811Var.a && !zContains;
    }

    public void u(ArrayList arrayList) {
        ((yjh0) this.b).u(arrayList);
    }

    public void v(tw91 tw91Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(871844335);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(tw91Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                zqq zqqVar = (zqq) this.d;
                et61 et61Var = new et61(iu30Var, (byte) 14);
                p2o0 p2o0Var = (p2o0) zqqVar.a.c;
                r5h r5hVar = (r5h) ((yw91) p2o0Var.b).h.get();
                c8o.l(r5hVar);
                q8n q8nVar = (q8n) ((yw91) p2o0Var.b).i.get();
                c8o.l(q8nVar);
                lrs lrsVar = new lrs(et61Var, r5hVar, q8nVar);
                x340Var.s0(lrsVar);
                objT = lrsVar;
            }
            lrs lrsVar2 = (lrs) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                yqq yqqVar = (yqq) this.c;
                pc81 pc81Var = new pc81(iu30Var, (byte) 22);
                p2o0 p2o0Var2 = (p2o0) yqqVar.a.c;
                ijr ijrVar = (ijr) ((yw91) p2o0Var2.b).c.get();
                c8o.l(ijrVar);
                yw91 yw91Var = (yw91) p2o0Var2.b;
                jtl1 jtl1VarF = yw91Var.f();
                c8o.l(jtl1VarF);
                uu00 uu00Var = (uu00) yw91Var.f.get();
                c8o.l(uu00Var);
                ers ersVar = new ers(ijrVar, pc81Var, jtl1VarF, uu00Var);
                x340Var.s0(ersVar);
                objT2 = ersVar;
            }
            ers ersVar2 = (ers) objT2;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            boolean zI = x340Var.i(this);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new ww91(this, (byte) 1);
                x340Var.s0(objT3);
            }
            h3h1 h3h1Var = new h3h1((iu30) objT3);
            qim0 qim0VarF = u291.f(uyn1.w(bmq0.L(nim0.a, k1o1.q(x340Var), (g6o0) null), new zzq0(16.0f, 8.0f, 16.0f, 16.0f)), 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF);
            boolean zI2 = x340Var.i(ersVar2) | ((i2 & 14) == 4) | x340Var.i(lrsVar2);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new ny51(ersVar2, tw91Var, lrsVar2, (byte) 15);
                x340Var.s0(objT4);
            }
            s3o1.d(qim0VarP, (xtb0) null, (vzq0) null, d36Var, (nl3) null, (iq20) null, false, h3h1Var, (iu30) objT4, x340Var, 0, 238);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(this, tw91Var, iu30Var, i, (byte) 2);
        }
    }

    public boolean w(et91 et91Var, int i) {
        eda edaVar = (eda) et91Var.a.get();
        if (edaVar == null) {
            return false;
        }
        ((Handler) this.c).removeCallbacksAndMessages(et91Var);
        Handler handler = kda.p;
        handler.sendMessage(handler.obtainMessage(1, i, 0, edaVar.a));
        return true;
    }

    public jhm x(String str, String str2, gn10 gn10Var, boolean z) {
        int i;
        c9c0 c9c0Var = (c9c0) this.c;
        boolean z2 = c9c0Var.b.current().getValue() != null;
        boolean z3 = !z2;
        int i2 = !z2 ? 2131956491 : 2131956492;
        tnx tnxVar = tnx.c;
        if (((bp90) c9c0Var.e.a().getValue()).b) {
            i = z ? 2 : 0;
        } else {
            i = 1;
        }
        return new jhm("jam_start", (hux) tnxVar, (fhm) null, Integer.valueOf(i2), (String) null, z3, i != 0 ? new tm81(i, 6, "jam_start", (iu30) null, false) : null, new ihm(new bhm(2), new ghm(cgb1.Y, new ccb1(this, str, (byte) 6)), new e971(this, str, str2, gn10Var, (byte) 10)), 52);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object y(qkg qkgVar, String str, onm onmVar) {
        dd91 dd91Var;
        pe91 m231Var;
        r961 r961Var = (r961) this.e;
        dxz0 dxz0Var = (dxz0) r961Var.c;
        t2j0 t2j0Var = (t2j0) r961Var.b;
        if (onmVar instanceof dd91) {
            dd91Var = (dd91) onmVar;
            int i = dd91Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dd91Var.d = i - Integer.MIN_VALUE;
            } else {
                dd91Var = new dd91(this, onmVar);
            }
        } else {
            dd91Var = new dd91(this, onmVar);
        }
        Object objP = dd91Var.b;
        int i2 = dd91Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                ne neVar = (ne) this.b;
                dd91Var.a = qkgVar;
                dd91Var.d = 1;
                objP = neVar.p(qkgVar, str, dd91Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qkgVar = dd91Var.a;
                hm5.M(objP);
            }
            m231Var = (pe91) objP;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            String str2 = qkgVar.b;
            slb0 slb0VarN = LayoutLoadingErrorEvent.n();
            slb0VarN.q(str2);
            slb0VarN.s(dxz0Var.f());
            HttpException httpException = thA instanceof HttpException ? (HttpException) thA : null;
            if (httpException != null) {
                slb0VarN.r(httpException.a);
            }
            String message = thA.getMessage();
            if (message == null) {
                message = thA.toString();
            }
            slb0VarN.n(message);
            t2j0Var.a(slb0VarN.build());
        }
        hm5.M(m231Var);
        pe91 pe91Var = m231Var;
        String str3 = qkgVar.b;
        ArrayList arrayList = pe91Var.a;
        boolean z = pe91Var.b == x4e0.b;
        tlb0 tlb0VarO = LayoutLoadingEvent.o();
        tlb0VarO.r(str3);
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((ef91) it.next()).a));
        }
        tlb0VarO.n(arrayList2);
        tlb0VarO.q(z);
        tlb0VarO.t(dxz0Var.f());
        tlb0VarO.s(!((gx5) r961Var.d).a());
        t2j0Var.a(tlb0VarO.build());
        return pe91Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147  */
    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    /* JADX WARN: Code duplicated, block: B:91:0x018b  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, p.ef91] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.protobuf.g, p.ld91] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.protobuf.g, p.md91] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public Object z(ef91 ef91Var, ice0 ice0Var, String str, boolean z, boolean z2, String str2, String str3, onm onmVar) {
        ed91 ed91Var;
        ?? r9;
        nd91 m231Var;
        ?? r10;
        ?? r1;
        Throwable thA;
        nd91 nd91Var;
        boolean z3;
        ?? N;
        HttpException httpException;
        String message;
        ?? r11;
        ?? r12;
        ?? r2;
        ?? r13;
        ?? r3;
        Object next;
        ?? r14;
        ff91 ff91Var;
        ff91 ff91Var2;
        ?? r4 = ef91Var;
        ice0 ice0Var2 = ice0Var;
        ?? r5 = str;
        r961 r961Var = (r961) this.e;
        dxz0 dxz0Var = (dxz0) r961Var.c;
        t2j0 t2j0Var = (t2j0) r961Var.b;
        if (onmVar instanceof ed91) {
            ed91Var = (ed91) onmVar;
            int i = ed91Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ed91Var.f = i - Integer.MIN_VALUE;
            } else {
                ed91Var = new ed91(this, onmVar);
            }
        } else {
            ed91Var = new ed91(this, onmVar);
        }
        ed91 ed91Var2 = ed91Var;
        Object objP = ed91Var2.d;
        int i2 = ed91Var2.f;
        try {
            try {
                if (i2 != 0) {
                    try {
                        if (i2 == 1) {
                            String str4 = ed91Var2.c;
                            ice0Var2 = ed91Var2.b;
                            ef91 ef91Var2 = ed91Var2.a;
                            hm5.M(objP);
                            r12 = str4;
                            r2 = ef91Var2;
                            dq10 dq10Var = (dq10) objP;
                            m231Var = new nd91(dq10Var.a, dq10Var.b, dq10Var.c, dq10Var.d, dq10Var.e, dq10Var.f, dq10Var.g, dq10Var.h);
                            r1 = r2;
                            r10 = r12;
                            thA = e331.a(m231Var);
                            if (thA != null) {
                                N = SlotContentLoadingErrorEvent.n();
                                N.q(r10);
                                N.t(r1.name());
                                N.s(dxz0Var.f());
                                if (thA instanceof HttpException) {
                                }
                                if (httpException != null) {
                                    N.r(httpException.a);
                                }
                                message = thA.getMessage();
                                if (message == null) {
                                    message = thA.toString();
                                }
                                N.n(message);
                                t2j0Var.a(N.build());
                            }
                            hm5.M(m231Var);
                            nd91Var = m231Var;
                            String str5 = nd91Var.d;
                            if (nd91Var.b == x4e0.b) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            ?? N2 = SlotContentLoadingEvent.n();
                            N2.q(r10);
                            N2.s(str5);
                            N2.t(r1.name());
                            N2.n(z3);
                            N2.r(dxz0Var.f());
                            t2j0Var.a(N2.build());
                            return nd91Var;
                        }
                        if (i2 == 2) {
                            String str6 = ed91Var2.c;
                            ice0Var2 = ed91Var2.b;
                            ef91 ef91Var3 = ed91Var2.a;
                            hm5.M(objP);
                            r13 = str6;
                            r3 = ef91Var3;
                            m231Var = (nd91) objP;
                            r1 = r3;
                            r10 = r13;
                            thA = e331.a(m231Var);
                            if (thA != null) {
                                N = SlotContentLoadingErrorEvent.n();
                                N.q(r10);
                                N.t(r1.name());
                                N.s(dxz0Var.f());
                                if (thA instanceof HttpException) {
                                }
                                if (httpException != null) {
                                    N.r(httpException.a);
                                }
                                message = thA.getMessage();
                                if (message == null) {
                                    message = thA.toString();
                                }
                                N.n(message);
                                t2j0Var.a(N.build());
                            }
                            hm5.M(m231Var);
                            nd91Var = m231Var;
                            String str7 = nd91Var.d;
                            if (nd91Var.b == x4e0.b) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            ?? N3 = SlotContentLoadingEvent.n();
                            N3.q(r10);
                            N3.s(str7);
                            N3.t(r1.name());
                            N3.n(z3);
                            N3.r(dxz0Var.f());
                            t2j0Var.a(N3.build());
                            return nd91Var;
                        }
                        if (i2 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str8 = ed91Var2.c;
                        ice0Var2 = ed91Var2.b;
                        ef91 ef91Var4 = ed91Var2.a;
                        hm5.M(objP);
                        r11 = str8;
                        r5 = ef91Var4;
                        try {
                            m231Var = (nd91) objP;
                            r1 = r5;
                            r10 = r11;
                        } catch (Throwable th) {
                            th = th;
                            r4 = r5;
                            r9 = r11;
                            m231Var = new m231(th);
                            r1 = r4;
                            r10 = r9;
                        }
                        thA = e331.a(m231Var);
                        if (thA != null && ice0Var2 != ice0.a && !(thA instanceof CancellationException)) {
                            N = SlotContentLoadingErrorEvent.n();
                            N.q(r10);
                            N.t(r1.name());
                            N.s(dxz0Var.f());
                            httpException = thA instanceof HttpException ? (HttpException) thA : null;
                            if (httpException != null) {
                                N.r(httpException.a);
                            }
                            message = thA.getMessage();
                            if (message == null) {
                                message = thA.toString();
                            }
                            N.n(message);
                            t2j0Var.a(N.build());
                        }
                        hm5.M(m231Var);
                        nd91Var = m231Var;
                        String str9 = nd91Var.d;
                        if (nd91Var.b == x4e0.b) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ?? N4 = SlotContentLoadingEvent.n();
                        N4.q(r10);
                        N4.s(str9);
                        N4.t(r1.name());
                        N4.n(z3);
                        N4.r(dxz0Var.f());
                        t2j0Var.a(N4.build());
                        return nd91Var;
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = r4;
                        r4 = r5;
                        r9 = r11;
                        m231Var = new m231(th);
                        r1 = r4;
                        r10 = r9;
                        thA = e331.a(m231Var);
                        if (thA != null) {
                            N = SlotContentLoadingErrorEvent.n();
                            N.q(r10);
                            N.t(r1.name());
                            N.s(dxz0Var.f());
                            if (thA instanceof HttpException) {
                            }
                            if (httpException != null) {
                                N.r(httpException.a);
                            }
                            message = thA.getMessage();
                            if (message == null) {
                                message = thA.toString();
                            }
                            N.n(message);
                            t2j0Var.a(N.build());
                        }
                        hm5.M(m231Var);
                        nd91Var = m231Var;
                        String str10 = nd91Var.d;
                        if (nd91Var.b == x4e0.b) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ?? N5 = SlotContentLoadingEvent.n();
                        N5.q(r10);
                        N5.s(str10);
                        N5.t(r1.name());
                        N5.n(z3);
                        N5.r(dxz0Var.f());
                        t2j0Var.a(N5.build());
                        return nd91Var;
                    }
                }
                hm5.M(objP);
                d7 d7Var = new d7(qkg.Y, (byte) 0);
                do {
                    if (!d7Var.hasNext()) {
                        next = null;
                        break;
                    }
                    next = d7Var.next();
                } while (!((qkg) next).b.equals(r5));
                qkg qkgVar = (qkg) next;
                if (qkgVar == null) {
                    qkgVar = qkg.c;
                }
                qkg qkgVar2 = qkgVar;
                try {
                    ef91 ef91Var5 = ef91.FEED;
                    d9n d9nVar = d9n.a;
                    if (r4 == ef91Var5) {
                        try {
                            wmy wmyVar = (wmy) this.d;
                            ed91Var2.a = r4;
                            ed91Var2.b = ice0Var2;
                            ed91Var2.c = r5;
                            ed91Var2.f = 1;
                            try {
                                objP = wmyVar.p((String) r5, z, ice0Var2, z2, str2, str3, ed91Var2);
                                r12 = r5;
                                ice0Var2 = ice0Var2;
                                r2 = r4;
                                if (objP == d9nVar) {
                                    return d9nVar;
                                }
                                dq10 dq10Var2 = (dq10) objP;
                                m231Var = new nd91(dq10Var2.a, dq10Var2.b, dq10Var2.c, dq10Var2.d, dq10Var2.e, dq10Var2.f, dq10Var2.g, dq10Var2.h);
                                r1 = r2;
                                r10 = r12;
                            } catch (Throwable th3) {
                                th = th3;
                                r9 = r5;
                                ice0Var2 = ice0Var2;
                                m231Var = new m231(th);
                                r1 = r4;
                                r10 = r9;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r9 = r5;
                        }
                        thA = e331.a(m231Var);
                        if (thA != null) {
                            N = SlotContentLoadingErrorEvent.n();
                            N.q(r10);
                            N.t(r1.name());
                            N.s(dxz0Var.f());
                            if (thA instanceof HttpException) {
                            }
                            if (httpException != null) {
                                N.r(httpException.a);
                            }
                            message = thA.getMessage();
                            if (message == null) {
                                message = thA.toString();
                            }
                            N.n(message);
                            t2j0Var.a(N.build());
                        }
                        hm5.M(m231Var);
                        nd91Var = m231Var;
                        String str11 = nd91Var.d;
                        if (nd91Var.b == x4e0.b) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ?? N6 = SlotContentLoadingEvent.n();
                        N6.q(r10);
                        N6.s(str11);
                        N6.t(r1.name());
                        N6.n(z3);
                        N6.r(dxz0Var.f());
                        t2j0Var.a(N6.build());
                        return nd91Var;
                    }
                    r14 = r5;
                    try {
                        if (ice0Var2 != ice0.d) {
                            ne neVar = (ne) this.b;
                            ed91Var2.a = r4;
                            ed91Var2.b = ice0Var2;
                            ed91Var2.c = r14;
                            ed91Var2.f = 3;
                            objP = neVar.s((ef91) r4, ice0Var2, qkgVar2, z, z2, str2, str3, ed91Var2);
                            if (objP == d9nVar) {
                                return d9nVar;
                            }
                            r5 = ef91Var;
                            ice0Var2 = ice0Var;
                            r11 = r14;
                            m231Var = (nd91) objP;
                            r1 = r5;
                            r10 = r11;
                            thA = e331.a(m231Var);
                            if (thA != null) {
                                N = SlotContentLoadingErrorEvent.n();
                                N.q(r10);
                                N.t(r1.name());
                                N.s(dxz0Var.f());
                                if (thA instanceof HttpException) {
                                }
                                if (httpException != null) {
                                    N.r(httpException.a);
                                }
                                message = thA.getMessage();
                                if (message == null) {
                                    message = thA.toString();
                                }
                                N.n(message);
                                t2j0Var.a(N.build());
                            }
                            hm5.M(m231Var);
                            nd91Var = m231Var;
                            String str12 = nd91Var.d;
                            if (nd91Var.b == x4e0.b) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            ?? N7 = SlotContentLoadingEvent.n();
                            N7.q(r10);
                            N7.s(str12);
                            N7.t(r1.name());
                            N7.n(z3);
                            N7.r(dxz0Var.f());
                            t2j0Var.a(N7.build());
                            return nd91Var;
                        }
                        kd91 kd91Var = (kd91) this.c;
                        int iOrdinal = r4.ordinal();
                        if (iOrdinal == 0) {
                            ff91Var = ff91.SLOT_UNKNOWN;
                        } else if (iOrdinal == 1) {
                            ff91Var = ff91.SHORTCUT;
                        } else {
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    ff91Var = ff91.FEED;
                                } else {
                                    eg.o();
                                    ff91Var2 = null;
                                }
                                ed91Var2.a = r4;
                                ed91Var2.b = ice0Var2;
                                ed91Var2.c = r14;
                                ed91Var2.f = 2;
                                objP = smo1.s(new jd91(ff91Var2, kd91Var, qkgVar2, z2, str2, str3, z, null), ed91Var2);
                                r3 = r4;
                                r13 = r14;
                                if (objP == d9nVar) {
                                    return d9nVar;
                                }
                                m231Var = (nd91) objP;
                                r1 = r3;
                                r10 = r13;
                                thA = e331.a(m231Var);
                                if (thA != null) {
                                    N = SlotContentLoadingErrorEvent.n();
                                    N.q(r10);
                                    N.t(r1.name());
                                    N.s(dxz0Var.f());
                                    if (thA instanceof HttpException) {
                                    }
                                    if (httpException != null) {
                                        N.r(httpException.a);
                                    }
                                    message = thA.getMessage();
                                    if (message == null) {
                                        message = thA.toString();
                                    }
                                    N.n(message);
                                    t2j0Var.a(N.build());
                                }
                                hm5.M(m231Var);
                                nd91Var = m231Var;
                                String str13 = nd91Var.d;
                                if (nd91Var.b == x4e0.b) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                ?? N8 = SlotContentLoadingEvent.n();
                                N8.q(r10);
                                N8.s(str13);
                                N8.t(r1.name());
                                N8.n(z3);
                                N8.r(dxz0Var.f());
                                t2j0Var.a(N8.build());
                                return nd91Var;
                            }
                            ff91Var = ff91.HERO;
                        }
                        ff91Var2 = ff91Var;
                        ed91Var2.a = r4;
                        ed91Var2.b = ice0Var2;
                        ed91Var2.c = r14;
                        ed91Var2.f = 2;
                        objP = smo1.s(new jd91(ff91Var2, kd91Var, qkgVar2, z2, str2, str3, z, null), ed91Var2);
                        r3 = r4;
                        r13 = r14;
                        if (objP == d9nVar) {
                            return d9nVar;
                        }
                        m231Var = (nd91) objP;
                        r1 = r3;
                        r10 = r13;
                        thA = e331.a(m231Var);
                        if (thA != null) {
                            N = SlotContentLoadingErrorEvent.n();
                            N.q(r10);
                            N.t(r1.name());
                            N.s(dxz0Var.f());
                            if (thA instanceof HttpException) {
                            }
                            if (httpException != null) {
                                N.r(httpException.a);
                            }
                            message = thA.getMessage();
                            if (message == null) {
                                message = thA.toString();
                            }
                            N.n(message);
                            t2j0Var.a(N.build());
                        }
                        hm5.M(m231Var);
                        nd91Var = m231Var;
                        String str14 = nd91Var.d;
                        if (nd91Var.b == x4e0.b) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ?? N9 = SlotContentLoadingEvent.n();
                        N9.q(r10);
                        N9.s(str14);
                        N9.t(r1.name());
                        N9.n(z3);
                        N9.r(dxz0Var.f());
                        t2j0Var.a(N9.build());
                        return nd91Var;
                    } catch (Throwable th5) {
                        th = th5;
                        r4 = ef91Var;
                        ice0Var2 = ice0Var;
                        r9 = r14;
                        m231Var = new m231(th);
                        r1 = r4;
                        r10 = r9;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    r14 = r5;
                }
            } catch (Throwable th7) {
                th = th7;
            }
            thA = e331.a(m231Var);
            if (thA != null) {
                N = SlotContentLoadingErrorEvent.n();
                N.q(r10);
                N.t(r1.name());
                N.s(dxz0Var.f());
                if (thA instanceof HttpException) {
                }
                if (httpException != null) {
                    N.r(httpException.a);
                }
                message = thA.getMessage();
                if (message == null) {
                    message = thA.toString();
                }
                N.n(message);
                t2j0Var.a(N.build());
            }
            hm5.M(m231Var);
            nd91Var = m231Var;
            String str15 = nd91Var.d;
            if (nd91Var.b == x4e0.b) {
                z3 = true;
            } else {
                z3 = false;
            }
            ?? N10 = SlotContentLoadingEvent.n();
            N10.q(r10);
            N10.s(str15);
            N10.t(r1.name());
            N10.n(z3);
            N10.r(dxz0Var.f());
            t2j0Var.a(N10.build());
            return nd91Var;
        } catch (CancellationException e) {
            throw e;
        }
        m231Var = new m231(th);
        r1 = r4;
        r10 = r9;
    }

    public /* synthetic */ ua91(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public ua91(yqg yqgVar) {
        this.a = (byte) 12;
        this.b = yqgVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new ArrayList();
    }

    public ua91(Flowable flowable, q8n q8nVar) {
        this.a = (byte) 0;
        this.b = flowable;
        this.c = q8nVar;
    }

    public ua91(gw70 gw70Var, gya gyaVar, o771 o771Var, q8n q8nVar) {
        this.a = (byte) 16;
        this.b = gw70Var;
        this.d = gyaVar;
        this.e = o771Var;
        this.c = q8nVar;
    }

    public ua91(dn81 dn81Var, sjb sjbVar, g871 g871Var, u690 u690Var, cmt cmtVar) {
        this.a = (byte) 5;
        this.b = dn81Var;
        this.c = g871Var;
        this.d = u690Var;
        this.e = cmtVar;
    }

    public ua91(v8v v8vVar, cxc cxcVar, String str) {
        this.a = (byte) 14;
        this.b = v8vVar;
        this.c = cxcVar;
        this.d = str;
        this.e = new Handler(Looper.getMainLooper());
    }

    public ua91(yjh0 yjh0Var, o5n o5nVar, xpt0 xpt0Var, String str, String str2) {
        this.a = (byte) 13;
        this.b = yjh0Var;
        this.c = o5nVar;
        this.d = xpt0Var;
        this.e = str2;
    }

    public ua91(String str, EsPlayOrigin.PlayOrigin playOrigin, bo91 bo91Var, ht20 ht20Var) {
        h6a huzVar;
        this.a = (byte) 4;
        this.b = str;
        this.c = playOrigin;
        this.d = bo91Var;
        try {
            if (new y6b1(str, false).c == v6b1.W1) {
                huzVar = new h6a(ht20Var, (byte) 15);
            } else {
                huzVar = new huz(Boolean.FALSE, (byte) 10);
            }
        } catch (SpotifyUriParserException unused) {
        }
        this.e = huzVar;
    }

    public ua91(StreamConfigurationMap streamConfigurationMap, zhq0 zhq0Var) {
        this.a = (byte) 21;
        this.d = new HashMap();
        this.e = new HashMap();
        new HashMap();
        this.b = new ezb1(streamConfigurationMap, (byte) 2);
        this.c = zhq0Var;
    }

    public ua91(los losVar, ipq ipqVar, yqq yqqVar, zqq zqqVar) {
        this.a = (byte) 7;
        this.b = ipqVar;
        this.c = yqqVar;
        this.d = zqqVar;
        this.e = new idd1(gr81.Y);
        losVar.c(new ww91(this, (byte) 0));
    }

    public ua91() {
        this.a = (byte) 6;
        this.b = new Object();
        this.c = new Handler(Looper.getMainLooper(), new dt91(this));
    }

    public ua91(Context context, ActionMode.Callback callback) {
        this.a = (byte) 24;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new jv81(0);
    }

    public /* synthetic */ ua91(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
