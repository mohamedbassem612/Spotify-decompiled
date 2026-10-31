package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yn0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public Object e;
    public Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(String str, String str2, String str3, List list, String str4, String str5, List list2, g9i1 g9i1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.c = str;
        this.d = str2;
        this.g = str3;
        this.e = list;
        this.h = str4;
        this.i = str5;
        this.f = list2;
        this.t = g9i1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.t;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new yn0((ao0) this.e, (co0) this.f, (String) this.c, (Long) obj2, (String) this.d, (String) obj5, (String) obj4, (String) obj3, lnmVar);
            case 1:
                return new yn0((Bundle) this.e, (ajq0) this.f, (String) this.c, (mct0) obj5, (String) this.d, (q1m) obj4, (iu30) obj3, (vu30) obj2, lnmVar);
            case 2:
                yn0 yn0Var = new yn0((Iterable) this.f, lnmVar, (yj41) this.c, (yj41) this.d, (yj41) obj5, (yj41) obj4, (g7m1) obj3, (a3k) obj2, (byte) 2);
                yn0Var.e = obj;
                return yn0Var;
            case 3:
                yn0 yn0Var2 = new yn0((Iterable) this.f, lnmVar, (yj41) this.c, (yj41) this.d, (yj41) obj5, (yj41) obj4, (g7m1) obj3, (a3k) obj2, (byte) 3);
                yn0Var2.e = obj;
                return yn0Var2;
            case 4:
                yn0 yn0Var3 = new yn0((ArrayList) this.f, (k261) this.d, (cyp0) obj5, (String) this.c, (rm5) obj4, (tz01) obj3, (xaz0) obj2, lnmVar);
                yn0Var3.e = obj;
                return yn0Var3;
            case 5:
                return new yn0(this.e, (String) this.c, (Parcelable) this.f, this.d, obj5, obj4, obj3, obj2, lnmVar, (byte) 5);
            case 6:
                yn0 yn0Var4 = new yn0((iev0) obj5, (haa0) obj4, (dr11) obj3, (qxc0) obj2, lnmVar, (byte) 6);
                yn0Var4.d = obj;
                return yn0Var4;
            case 7:
                yn0 yn0Var5 = new yn0((nav0) this.f, (l811) this.c, (l811) this.d, (l811) obj5, (p811) obj4, (i0g0) obj3, (lbc0) obj2, lnmVar);
                yn0Var5.e = obj;
                return yn0Var5;
            case 8:
                return new yn0(this.e, this.f, this.c, this.d, obj5, obj4, obj3, obj2, lnmVar, (byte) 8);
            case 9:
                return new yn0(this.e, (String) this.c, (Parcelable) this.f, this.d, obj5, obj4, obj3, obj2, lnmVar, (byte) 9);
            case 10:
                yn0 yn0Var6 = new yn0((aj71) obj5, (ri71) obj4, (fl71) obj3, (ti71) obj2, lnmVar, (byte) 10);
                yn0Var6.d = obj;
                return yn0Var6;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new yn0(this.e, this.f, this.c, this.d, obj5, obj4, obj3, obj2, lnmVar, (byte) 11);
            default:
                return new yn0((String) this.c, (String) this.d, (String) obj5, (List) this.e, (String) obj4, (String) obj3, (List) this.f, (g9i1) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((py21) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((jl71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0461  */
    /* JADX WARN: Code duplicated, block: B:176:0x046b  */
    /* JADX WARN: Code duplicated, block: B:179:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:180:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:182:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:185:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:187:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:188:0x04da  */
    /* JADX WARN: Code duplicated, block: B:190:0x04de  */
    /* JADX WARN: Code duplicated, block: B:194:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:344:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x04ad -> B:181:0x04b1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 2068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn0(Iterable iterable, lnm lnmVar, yj41 yj41Var, yj41 yj41Var2, yj41 yj41Var3, yj41 yj41Var4, g7m1 g7m1Var, a3k a3kVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = iterable;
        this.c = yj41Var;
        this.d = yj41Var2;
        this.g = yj41Var3;
        this.h = yj41Var4;
        this.i = g7m1Var;
        this.t = a3kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
        this.t = obj8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn0(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.t = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn0(Object obj, String str, Parcelable parcelable, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.c = str;
        this.f = parcelable;
        this.d = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
        this.t = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(Bundle bundle, ajq0 ajq0Var, String str, mct0 mct0Var, String str2, q1m q1mVar, iu30 iu30Var, vu30 vu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.e = bundle;
        this.f = ajq0Var;
        this.c = str;
        this.g = mct0Var;
        this.d = str2;
        this.h = q1mVar;
        this.i = iu30Var;
        this.t = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(ArrayList arrayList, k261 k261Var, cyp0 cyp0Var, String str, rm5 rm5Var, tz01 tz01Var, xaz0 xaz0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.f = arrayList;
        this.d = k261Var;
        this.g = cyp0Var;
        this.c = str;
        this.h = rm5Var;
        this.i = tz01Var;
        this.t = xaz0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(ao0 ao0Var, co0 co0Var, String str, Long l, String str2, String str3, String str4, String str5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.e = ao0Var;
        this.f = co0Var;
        this.c = str;
        this.t = l;
        this.d = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(nav0 nav0Var, l811 l811Var, l811 l811Var2, l811 l811Var3, p811 p811Var, i0g0 i0g0Var, lbc0 lbc0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 7;
        this.f = nav0Var;
        this.c = l811Var;
        this.d = l811Var2;
        this.g = l811Var3;
        this.h = p811Var;
        this.i = i0g0Var;
        this.t = lbc0Var;
    }
}
