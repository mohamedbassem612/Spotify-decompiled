package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wmn extends hab0 implements vu30 {
    public static final wmn N0;
    public static final wmn O0;
    public static final wmn P0;
    public static final wmn Q0;
    public static final wmn R0;
    public static final wmn S0;
    public static final wmn T0;
    public static final wmn U0;
    public static final wmn V0;
    public static final wmn W0;
    public static final wmn X;
    public static final wmn X0;
    public static final wmn Y;
    public static final wmn Y0;
    public static final wmn Z;
    public static final wmn Z0;
    public static final wmn a1;
    public static final wmn b;
    public static final wmn b1;
    public static final wmn c;
    public static final wmn c1;
    public static final wmn d;
    public static final wmn d1;
    public static final wmn e;
    public static final wmn e1;
    public static final wmn f;
    public static final wmn g;
    public static final wmn h;
    public static final wmn i;
    public static final wmn t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new wmn(i2, (byte) 0);
        c = new wmn(i2, (byte) 1);
        d = new wmn(i2, (byte) 2);
        e = new wmn(i2, (byte) 3);
        f = new wmn(i2, (byte) 4);
        g = new wmn(i2, (byte) 5);
        h = new wmn(i2, (byte) 6);
        i = new wmn(i2, (byte) 7);
        t = new wmn(i2, (byte) 8);
        X = new wmn(i2, (byte) 9);
        Y = new wmn(i2, (byte) 10);
        Z = new wmn(i2, (byte) 11);
        N0 = new wmn(i2, (byte) 12);
        O0 = new wmn(i2, (byte) 13);
        P0 = new wmn(i2, (byte) 14);
        Q0 = new wmn(i2, (byte) 15);
        R0 = new wmn(i2, (byte) 16);
        S0 = new wmn(i2, (byte) 17);
        T0 = new wmn(i2, (byte) 18);
        U0 = new wmn(i2, (byte) 19);
        V0 = new wmn(i2, (byte) 20);
        W0 = new wmn(i2, (byte) 21);
        X0 = new wmn(i2, (byte) 22);
        Y0 = new wmn(i2, (byte) 23);
        Z0 = new wmn(i2, (byte) 24);
        a1 = new wmn(i2, (byte) 25);
        b1 = new wmn(i2, (byte) 26);
        c1 = new wmn(i2, (byte) 27);
        d1 = new wmn(i2, (byte) 28);
        e1 = new wmn(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmn(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        mq70 mq70Var;
        List list;
        up70 up70Var;
        goj0 goj0VarA;
        List list2;
        byte b2 = this.a;
        z6x z6xVarY0 = z6x.a;
        z6x arrayList = null;
        switch (b2) {
            case 0:
                return new u7h(u7h.b(((afx) obj).d.a, 0.1f, 0.0f, 0.0f, 0.0f, 14));
            case 1:
                return new ann((xmn) obj);
            case 2:
                Logger.l((Throwable) obj2, "Failure from createOrUpdatePendingShow endpoint", new Object[0]);
                return new cwk((gmc1) obj);
            case 3:
                return Next.j();
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                c0o c0oVar = (c0o) obj;
                b0o b0oVar = (b0o) obj2;
                int i2 = c0oVar.e;
                String str2 = c0oVar.b;
                x4i1 x4i1Var = c0oVar.a;
                return new h0o(str2, x4i1Var != null ? x4i1Var.a : null, (b0oVar.b || i2 == 3) ? i2 : 1, b0oVar.a, c0oVar.f, c0oVar.g);
            case 7:
                return zso1.c0(((afr0) obj).g, (op80) obj2);
            case 8:
                return zso1.c0(((oer0) obj).b, (op80) obj2);
            case 9:
                return zso1.c0(((per0) obj).b, (op80) obj2);
            case 10:
                l3o l3oVar = (l3o) obj;
                k3o k3oVar = (k3o) u890.k((k1r) obj2, (d0r) null, (n4r) null);
                return new m3o(l3oVar.c, k3oVar.a, k3oVar.b, l3oVar.b, l3oVar.a);
            case 11:
                xkk1 xkk1Var = (xkk1) obj2;
                String str3 = ((jo70) obj).a;
                if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (list = mq70Var.a) == null || (up70Var = (up70) o7h.s0(list)) == null || (str = up70Var.a.a) == null) {
                    str = "";
                }
                return new k3o(str3, str);
            case 12:
                return new ny6((jo70) obj, (xkk1) obj2);
            case 13:
                o4o o4oVar = (o4o) obj;
                String str4 = o4oVar.a;
                hoj0 hoj0VarC = ((ioj0) obj2).c(bz6.class, str4);
                if (hoj0VarC != null && (goj0VarA = hoj0VarC.a()) != null) {
                    arrayList = (bz6) goj0VarA.a;
                }
                String str5 = o4oVar.b;
                boolean z = o4oVar.d;
                if (arrayList != null) {
                    ArrayList arrayList2 = ((bz6) arrayList).a;
                    tr80 tr80Var = o4oVar.c;
                    int i3 = ((rr80) tr80Var).a;
                    int i4 = i3 >= 0 ? i3 : 0;
                    int i5 = ((rr80) tr80Var).b;
                    int size = arrayList2.size() - 1;
                    if (i5 > size) {
                        i5 = size;
                    }
                    z6xVarY0 = o7h.Y0(arrayList2, new tr80(i4, i5, 1));
                }
                return new p4o(str4, str5, z6xVarY0, z);
            case 14:
                String str6 = (String) obj;
                q6o q6oVar = (q6o) obj2;
                jo70 jo70Var = q6oVar.b;
                if (jo70Var != null && (list2 = jo70Var.d) != null) {
                    List list3 = list2;
                    arrayList = new ArrayList(q7h.U(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ho70) it.next()).b);
                    }
                }
                if (arrayList != null) {
                    z6xVarY0 = arrayList;
                }
                ArrayList<g7o> arrayList3 = q6oVar.a.a;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                for (g7o g7oVarA : arrayList3) {
                    if (!o7h.i0((Iterable) z6xVarY0, g7oVarA.c)) {
                        g7oVarA = g7o.a(g7oVarA);
                    }
                    arrayList4.add(g7oVarA);
                }
                return new r6o(str6, arrayList4);
            case 15:
                return new q6o((j7o) obj, (jo70) obj2);
            case 16:
                return new v6o((String) obj2, ((u6o) obj).b);
            case 17:
                return null;
            case 18:
                return null;
            case 19:
                return null;
            case 20:
                return null;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return null;
            case 22:
                return null;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return null;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return null;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return null;
            case 26:
                return null;
            case 27:
                return null;
            case 28:
                return null;
            default:
                sbo sboVar = (sbo) obj;
                nbo nboVar = (obo) obj2;
                if (nboVar instanceof nbo) {
                    return new vbo(nboVar.a);
                }
                if (nboVar instanceof mbo) {
                    mbo mboVar = (mbo) nboVar;
                    sbo sboVar2 = mboVar.a;
                    return new ubo(sboVar2.e, sboVar2.f, sboVar2.g, sboVar2.i, sboVar2.j, sboVar2.k, mboVar.b, sboVar.c, sboVar.d, sboVar.b, sboVar.a);
                }
                if (nboVar instanceof lbo) {
                    return tbo.a;
                }
                eg.o();
                return null;
        }
    }
}
