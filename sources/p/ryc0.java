package p;

import com.google.protobuf.Empty;
import com.spotify.playlist.proto.CreationInfo;
import spotify.playlist.esperanto.proto.CopyRequest;
import spotify.playlist.esperanto.proto.CopyResponse;
import spotify.playlist.esperanto.proto.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ryc0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ xyc0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ trc0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryc0(xyc0 xyc0Var, String str, trc0 trc0Var, String str2, String str3, String str4, lnm lnmVar) {
        super(2, lnmVar);
        this.b = xyc0Var;
        this.c = str;
        this.d = trc0Var;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new ryc0(this.b, this.c, this.d, this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        xyc0 xyc0Var = this.b;
        dmr dmrVar = xyc0Var.b;
        boolean z = this.a;
        String str = this.c;
        if (!z) {
            hm5.M(obj);
            jn7 jn7Var = xyc0Var.d;
            a aVarN = CopyRequest.n();
            aVarN.t(str);
            aVarN.s(mlu0.b(xyc0Var.e.a(), this.d));
            aVarN.n(Empty.n());
            fsn fsnVarN = CreationInfo.n();
            fsnVarN.n(hsn.d);
            fsnVarN.q(str);
            aVarN.q((CreationInfo) fsnVarN.build());
            String str2 = this.e;
            if (str2 != null) {
                String str3 = ihc1.y0(str2) ? null : str2;
                if (str3 != null) {
                    aVarN.r(str3);
                }
            }
            CopyRequest copyRequest = (CopyRequest) aVarN.build();
            this.a = true;
            obj = jn7Var.k(copyRequest, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        CopyResponse copyResponse = (CopyResponse) obj;
        oy21 oy21VarL = i2x0.l(copyResponse.o(), str, new nzb0(copyResponse, (byte) 15));
        if (oy21VarL instanceof oy21) {
            yxc0 yxc0Var = (yxc0) oy21VarL.a;
            String str4 = yxc0Var.a;
            String str5 = this.f;
            String str6 = this.g;
            dmrVar.b(str4, str5, str6);
            if (!yxc0Var.b.isEmpty()) {
                dmrVar.a(yxc0Var.a, str5, true, str6, yxc0Var.b);
            }
        }
        return oy21VarL;
    }
}
