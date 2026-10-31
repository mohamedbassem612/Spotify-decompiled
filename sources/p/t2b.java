package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.device_context.v1.ReportedAttributes;
import com.spotify.device_context.v1.TargetDevice;
import com.spotify.kidsaccount.api.v2.proto.InitChildAccountConfigResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.premiummarketing.premiumdestinationpage.v1.LoggingInfo;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Mac;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t2b implements Function, BiFunction, jrn0, s8y, Init, c290, s6t0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ t2b(byte b) {
        this.a = b;
    }

    public static mus e(Activity activity, String str, l5f1 l5f1Var) {
        return new sus(new ogs(activity), activity).a(l5f1Var, str);
    }

    public static hck1 f(rck1 rck1Var, fck1 fck1Var) {
        return new hck1(rck1Var, fck1Var, csn.b);
    }

    public static int g(Intent intent) {
        if ("sonos-v1".equals(h(intent))) {
            return 2;
        }
        if ("com.spotify.sso.action.START_GOOGLE_AUTH_FLOW_V1".equals(intent.getAction())) {
            return 3;
        }
        if (i(intent.getDataString())) {
            return 4;
        }
        if ("1".equals(h(intent))) {
            return 1;
        }
        return "google-assistant-v1".equals(h(intent)) ? 5 : 6;
    }

    public static String h(Intent intent) {
        return intent.getSerializableExtra("VERSION") instanceof Integer ? String.valueOf(intent.getIntExtra("VERSION", 0)) : intent.getStringExtra("VERSION");
    }

    public static boolean i(String str) {
        if (str != null && !str.isEmpty()) {
            Uri uri = Uri.parse(str);
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (uri.isHierarchical() && queryParameterNames.contains("client_id") && queryParameterNames.contains("scope")) {
                return true;
            }
        }
        return false;
    }

    public static ave0 j(String str, int i, LoggingInfo loggingInfo) {
        return new ave0(str, "", i, loggingInfo.getName() + ":" + loggingInfo.n() + ":" + loggingInfo.p());
    }

    public static List k(hf91 hf91Var, int i, hf91 hf91Var2, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        boolean z4;
        int iT = hf91Var.t(i);
        int i2 = i + iT;
        int iF = hf91Var.f(hf91Var.q(i), hf91Var.b);
        int iF2 = hf91Var.f(hf91Var.q(i2), hf91Var.b);
        int i3 = iF2 - iF;
        boolean z5 = i >= 0 && (hf91Var.b[(hf91Var.q(i) * 5) + 1] & 201326592) != 0;
        hf91Var2.v(iT);
        hf91Var2.w(i3, hf91Var2.t);
        if (hf91Var.g < i2) {
            hf91Var.A(i2);
        }
        if (hf91Var.k < iF2) {
            hf91Var.B(iF2, i2);
        }
        int[] iArr = hf91Var2.b;
        int i4 = hf91Var2.t;
        int i5 = i4 * 5;
        f46.P(i5, i * 5, i2 * 5, hf91Var.b, iArr);
        Object[] objArr = hf91Var2.c;
        int i6 = hf91Var2.i;
        System.arraycopy(hf91Var.c, iF, objArr, i6, i3);
        int i7 = hf91Var2.v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iT;
        int iF3 = i6 - hf91Var2.f(i4, iArr);
        int i10 = hf91Var2.m;
        int i11 = hf91Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = hf91.h(hf91Var2.f(i13, iArr) + iF3, i12 < i13 ? 0 : hf91Var2.k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        hf91Var2.m = i12;
        int iB = bf91.b(hf91Var.d, i, hf91Var.o());
        int iB2 = bf91.b(hf91Var.d, i2, hf91Var.o());
        if (iB < iB2) {
            ArrayList arrayList2 = hf91Var.d;
            arrayList = new ArrayList(iB2 - iB);
            for (int i15 = iB; i15 < iB2; i15++) {
                s340 s340Var = (s340) arrayList2.get(i15);
                s340Var.a += i8;
                arrayList.add(s340Var);
            }
            hf91Var2.d.addAll(bf91.b(hf91Var2.d, hf91Var2.t, hf91Var2.o()), arrayList);
            arrayList2.subList(iB, iB2).clear();
        } else {
            arrayList = z6x.a;
        }
        ArrayList arrayList3 = arrayList;
        if (!arrayList3.isEmpty()) {
            HashMap map = hf91Var.e;
            HashMap map2 = hf91Var2.e;
            if (map != null && map2 != null) {
                int size = arrayList3.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = hf91Var2.v;
        hf91Var2.P(i7);
        int iF4 = hf91Var.F(i, hf91Var.b);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iF4 >= 0;
            if (z7) {
                hf91Var.Q();
                hf91Var.a(iF4 - hf91Var.t);
                hf91Var.Q();
            }
            hf91Var.a(i - hf91Var.t);
            boolean zI = hf91Var.I();
            if (z7) {
                hf91Var.N();
                hf91Var.i();
                hf91Var.N();
                hf91Var.i();
            }
            z4 = zI;
        } else {
            boolean zJ = hf91Var.J(i, iT);
            hf91Var.K(iF, i3, i - 1);
            z4 = zJ;
        }
        if (z4) {
            g0k.a("Unexpectedly removed anchors");
        }
        int i18 = hf91Var2.o;
        int i19 = iArr3[i5 + 1];
        hf91Var2.o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            hf91Var2.t = i9;
            hf91Var2.i = i6 + i3;
        }
        if (z6) {
            hf91Var2.V(i7);
        }
        return arrayList;
    }

    public static void n(l371 l371Var, Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", l371Var.a);
        intent.putExtra("android.intent.extra.TEXT", l371Var.b + "\n" + l371Var.d);
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, null));
    }

    public r6t0 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new teg1(context, layoutInflater, viewGroup);
    }

    public Object apply(Object obj) {
        tpw0 tpw0Var;
        switch (this.a) {
            case 2:
                return k4h.d((CollectionPlatformEsperantoItemsResponse) obj);
            case 10:
                List list = (List) obj;
                list.getClass();
                return hs00.e(list);
            default:
                InitChildAccountConfigResponse initChildAccountConfigResponse = (InitChildAccountConfigResponse) obj;
                boolean zN = initChildAccountConfigResponse.n();
                boolean zO = initChildAccountConfigResponse.o();
                String dateOfBirthMinDate = initChildAccountConfigResponse.getDateOfBirthMinDate();
                String dateOfBirthMaxDate = initChildAccountConfigResponse.getDateOfBirthMaxDate();
                boolean available = initChildAccountConfigResponse.p().getAvailable();
                ewr0 ewr0Var = lwr0.a;
                ewr0 ewr0Var2 = available ? new ewr0(initChildAccountConfigResponse.p().getValue()) : ewr0Var;
                if (initChildAccountConfigResponse.q().getAvailable()) {
                    ewr0Var = new ewr0(initChildAccountConfigResponse.q().getValue());
                }
                dxr0 dxr0Var = new dxr0(ewr0Var2, ewr0Var);
                int iOrdinal = initChildAccountConfigResponse.r().ordinal();
                if (iOrdinal == 0) {
                    tpw0Var = tpw0.a;
                } else if (iOrdinal == 1) {
                    tpw0Var = tpw0.b;
                } else if (iOrdinal == 2) {
                    tpw0Var = tpw0.c;
                } else if (iOrdinal == 3) {
                    tpw0Var = tpw0.d;
                } else if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        eg.o();
                        return null;
                    }
                    tpw0Var = tpw0.a;
                } else {
                    tpw0Var = tpw0.e;
                }
                return new zsk(zN, zO, dateOfBirthMinDate, dateOfBirthMaxDate, dxr0Var, tpw0Var);
        }
    }

    public Object b(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    public void c(tx70 tx70Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-923634012);
        int i2 = (x340Var.g(tx70Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            c2p1.e(tx70Var, qim0Var, iu30Var, x340Var, i2 & 1022);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60(i, (Object) this, (Object) tx70Var, (Object) qim0Var, (Object) iu30Var, (byte) 6);
        }
    }

    public Object convert(int i) {
        wns0 wns0Var;
        if (i == 0) {
            wns0Var = wns0.b;
        } else if (i == 1) {
            wns0Var = wns0.c;
        } else if (i == 2) {
            wns0Var = wns0.d;
        } else if (i == 3) {
            wns0Var = wns0.e;
        } else if (i != 4) {
            wns0Var = i != 5 ? null : wns0.g;
        } else {
            wns0Var = wns0.f;
        }
        return wns0Var == null ? wns0.h : wns0Var;
    }

    public First e0(Object obj) {
        g150 g150Var = (g150) obj;
        i050 i050Var = g150Var.a;
        f150 f150Var = g150Var.c;
        if ((f150Var instanceof c150) || (f150Var instanceof d150)) {
            return First.c(g150.a(g150Var, false, d150.a, z150.a, 3), Collections.singleton(new j050(i050Var)));
        }
        if (f150Var instanceof e150) {
            return First.c(g150Var, Collections.singleton(new k050(i050Var)));
        }
        if (f150Var instanceof b150) {
            return First.b(g150Var);
        }
        eg.o();
        return null;
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        String strO = s4b1VarX.o(2);
        if (strO != null) {
            return new hrn0(c4t0.class, new yau(strO, lvx.k(s4b1VarX), e9k.s(s4b1VarX), e9k.r(s4b1VarX), true, khc.g()), a6w0.a);
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public Object apply(Object obj, Object obj2) {
        TargetDevice targetDeviceO;
        switch (this.a) {
            case 3:
                l0l l0lVar = (l0l) ((spq0) obj).h();
                nnr nnrVar = (nnr) ((spq0) obj2).h();
                if (l0lVar != null) {
                    if (nnrVar != null && l0lVar.l()) {
                        targetDeviceO = r4o1.O(nnrVar);
                    } else {
                        krd1 krd1VarN = TargetDevice.n();
                        pm21 pm21VarN = ReportedAttributes.n();
                        pm21VarN.n(l0lVar.getType().name());
                        krd1VarN.q(pm21VarN.build());
                        targetDeviceO = (TargetDevice) krd1VarN.build();
                    }
                } else {
                    targetDeviceO = r4o1.O(nnrVar);
                }
                return Optional.ofNullable(targetDeviceO);
            default:
                j331 j331Var = (j331) obj;
                hbz0 hbz0Var = new hbz0((j331) obj2, (byte) 11);
                if (j331Var instanceof v231) {
                    return (j331) hbz0Var.invoke(j331Var);
                }
                if ((j331Var instanceof c331) || (j331Var instanceof i231)) {
                    return j331Var;
                }
                eg.o();
                return null;
        }
    }
}
