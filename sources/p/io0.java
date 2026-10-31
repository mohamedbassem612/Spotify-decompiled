package p;

import com.spotify.ads.esperanto.proto.UnmanagedEventRequest;
import com.spotify.adsinternal.adscore.model.Format;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class io0 extends a8d1 implements vu30 {
    public final /* synthetic */ List N0;
    public final /* synthetic */ String O0;
    public final /* synthetic */ jo0 P0;
    public final /* synthetic */ String X;
    public final /* synthetic */ Format Y;
    public final /* synthetic */ int Z;
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ co0 d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io0(String str, co0 co0Var, Long l, String str2, String str3, String str4, String str5, String str6, String str7, Format format, int i, List list, String str8, jo0 jo0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = str;
        this.d = co0Var;
        this.e = l;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.t = str6;
        this.X = str7;
        this.Y = format;
        this.Z = i;
        this.N0 = list;
        this.O0 = str8;
        this.P0 = jo0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        io0 io0Var = new io0(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, lnmVar);
        io0Var.b = obj;
        return io0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        cq0 cq0Var;
        c9n c9nVar = (c9n) this.b;
        boolean z = this.a;
        jo0 jo0Var = this.P0;
        String str = this.i;
        String str2 = this.g;
        String str3 = this.f;
        co0 co0Var = this.d;
        String str4 = this.c;
        try {
            if (!z) {
                hm5.M(obj);
                kjh1 kjh1VarO = UnmanagedEventRequest.o();
                kjh1VarO.q(str4);
                kjh1VarO.v(co0Var.a);
                Long l = this.e;
                kjh1VarO.y(l != null ? l.longValue() : 0L);
                kjh1VarO.u(str3);
                kjh1VarO.x(str2);
                kjh1VarO.s(this.h);
                kjh1VarO.A(str);
                kjh1VarO.z(this.t);
                kjh1VarO.B(this.X);
                switch (dq0.a[this.Y.ordinal()]) {
                    case 1:
                        cq0Var = cq0.AUDIO;
                        break;
                    case 2:
                        cq0Var = cq0.DISPLAY;
                        break;
                    case 3:
                        cq0Var = cq0.DUMMY;
                        break;
                    case 4:
                        cq0Var = cq0.UNKNOWN;
                        break;
                    case 5:
                        cq0Var = cq0.UNRECOGNIZED;
                        break;
                    case 6:
                        cq0Var = cq0.VIDEO;
                        break;
                    default:
                        eg.o();
                        return null;
                }
                kjh1VarO.w(cq0Var);
                kjh1VarO.t(this.Z);
                kjh1VarO.n(this.N0);
                String str5 = this.O0;
                if (str5 != null) {
                    kjh1VarO.r(str5);
                }
                re00 re00Var = jo0Var.a;
                UnmanagedEventRequest unmanagedEventRequest = (UnmanagedEventRequest) kjh1VarO.build();
                this.b = c9nVar;
                this.a = true;
                Object objB = re00Var.b(unmanagedEventRequest, this);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Exception e) {
            smo1.t(c9nVar);
            jo0Var.c.a(new bo0(str4, cy30.p(co0Var.a, " failed with eventReason: ", str3, ", error: ", e.getMessage()), str2, str));
        }
        return rih1.a;
    }
}
