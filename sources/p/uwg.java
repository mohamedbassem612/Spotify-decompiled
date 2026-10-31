package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_esperanto.proto.Status;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import spotify.collection.esperanto.proto.CollectionGetUnplayedEpisodesResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uwg implements Predicate, BiFunction, twq0, Init, s2i1, Function, hiy, x800 {
    public static List P0;
    public static LinkedHashMap Q0;
    public final /* synthetic */ byte a;
    public static final uwg b = new uwg(0);
    public static final uwg c = new uwg(1);
    public static final uwg d = new uwg(2);
    public static final uwg e = new uwg(3);
    public static final uwg f = new uwg(4);
    public static final uwg g = new uwg(5);
    public static final uwg h = new uwg(6);
    public static final uwg i = new uwg(7);
    public static final uwg t = new uwg(8);
    public static final uwg X = new uwg(9);
    public static final uwg Y = new uwg(10);
    public static final uwg Z = new uwg(11);
    public static final uwg N0 = new uwg(12);
    public static final uwg O0 = new uwg(13);
    public static final uwg R0 = new uwg(14);
    public static final uwg S0 = new uwg(15);
    public static final uwg T0 = new uwg(16);
    public static final uwg U0 = new uwg(17);
    public static final uwg V0 = new uwg(18);
    public static final uwg W0 = new uwg(19);
    public static final uwg X0 = new uwg(20);
    public static final uwg Y0 = new uwg(21);
    public static final uwg Z0 = new uwg(22);
    public static final uwg a1 = new uwg(23);
    public static final uwg b1 = new uwg(24);
    public static final uwg c1 = new uwg(26);
    public static final uwg d1 = new uwg(27);
    public static final uwg e1 = new uwg(28);
    public static final uwg f1 = new uwg(29);

    public /* synthetic */ uwg(byte b2) {
        this.a = b2;
    }

    public static final void c(p700 p700Var, View view, View view2) {
        if (dhn.a.contains(uwg.class)) {
            return;
        }
        try {
            String str = p700Var.a;
            sua suaVar = zwg.f;
            Bundle bundleP = sua.p(p700Var, view, view2);
            b.e(bundleP);
            wf10.c().execute(new ny2(str, bundleP, (byte) 28));
        } catch (Throwable th) {
            dhn.a(uwg.class, th);
        }
    }

    public static vcu d(kdu kduVar) {
        String str = kduVar.b;
        if (kduVar.d) {
            str = null;
        }
        boolean z = kduVar.c;
        boolean z2 = str != null;
        if (z2 && !z) {
            return rcu.a;
        }
        if (z2 || !z) {
            return null;
        }
        return tcu.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(Context context, onm onmVar) {
        cdc cdcVar;
        TypedArray typedArray;
        if (onmVar instanceof cdc) {
            cdcVar = (cdc) onmVar;
            int i2 = cdcVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cdcVar.d = i2 - Integer.MIN_VALUE;
            } else {
                cdcVar = new cdc(this, onmVar);
            }
        } else {
            cdcVar = new cdc(this, onmVar);
        }
        Object objS = cdcVar.b;
        d9n d9nVar = d9n.a;
        int i3 = cdcVar.d;
        if (i3 == 0) {
            hm5.M(objS);
            String[] stringArray = context.getResources().getStringArray(2130903048);
            TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(2130903056);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr = new int[length];
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = typedArrayObtainTypedArray.getResourceId(i4, 0);
            }
            typedArrayObtainTypedArray.recycle();
            int i5 = xhh1.a("🥱") ? 2130903055 : 2130903054;
            vhc vhcVar = eyh0.h;
            eyh0 eyh0Var = eyh0.i;
            if (eyh0Var == null) {
                synchronized (vhcVar) {
                    eyh0Var = eyh0.i;
                    if (eyh0Var == null) {
                        eyh0Var = new eyh0(context);
                        eyh0.i = eyh0Var;
                    }
                }
            }
            eyh0 eyh0Var2 = eyh0Var;
            TypedArray typedArrayObtainTypedArray2 = context.getResources().obtainTypedArray(i5);
            cdcVar.a = typedArrayObtainTypedArray2;
            cdcVar.d = 1;
            objS = smo1.s(new af0((byte) 5, typedArrayObtainTypedArray2, eyh0Var2, context, iArr, stringArray, (lnm) null), cdcVar);
            if (objS == d9nVar) {
                return d9nVar;
            }
            typedArray = typedArrayObtainTypedArray2;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            typedArray = cdcVar.a;
            hm5.M(objS);
        }
        List list = (List) objS;
        typedArray.recycle();
        P0 = list;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r7h.W(((bdc) it.next()).c, arrayList);
        }
        ArrayList<p5x> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((p5x) obj).b.isEmpty()) {
                arrayList2.add(obj);
            }
        }
        ArrayList<p5x> arrayList3 = new ArrayList();
        for (p5x p5xVar : arrayList2) {
            List list2 = p5xVar.b;
            ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new p5x((String) it2.next(), p5xVar.b));
            }
            r7h.W(arrayList4, arrayList3);
        }
        int iS = zno1.s(q7h.U(arrayList3, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (p5x p5xVar2 : arrayList3) {
            linkedHashMap.put(p5xVar2.a, p5xVar2.b);
        }
        Q0 = linkedHashMap;
        return rih1.a;
    }

    public Object apply(Object obj) throws Throwable {
        switch (this.a) {
            case 6:
                return ((PlayerState) obj).contextUri();
            case 7:
                return ((GetEntityResponse) obj).n().o();
            case 8:
                return ((PlayerState) obj).playbackId();
            case 9:
            case 12:
            case 13:
            case 14:
            case 17:
            case 18:
            default:
                return new g9z(((Throwable) obj).getMessage());
            case 10:
                return v49.a;
            case 11:
                return spq0.a(((cma1) obj).a);
            case 15:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Error calling submitCheckout()", new Object[0]);
                return new o7g(th);
            case 16:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionGetUnplayedEpisodesResponse.r(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.collection.esperanto.proto.CollectionGetUnplayedEpisodesResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 19:
                return Boolean.valueOf(((feh) obj) instanceof ceh);
            case 20:
                return new i5w0((ctc) obj);
            case 21:
                return Integer.valueOf(((Status) obj).n());
            case 22:
                return ((tr3) obj).b.a.e;
            case 23:
                zsq0 zsq0Var = (atq0) obj;
                if (zsq0Var instanceof zsq0) {
                    return (c481) zsq0Var.a;
                }
                if (zsq0Var instanceof xsq0) {
                    throw ((xsq0) zsq0Var).a;
                }
                eg.o();
                return null;
            case 24:
                eww0 eww0Var = (eww0) obj;
                return new td10(eww0Var.f, eww0Var.a, eww0Var.b, (sd10) null);
        }
    }

    public boolean b(MotionEvent motionEvent, tyf0 tyf0Var) {
        return ((Boolean) tyf0Var.invoke(motionEvent)).booleanValue();
    }

    public void e(Bundle bundle) {
        Locale locale;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                double dDoubleValue = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String strGroup = matcher.group(0);
                        try {
                            locale = wf10.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        dDoubleValue = NumberFormat.getNumberInstance(locale).parse(strGroup).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                bundle.putDouble("_valueToSum", dDoubleValue);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 4:
                return First.c((wm2) obj, Collections.singleton(uk2.a));
            case 17:
                return First.b((gpk) obj);
            default:
                return First.b((eyv) obj);
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new hy3(xkg0Var, str2, str);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                i1r i1rVar = (k1r) obj;
                return (i1rVar instanceof i1r) && i1rVar.a != null;
            case 14:
                return ((spq0) obj).c();
            default:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                return new mmr0((l62) obj, (Long) obj2);
            default:
                return new a910(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        }
    }
}
