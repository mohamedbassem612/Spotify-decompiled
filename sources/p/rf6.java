package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rf6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf6(int i, Function0 function0, Function0 function1, Function0 function2, pgx pgxVar, rwi0 rwi0Var, qim0 qim0Var, boolean z, boolean z2) {
        super(2);
        this.e = rwi0Var;
        this.f = function0;
        this.g = function1;
        this.h = function2;
        this.i = pgxVar;
        this.b = z;
        this.c = z2;
        this.t = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                int i2 = this.d;
                boolean z = this.b;
                boolean z2 = this.c;
                sf6.a((qe6) obj8, (wj31) obj7, (List) obj6, (rk41) obj5, i2, z, z2, (xd6) obj4, (qim0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                boolean z3 = this.b;
                boolean z4 = this.c;
                fqo1.c((dyh1) obj8, (mrn) obj7, z3, (iu30) obj6, z4, (String) obj5, (String) obj4, (Uri) obj3, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                String str = (String) obj5;
                String str2 = (String) obj4;
                int iP3 = czo1.p(i | 1);
                boolean z5 = this.b;
                boolean z6 = this.c;
                x2g0.k((String) obj8, (String) obj7, z5, z6, (iu30) obj6, (qim0) obj3, str, str2, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                ouo1.r(iP4, (Function0) obj7, (Function0) obj6, (Function0) obj5, (b0k) obj, (pgx) obj4, (rwi0) obj8, (qim0) obj3, this.b, this.c);
                break;
            case 4:
                ((Number) obj2).intValue();
                boolean z7 = this.c;
                int iP5 = czo1.p(1);
                int i3 = this.d;
                zj01.d((Paragraph) obj8, (String) obj7, i3, (Paragraph) obj6, (Paragraph) obj5, (Paragraph) obj4, (String) obj3, this.b, z7, (b0k) obj, iP5);
                break;
            case 5:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(i | 1);
                boolean z8 = this.b;
                boolean z9 = this.c;
                dsa0.h(z8, z9, (rea1) obj8, (ngs0) obj7, (na9) obj6, (String) obj5, (qim0) obj3, (j2i) obj4, (b0k) obj, iP6);
                break;
            default:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(i | 1);
                x2g0.d((hob1) obj8, (vu30) obj7, (j2i) obj6, (j2i) obj5, (j2i) obj4, (qim0) obj3, this.b, this.c, (b0k) obj, iP7);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf6(Paragraph paragraph, String str, int i, Paragraph paragraph2, Paragraph paragraph3, Paragraph paragraph4, String str2, boolean z, boolean z2, int i2) {
        super(2);
        this.e = paragraph;
        this.f = str;
        this.d = i;
        this.g = paragraph2;
        this.h = paragraph3;
        this.i = paragraph4;
        this.t = str2;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf6(String str, String str2, boolean z, boolean z2, iu30 iu30Var, qim0 qim0Var, String str3, String str4, int i) {
        super(2);
        this.e = str;
        this.f = str2;
        this.b = z;
        this.c = z2;
        this.g = iu30Var;
        this.t = qim0Var;
        this.h = str3;
        this.i = str4;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf6(qe6 qe6Var, wj31 wj31Var, List list, rk41 rk41Var, int i, boolean z, boolean z2, xd6 xd6Var, qim0 qim0Var, int i2) {
        super(2);
        this.e = qe6Var;
        this.f = wj31Var;
        this.g = list;
        this.h = rk41Var;
        this.d = i;
        this.b = z;
        this.c = z2;
        this.i = xd6Var;
        this.t = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf6(hob1 hob1Var, vu30 vu30Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, boolean z, boolean z2, int i) {
        super(2);
        this.e = hob1Var;
        this.f = vu30Var;
        this.g = j2iVar;
        this.h = j2iVar2;
        this.i = j2iVar3;
        this.t = qim0Var;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf6(dyh1 dyh1Var, mrn mrnVar, boolean z, iu30 iu30Var, boolean z2, String str, String str2, Uri uri, int i) {
        super(2);
        this.e = dyh1Var;
        this.f = mrnVar;
        this.b = z;
        this.g = iu30Var;
        this.c = z2;
        this.h = str;
        this.i = str2;
        this.t = uri;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf6(boolean z, boolean z2, rea1 rea1Var, ngs0 ngs0Var, na9 na9Var, String str, qim0 qim0Var, j2i j2iVar, int i) {
        super(2);
        this.b = z;
        this.c = z2;
        this.e = rea1Var;
        this.f = ngs0Var;
        this.g = na9Var;
        this.h = str;
        this.t = qim0Var;
        this.i = j2iVar;
        this.d = i;
    }
}
