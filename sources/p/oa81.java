package p;

import android.net.Uri;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.signup.signup.v2.proto.FieldError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oa81 extends hab0 implements iu30 {
    public static final oa81 N0;
    public static final oa81 O0;
    public static final oa81 P0;
    public static final oa81 Q0;
    public static final oa81 R0;
    public static final oa81 S0;
    public static final oa81 T0;
    public static final oa81 U0;
    public static final oa81 V0;
    public static final oa81 W0;
    public static final oa81 X;
    public static final oa81 X0;
    public static final oa81 Y;
    public static final oa81 Y0;
    public static final oa81 Z;
    public static final oa81 Z0;
    public static final oa81 a1;
    public static final oa81 b;
    public static final oa81 b1;
    public static final oa81 c;
    public static final oa81 c1;
    public static final oa81 d;
    public static final oa81 d1;
    public static final oa81 e;
    public static final oa81 e1;
    public static final oa81 f;
    public static final oa81 g;
    public static final oa81 h;
    public static final oa81 i;
    public static final oa81 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new oa81(i2, (byte) 0);
        c = new oa81(i2, (byte) 1);
        d = new oa81(i2, (byte) 2);
        e = new oa81(i2, (byte) 3);
        f = new oa81(i2, (byte) 4);
        g = new oa81(i2, (byte) 5);
        h = new oa81(i2, (byte) 6);
        i = new oa81(i2, (byte) 7);
        t = new oa81(i2, (byte) 8);
        X = new oa81(i2, (byte) 9);
        Y = new oa81(i2, (byte) 10);
        Z = new oa81(i2, (byte) 11);
        N0 = new oa81(i2, (byte) 12);
        O0 = new oa81(i2, (byte) 13);
        P0 = new oa81(i2, (byte) 14);
        Q0 = new oa81(i2, (byte) 15);
        R0 = new oa81(i2, (byte) 16);
        S0 = new oa81(i2, (byte) 17);
        T0 = new oa81(i2, (byte) 18);
        U0 = new oa81(i2, (byte) 19);
        V0 = new oa81(i2, (byte) 20);
        W0 = new oa81(i2, (byte) 21);
        X0 = new oa81(i2, (byte) 22);
        Y0 = new oa81(i2, (byte) 23);
        Z0 = new oa81(i2, (byte) 24);
        a1 = new oa81(i2, (byte) 25);
        b1 = new oa81(i2, (byte) 26);
        c1 = new oa81(i2, (byte) 27);
        d1 = new oa81(i2, (byte) 28);
        e1 = new oa81(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa81(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        Object next;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((nwl0) obj).e();
            case 1:
                return new i2l0((i3l0) obj);
            case 2:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((i2l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 3:
                return "campfire-include-in-suggestions";
            case 4:
                return new huz(Boolean.valueOf(((String) obj).equals("1")), (byte) 10);
            case 5:
                return ((nwl0) obj).e();
            case 6:
                return rih1Var;
            case 7:
                return ((hc81) obj).c;
            case 8:
                ud81 ud81Var = (ud81) obj;
                return new vd81(ud81Var.c, ud81Var.a, ud81Var.b, false);
            case 9:
                return td81.a;
            case 10:
                return ((ic81) obj).c;
            case 11:
                return new qxl0(new mjl0(new opl0((r6h1) obj, (byte) 17)));
            case 12:
                return "shuffle-algorithm";
            case 13:
                String str = (String) obj;
                List list = re81.e;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pe81) it.next()).a);
                }
                Iterator it2 = oe81.e.iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    if (((oe81) next).a.equals(str)) {
                        return new huz(Integer.valueOf(arrayList.indexOf((oe81) next)), (byte) 10);
                    }
                }
                next = null;
                return new huz(Integer.valueOf(arrayList.indexOf((oe81) next)), (byte) 10);
            case 14:
                return new xe81(we81.a, false, false);
            case 15:
                return zf81.a;
            case 16:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 17:
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((bi81) obj).a.f.a();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new ci81((bi81) obj, fi81.b);
            case 20:
                ((ez20) obj).c(false);
                return rih1Var;
            case 21:
                return rih1Var;
            case 22:
                ti81 ti81Var = (ti81) obj;
                mmr0 mmr0Var = new mmr0("username", ti81Var.a);
                mmr0 mmr0Var2 = new mmr0("imageUri", ti81Var.b);
                mmr0 mmr0Var3 = new mmr0("displayName", ti81Var.c);
                u7h u7hVar = ti81Var.d;
                return mno1.h(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, new mmr0("backgroundColor", Integer.valueOf(u7hVar != null ? z4p1.G(u7hVar.a) : 0))});
            case 23:
                return new aj81((String) null, (Uri) null, (String) null, (u7h) null, ((zi81) obj).a, 47);
            case 24:
                aj81 aj81Var = (aj81) obj;
                mmr0 mmr0Var4 = new mmr0("username", aj81Var.a);
                mmr0 mmr0Var5 = new mmr0("imageUri", aj81Var.b);
                mmr0 mmr0Var6 = new mmr0("displayName", aj81Var.c);
                u7h u7hVar2 = aj81Var.d;
                return mno1.h(new mmr0[]{mmr0Var4, mmr0Var5, mmr0Var6, new mmr0("backgroundColor", Integer.valueOf(u7hVar2 != null ? z4p1.G(u7hVar2.a) : 0))});
            case 25:
                ((xas) obj).a(Z0, yd81.X);
                return rih1Var;
            case 26:
                return Boolean.valueOf(((aj81) obj).e.a instanceof ii81);
            case 27:
                return rih1Var;
            case 28:
                return ((FieldError) obj).getMessage();
            default:
                return ((FieldError) obj).getMessage();
        }
    }
}
