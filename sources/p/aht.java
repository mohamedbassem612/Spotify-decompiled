package p;

import android.app.Activity;
import android.widget.TextView;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aht implements iu30 {
    public final /* synthetic */ byte a;
    public static final aht b = new aht(0);
    public static final aht c = new aht(1);
    public static final aht d = new aht(2);
    public static final aht e = new aht(3);
    public static final aht f = new aht(4);
    public static final aht g = new aht(5);
    public static final aht h = new aht(6);
    public static final aht i = new aht(7);
    public static final aht t = new aht(8);
    public static final aht X = new aht(9);
    public static final aht Y = new aht(10);
    public static final aht Z = new aht(11);
    public static final aht N0 = new aht(12);
    public static final aht O0 = new aht(13);
    public static final aht P0 = new aht(14);
    public static final aht Q0 = new aht(15);
    public static final aht R0 = new aht(16);
    public static final aht S0 = new aht(17);
    public static final aht T0 = new aht(18);
    public static final aht U0 = new aht(19);
    public static final aht V0 = new aht(20);
    public static final aht W0 = new aht(21);
    public static final aht X0 = new aht(22);
    public static final aht Y0 = new aht(23);
    public static final aht Z0 = new aht(24);
    public static final aht a1 = new aht(25);
    public static final aht b1 = new aht(26);
    public static final aht c1 = new aht(27);
    public static final aht d1 = new aht(28);
    public static final aht e1 = new aht(29);

    public /* synthetic */ aht(byte b2) {
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        a8b0 type;
        switch (this.a) {
            case 0:
                a8b0 a8b0Var = (a8b0) obj;
                cht chtVar = cht.c;
                return a8b0Var;
            case 1:
                cht chtVar2 = cht.c;
                return "";
            case 2:
                a8b0 a8b0Var2 = (a8b0) obj;
                mma0[] mma0VarArr = fht.Y;
                return a8b0Var2;
            case 3:
                mma0[] mma0VarArr2 = fht.Y;
                return "...";
            case 4:
                int i2 = kht.a;
                return ((n9r) obj).k();
            case 5:
                return Boolean.valueOf(obj instanceof TextView);
            case 6:
                return ((tsi1) obj).getType();
            case 7:
                return Boolean.valueOf(obj instanceof u5m);
            case 8:
                yxh yxhVar = sh10.a;
                tka0 tka0VarA = ((lft) obj).a();
                tka0 tka0Var = tka0VarA instanceof tka0 ? tka0VarA : null;
                return Boolean.valueOf(tka0Var != null && ((wdg) tka0Var).n().isInterface());
            case 9:
                yxh yxhVar2 = sh10.a;
                return Boolean.valueOf(u890.j(((lft) obj).a(), rc11.a.b(Object.class)));
            case 10:
                return Boolean.valueOf(obj instanceof HttpException);
            case 11:
                return 0;
            case 12:
                return Boolean.TRUE;
            case 13:
                return ((a8b0) obj).toString();
            case 14:
                return ((a8b0) obj).toString();
            case 15:
                Map map = n7a0.a;
                tsi1 tsi1VarW = rc2.w(l7a0.b, ((zim0) obj).e().k(rfb1.t));
                return (tsi1VarW == null || (type = tsi1VarW.getType()) == null) ? bkz.b(zjz.c1, new String[0]) : type;
            case 16:
                toe0 toe0Var = ((zim0) obj).D(iia0.f).f;
                mma0 mma0Var = dub0.i[0];
                List list = (List) toe0Var.invoke();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof zbc) {
                        arrayList.add(obj2);
                    }
                }
                return (n9r) o7h.q0(arrayList);
            case 17:
                return bb11.b(((Method) obj).getReturnType());
            case 18:
                Class cls = (Class) obj;
                cls.getClass();
                return bb11.b(cls);
            case 19:
                tdy0 tdy0Var = (tdy0) obj;
                se11 se11Var = mla0.a;
                return cht.e.u(tdy0Var) + " | " + i141.b(tdy0Var).n();
            case 20:
                u3b0 u3b0Var = (u3b0) obj;
                se11 se11Var2 = mla0.a;
                return u3b0Var.a() + " | " + hon1.u(u3b0Var);
            case 21:
                ov30 ov30Var = (ov30) obj;
                se11 se11Var3 = mla0.a;
                return cht.e.u(ov30Var) + " | " + i141.c(ov30Var).f();
            case 22:
                se11 se11Var4 = mla0.a;
                return String.valueOf(hon1.t((p3b0) obj));
            case 23:
                return Boolean.valueOf(obj instanceof Activity);
            case 24:
                mmr0 mmr0Var = (mmr0) obj;
                return ((String) mmr0Var.a) + " = " + ((k3b0) mmr0Var.b);
            case 25:
                ((Number) obj).intValue();
                return null;
            case 26:
                int i3 = lqb0.v;
                return Boolean.valueOf(!Modifier.isStatic(((ub11) obj).b().getModifiers()));
            case 27:
                xw81 xw81Var = (xw81) obj;
                mma0[] mma0VarArr3 = yqb0.m;
                return xw81Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                int i4 = brb0.f4p;
                return Boolean.valueOf(Modifier.isStatic(((ub11) obj).b().getModifiers()));
            default:
                int i5 = brb0.f4p;
                return ((zpi0) obj).f();
        }
    }
}
