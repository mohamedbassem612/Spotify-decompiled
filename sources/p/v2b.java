package p;

import android.app.Notification;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v2b extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2b(int i, Object obj, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return new v2b(obj3, this.b, obj2, lnmVar, (byte) 0);
            case 1:
                return new v2b(obj3, this.b, obj2, lnmVar, (byte) 1);
            case 2:
                return new v2b(obj3, obj2, this.b, lnmVar, (byte) 2);
            case 3:
                return new v2b(this.b, obj3, (ven0) obj2, lnmVar, (byte) 3);
            case 4:
                return new v2b(this.b, obj3, (ven0) obj2, lnmVar, (byte) 4);
            case 5:
                return new v2b(obj3, obj2, this.b, lnmVar, (byte) 5);
            case 6:
                return new v2b(obj3, this.b, obj2, lnmVar, (byte) 6);
            case 7:
                return new v2b(obj3, obj2, this.b, lnmVar, (byte) 7);
            case 8:
                return new v2b(obj3, obj2, this.b, lnmVar, (byte) 8);
            case 9:
                return new v2b(obj3, this.b, obj2, lnmVar, (byte) 9);
            case 10:
                return new v2b(obj3, this.b, obj2, lnmVar, (byte) 10);
            case 11:
                return new v2b(obj3, obj2, this.b, lnmVar, (byte) 11);
            case 12:
                return new v2b(obj3, this.b, obj2, lnmVar, (byte) 12);
            case 13:
                return new v2b(obj3, obj2, this.b, lnmVar, (byte) 13);
            default:
                return new v2b(this.b, obj3, (ven0) obj2, lnmVar, (byte) 14);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws IOException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 9:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) throws IOException {
        lgy lgyVar;
        Uri contentUri;
        iu30 iu30Var;
        byte b = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        int i = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                it8 it8Var = (it8) obj2;
                String str = ((ktc1) obj3).a;
                i8h1 i8h1Var = (i8h1) it8Var.b;
                otk0 otk0Var = (otk0) it8Var.c;
                Integer numValueOf = Integer.valueOf(i);
                x6h1 x6h1VarC = otk0Var.b.c();
                x6h1VarC.i.add(new a7h1("suggestion_card", (String) null, numValueOf, (String) null, str));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                k7h1Var.a = y6h1VarA;
                k7h1Var.c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = otk0Var.c.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1Var;
            case 1:
                hm5.M(obj);
                vb2.b((vb2) ((fta) obj2).c, new cb2(i), true, (tv80) obj3);
                return rih1Var;
            case 2:
                hm5.M(obj);
                kt91 kt91Var = (kt91) obj2;
                String str2 = (String) obj3;
                if (str2 != null) {
                    lgyVar = new lgy();
                    lgyVar.c = str2;
                    lgyVar.a = false;
                } else {
                    n57.k(i != 0, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
                    lgy lgyVar2 = new lgy();
                    Integer num = (Integer) lgyVar2.d;
                    if (num != null && num.intValue() == 0) {
                        z = false;
                    }
                    n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                    lgyVar2.d = Integer.valueOf(i);
                    lgyVar2.a = false;
                    lgyVar = lgyVar2;
                }
                kt91Var.k(lgyVar.c());
                return rih1Var;
            case 3:
                hm5.M(obj);
                err0 err0Var = (hdn0) obj3;
                if (err0Var.s() == -1) {
                    err0Var.t(i);
                } else if (err0Var.s() == 0) {
                    ((Function0) obj2).invoke();
                }
                err0Var.t(i);
                return rih1Var;
            case 4:
                hm5.M(obj);
                ven0 ven0Var = (ven0) obj2;
                Integer num2 = (Integer) ven0Var.getValue();
                if (num2 != null && num2.intValue() == i) {
                    ven0Var.setValue((Object) null);
                } else {
                    ((hdn0) obj3).t(i);
                }
                return rih1Var;
            case 5:
                hm5.M(obj);
                b5x b5xVar = (b5x) obj2;
                ArrayList arrayList = b5xVar.g;
                arrayList.clear();
                List list = (List) obj3;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new m5x((String) it.next(), 0, 4));
                }
                arrayList.addAll(arrayList2);
                h46 h46Var = b5xVar.i;
                if (h46Var != null) {
                    lj90 lj90Var = b5xVar.h;
                    if (lj90Var == null) {
                        u890.C("recentItemGroup");
                        throw null;
                    }
                    tr80 tr80VarD = h46Var.d(lj90Var);
                    lj90 lj90Var2 = b5xVar.h;
                    if (lj90Var2 == null) {
                        u890.C("recentItemGroup");
                        throw null;
                    }
                    if (lj90Var2.b() > i) {
                        m4x m4xVar = b5xVar.t;
                        if (m4xVar == null) {
                            u890.C("bodyAdapter");
                            throw null;
                        }
                        int i2 = ((rr80) tr80VarD).a + i;
                        lj90 lj90Var3 = b5xVar.h;
                        if (lj90Var3 == null) {
                            u890.C("recentItemGroup");
                            throw null;
                        }
                        m4xVar.k(i2, lj90Var3.b() - i);
                    } else {
                        lj90 lj90Var4 = b5xVar.h;
                        if (lj90Var4 == null) {
                            u890.C("recentItemGroup");
                            throw null;
                        }
                        if (lj90Var4.b() < i) {
                            m4x m4xVar2 = b5xVar.t;
                            if (m4xVar2 == null) {
                                u890.C("bodyAdapter");
                                throw null;
                            }
                            int i3 = ((rr80) tr80VarD).a;
                            lj90 lj90Var5 = b5xVar.h;
                            if (lj90Var5 == null) {
                                u890.C("recentItemGroup");
                                throw null;
                            }
                            int iB = lj90Var5.b() + i3;
                            lj90 lj90Var6 = b5xVar.h;
                            if (lj90Var6 == null) {
                                u890.C("recentItemGroup");
                                throw null;
                            }
                            m4xVar2.l(iB, i - lj90Var6.b());
                        }
                    }
                    m4x m4xVar3 = b5xVar.t;
                    if (m4xVar3 == null) {
                        u890.C("bodyAdapter");
                        throw null;
                    }
                    int i4 = ((rr80) tr80VarD).a;
                    lj90 lj90Var7 = b5xVar.h;
                    if (lj90Var7 == null) {
                        u890.C("recentItemGroup");
                        throw null;
                    }
                    ((z511) m4xVar3).a.d(i4, Math.min(i, lj90Var7.b()), (Object) null);
                    b5xVar.f = false;
                }
                return rih1Var;
            case 6:
                hm5.M(obj);
                try {
                    ((pd30) obj2).a.notify(i, (Notification) obj3);
                    new Integer(i);
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    Logger.b(ab80.n("ArrayIndexOutOfBoundsException when notifying notification: id=", ", error=", i, e.getMessage()), new Object[0]);
                } catch (ClassCastException e2) {
                    Logger.b("ClassCastException when notifying notification: id=%d, error=%s", new Object[]{new Integer(i), e2.getMessage()});
                }
                return rih1Var;
            case 7:
                hm5.M(obj);
                haa0 haa0Var = ((zgb0) obj2).h;
                String str3 = ((rib0) obj3).a;
                i8h1 i8h1Var2 = (i8h1) ((kly0) haa0Var.b).get();
                tdl0 tdl0Var = (tdl0) haa0Var.c;
                Integer numValueOf2 = Integer.valueOf(i);
                x6h1 x6h1VarC2 = tdl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("candidate_track_row", (String) null, numValueOf2, str3, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                k7h1Var2.a = y6h1VarA2;
                k7h1Var2.c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = tdl0Var.c;
                i8h1Var2.f(k7h1Var2.a(), (Set) null);
                return rih1Var;
            case 8:
                hm5.M(obj);
                k3i0 k3i0Var = (k3i0) obj2;
                p8i0 p8i0Var = (p8i0) obj3;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 29) {
                    int iOrdinal = p8i0Var.ordinal();
                    if (iOrdinal == 0) {
                        contentUri = MediaStore.Images.Media.getContentUri("external");
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        contentUri = MediaStore.Video.Media.getContentUri("external");
                    }
                    contentUri.getClass();
                } else {
                    int iOrdinal2 = p8i0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else {
                        if (iOrdinal2 != 1) {
                            eg.o();
                            return null;
                        }
                        contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    }
                    contentUri.getClass();
                }
                Uri uri = contentUri;
                String[] strArr = {"_id", "date_added", "width", "height", "mime_type", "_size"};
                if (p8i0Var == p8i0.VIDEO) {
                    strArr = (String[]) f46.z0(strArr, "duration");
                }
                String[] strArr2 = strArr;
                Cursor cursorE = i5 >= 30 ? k3i0Var.e(uri, strArr2, i) : ((ContentResolver) k3i0Var.c).query(uri, strArr2, null, null, f4i1.c(i, "date_added DESC LIMIT 200 OFFSET "));
                if (cursorE == null) {
                    return z6x.a;
                }
                try {
                    ArrayList arrayListD = k3i0.d(cursorE, uri, p8i0Var);
                    cursorE.close();
                    return arrayListD;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(cursorE, th);
                        throw th2;
                    }
                }
            case 9:
                hm5.M(obj);
                ((dxb) obj2).a.t(i);
                cxb cxbVar = (cxb) ((ven0) obj3).getValue();
                if (cxbVar != null && (iu30Var = cxbVar.a) != null) {
                    iu30Var.invoke(new Integer(i));
                }
                return rih1Var;
            case 10:
                hm5.M(obj);
                ((iu30) obj2).invoke(new uvs0(i, ((txs0) obj3).b));
                return rih1Var;
            case 11:
                hm5.M(obj);
                ((iu30) obj2).invoke(new bws0((gxs0) obj3, i));
                return rih1Var;
            case 12:
                hm5.M(obj);
                ((vu30) obj2).invoke(new Integer(i), (String) obj3);
                return rih1Var;
            case 13:
                hm5.M(obj);
                ((vu30) obj2).invoke((yc90) obj3, new Integer(i));
                return rih1Var;
            default:
                hm5.M(obj);
                ven0 ven0Var2 = (ven0) obj3;
                Integer num3 = (Integer) ven0Var2.getValue();
                if (num3 == null || i != num3.intValue()) {
                    ven0Var2.setValue(new Integer(i));
                    ((View) obj2).announceForAccessibility(String.valueOf(i));
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2b(Object obj, int i, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2b(Object obj, Object obj2, int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
