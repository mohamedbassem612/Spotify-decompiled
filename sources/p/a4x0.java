package p;

import android.content.Intent;
import com.google.protobuf.Empty;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.socialgraph.esperanto.proto.FollowedUsersResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a4x0 implements jrn0, Predicate, Function, av30, uga1, g4u, Init, Function5, Function3, tax, rb, w38 {
    public final /* synthetic */ byte a;
    public static final a4x0 b = new a4x0(0);
    public static final a4x0 c = new a4x0(1);
    public static final a4x0 d = new a4x0(2);
    public static final a4x0 e = new a4x0(3);
    public static final a4x0 f = new a4x0(4);
    public static final a4x0 g = new a4x0(5);
    public static final a4x0 h = new a4x0(6);
    public static final a4x0 i = new a4x0(8);
    public static final a4x0 t = new a4x0(9);
    public static final a4x0 X = new a4x0(10);
    public static final a4x0 Y = new a4x0(11);
    public static final a4x0 Z = new a4x0(12);
    public static final a4x0 N0 = new a4x0(13);
    public static final a4x0 O0 = new a4x0(14);
    public static final a4x0 P0 = new a4x0(15);
    public static final a4x0 Q0 = new a4x0(16);
    public static final a4x0 R0 = new a4x0(17);
    public static final a4x0 S0 = new a4x0(18);
    public static final a4x0 T0 = new a4x0(19);
    public static final a4x0 U0 = new a4x0(20);
    public static final a4x0 V0 = new a4x0(21);
    public static final a4x0 W0 = new a4x0(22);
    public static final a4x0 X0 = new a4x0(23);
    public static final a4x0 Y0 = new a4x0(24);
    public static final a4x0 Z0 = new a4x0(25);
    public static final a4x0 a1 = new a4x0(26);

    public /* synthetic */ a4x0(byte b2) {
        this.a = b2;
    }

    public static boolean b(d1s0 d1s0Var) {
        return d1s0Var.b();
    }

    @Override // p.rb
    public boolean accept(Object obj) {
        Set set = s4b1.f;
        Intent intent = ((iw81) obj).a;
        String strA = uic.x(intent != null ? intent.getDataString() : null).a();
        return !(strA == null || strA.length() == 0);
    }

    /* JADX WARN: Code duplicated, block: B:95:0x01cf  */
    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        int i2;
        Boolean boolD1;
        List list;
        int i3 = 2;
        boolean zBooleanValue = true;
        switch (this.a) {
            case 2:
                beh behVar = (feh) obj;
                return behVar instanceof beh ? new u8z0(behVar.a) : v8z0.a;
            case 3:
                m901 m901Var = (m901) obj;
                m901Var.getClass();
                int i4 = m901Var.k;
                int iC = l1d.C(i4);
                qpe1 qpe1Var = iC != 0 ? iC != 3 ? qpe1.b : qpe1.d : qpe1.c;
                String str = m901Var.a;
                String str2 = m901Var.d;
                String str3 = m901Var.e;
                ArrayList arrayListU = ago1.u(m901Var.f, m901Var.g, str3, str, m901Var.i, false);
                int i5 = m901Var.f;
                int i6 = m901Var.g;
                boolean z = m901Var.m;
                int iC2 = l1d.C(i4);
                if (iC2 != 0) {
                    if (iC2 == 1 || iC2 == 2) {
                        i3 = z ? 4 : 5;
                    } else {
                        if (iC2 != 3) {
                            eg.o();
                            return null;
                        }
                        if (z) {
                            i2 = 3;
                        }
                    }
                    i2 = i3;
                } else if (z) {
                    i2 = 3;
                } else {
                    i2 = i3;
                }
                return new dbg1(str, str2, str3, arrayListU, i5, i6, true, i2, bbp1.q(qpe1Var));
            case 4:
                ContextTrack contextTrack = (ContextTrack) obj;
                contextTrack.getClass();
                String str4 = (String) contextTrack.metadata().get("screen_recording_enabled");
                if (str4 != null && (boolD1 = ihc1.d1(str4)) != null) {
                    zBooleanValue = boolD1.booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 5:
                return ((tz11) obj).a.a().a;
            case 6:
                String message = ((Throwable) obj).getMessage();
                return new eeh(2, message != null ? cy30.g("com.spotify.music.extra.ERROR", message) : null);
            case 7:
            case 8:
            default:
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    vu21 vu21Var = (wu21) entry.getValue();
                    if (vu21Var instanceof vu21) {
                        up70 up70VarA = vu21Var.a.a(vp70.c);
                        String str5 = up70VarA != null ? up70VarA.a.a : null;
                        linkedHashMap.put(key, str5);
                    } else if (!(vu21Var instanceof tu21) && !(vu21Var instanceof uu21)) {
                        eg.o();
                        return null;
                    }
                    linkedHashMap.put(key, str5);
                }
                return new x8z0(linkedHashMap);
            case 9:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 10:
                return Boolean.FALSE;
            case 11:
                return new kp81((sh2) obj);
            case 12:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    arrayList.add((Map) obj2);
                }
                ArrayList<Map.Entry> arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r7h.W(((Map) it.next()).entrySet(), arrayList2);
                }
                int iS = zno1.s(q7h.U(arrayList2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                for (Map.Entry entry2 : arrayList2) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
                return linkedHashMap2;
            case 13:
                py21 py21Var = (py21) obj;
                if (py21Var instanceof ly21) {
                    list = z6x.a;
                } else {
                    if (!(py21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    list = (List) ((oy21) py21Var).a;
                }
                return list;
            case 14:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return FollowedUsersResponse.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.socialgraph.esperanto.proto.FollowedUsersResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
        }
    }

    public void c(xax xaxVar) {
        int i2;
        String str = xaxVar.a;
        int i3 = xaxVar.d;
        int length = str.length();
        if (i3 < length) {
            char cCharAt = str.charAt(i3);
            i2 = 0;
            while (eko1.x(cCharAt) && i3 < length) {
                i2++;
                i3++;
                if (i3 < length) {
                    cCharAt = str.charAt(i3);
                }
            }
        } else {
            i2 = 0;
        }
        if (i2 >= 2) {
            char cCharAt2 = str.charAt(xaxVar.d);
            char cCharAt3 = str.charAt(xaxVar.d + 1);
            if (eko1.x(cCharAt2) && eko1.x(cCharAt3)) {
                xaxVar.d((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + 130));
                xaxVar.d += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
            }
        }
        char cA = xaxVar.a();
        int iA = eko1.A(xaxVar.d, 0, str);
        if (iA == 0) {
            if (!eko1.y(cA)) {
                xaxVar.d((char) (cA + 1));
                xaxVar.d++;
                return;
            } else {
                xaxVar.d((char) 235);
                xaxVar.d((char) (cA - 127));
                xaxVar.d++;
                return;
            }
        }
        if (iA == 1) {
            xaxVar.d((char) 230);
            xaxVar.e = 1;
            return;
        }
        if (iA == 2) {
            xaxVar.d((char) 239);
            xaxVar.e = 2;
            return;
        }
        if (iA == 3) {
            xaxVar.d((char) 238);
            xaxVar.e = 3;
        } else if (iA == 4) {
            xaxVar.d((char) 240);
            xaxVar.e = 4;
        } else if (iA != 5) {
            eg.m("Illegal mode: ".concat(String.valueOf(iA)));
        } else {
            xaxVar.d((char) 231);
            xaxVar.e = 5;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function5
    public Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new jof1((ContextTrack) obj, (vof1) obj2, (l4m) obj3, ((Boolean) obj4).booleanValue(), (gqa1) obj5);
    }

    @Override // com.spotify.mobius.Init
    public First e0(Object obj) {
        switch (this.a) {
            case 17:
                sud1 sud1Var = (sud1) obj;
                sud1Var.getClass();
                Set setW0 = dm61.w0(utd1.a);
                if (sud1Var.b()) {
                    setW0.add(wtd1.a);
                }
                return First.c(sud1Var, setW0);
            default:
                return First.b((xzi1) obj);
        }
    }

    @Override // p.jrn0
    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        String strZ = uic.C(th61Var.a, (String) null).z();
        strZ.getClass();
        return new hrn0(x3x0.class, new y3x0(12, strZ, th61Var.a, false, false), a6w0.a);
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    public Object n(Object obj, Object obj2, Object obj3) {
        pr61 pr61Var = (pr61) obj2;
        pr61 pr61Var2 = (pr61) obj3;
        prm1 prm1Var = (prm1) ((Map) prm1.f.getValue()).get((pr61) obj);
        if (prm1Var == null) {
            prm1Var = prm1.i;
        }
        pr61 pr61Var3 = prm1Var.c;
        qrm1 qrm1Var = (qrm1) ((Map) qrm1.f.getValue()).get(pr61Var);
        if (qrm1Var == null) {
            qrm1Var = qrm1.i;
        }
        pr61 pr61Var4 = qrm1Var.c;
        String str = pr61Var2.c;
        return new orm1(pr61Var3, pr61Var4, (pr61) ((k9) (u890.j(str, rca.e) ? mqm1.c : new nqm1(Integer.parseInt(str)))).b);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return !((uv00) obj).f;
            case 8:
                CharSequence charSequence = (CharSequence) ((Map) obj).get("catalogue");
                return !(charSequence == null || charSequence.length() == 0);
            case 19:
                return !((uv00) obj).f;
            case 22:
                return ((PlayerState) obj).track().c();
            default:
                nl61 nl61Var = (nl61) obj;
                return (nl61Var instanceof ml61) || (nl61Var instanceof jl61) || (nl61Var instanceof il61);
        }
    }

    public boolean test(Object obj, Object obj2) {
        return !u890.j(((b9c1) obj).b, ((b9c1) obj2).b);
    }

    @Override // p.w38
    public void a(int i2, String str, Integer num, String str2) {
    }
}
