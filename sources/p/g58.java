package p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g58 {
    public final /* synthetic */ byte a;
    public final kt91 b;
    public final kdy0 c;
    public final bn d;
    public final dp5 e;
    public final Context f;
    public final am30 g;
    public final lzn0 h;
    public final x1i1 i;

    public /* synthetic */ g58(kt91 kt91Var, kdy0 kdy0Var, bn bnVar, dp5 dp5Var, Context context, am30 am30Var, lzn0 lzn0Var, x1i1 x1i1Var, byte b) {
        this.a = b;
        this.b = kt91Var;
        this.c = kdy0Var;
        this.d = bnVar;
        this.e = dp5Var;
        this.f = context;
        this.g = am30Var;
        this.h = lzn0Var;
        this.i = x1i1Var;
    }

    public final wxm0 a(boolean z, DynamicTagsMetadata dynamicTagsMetadata, Function0 function0) {
        switch (this.a) {
            case 0:
                return new wxm0(z, new vs0(this, new wxm0(z, new p651(this.d, dynamicTagsMetadata, new z77(function0, this, (byte) 12), (lnm) null, (byte) 6)), false, (lnm) null, (byte) 10));
            default:
                return new wxm0(z, new hxn(this, new wxm0(z, new p651(this.d, dynamicTagsMetadata, new f2t(function0, this, (byte) 15), (lnm) null, (byte) 6)), false, (lnm) null, (byte) 20));
        }
    }

    public pux0 b() {
        Context context = this.f;
        return kdy0.d(this.c, new nzy0(a(true, new DynamicTagsMetadata((String) null, (String) null, context.getString(2131961970), (String) null, 11, (DefaultConstructorMarker) null), df.t)), ((hys0) this.e.b).a() ? new nzy0(a(true, new DynamicTagsMetadata((String) null, (String) null, context.getString(2131961959), (String) null, 11, (DefaultConstructorMarker) null), vc7.X)) : mzy0.e, false, 28);
    }

    public pux0 c() {
        Context context = this.f;
        return kdy0.d(this.c, new nzy0(a(true, new DynamicTagsMetadata((String) null, (String) null, context.getString(2131961970), (String) null, 11, (DefaultConstructorMarker) null), vc7.Y)), new nzy0(a(true, new DynamicTagsMetadata((String) null, (String) null, context.getString(2131961959), (String) null, 11, (DefaultConstructorMarker) null), vc7.Z)), false, 28);
    }

    public pux0 d() {
        Context context = this.f;
        return kdy0.d(this.c, new nzy0(a(false, new DynamicTagsMetadata((String) null, (String) null, context.getString(2131961970), (String) null, 11, (DefaultConstructorMarker) null), vc7.N0)), new nzy0(a(false, new DynamicTagsMetadata((String) null, (String) null, context.getString(2131961959), (String) null, 11, (DefaultConstructorMarker) null), vc7.O0)), false, 28);
    }

    public pux0 e() {
        lnm lnmVar = null;
        byte b = 12;
        return kdy0.d(this.c, new nzy0(new wxm0(true, new ry5(this, kno1.c, lnmVar, b))), ((hys0) this.e.b).a() ? new nzy0(new wxm0(true, new ry5(this, kno1.d, lnmVar, b))) : mzy0.e, false, 28);
    }

    public pux0 f() {
        return kdy0.d(this.c, mzy0.d, new nzy0(a(false, new DynamicTagsMetadata((String) null, (String) null, this.f.getString(2131961959), (String) null, 11, (DefaultConstructorMarker) null), vc7.P0)), false, 28);
    }
}
