package com.spotify.cosmos.core;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.aey0;
import p.cv30;
import p.hab0;
import p.iv30;
import p.luk;
import p.tv30;
import p.u890;
import p.ydy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/spotify/cosmos/servicebasedrouter/AndroidServicebasedrouterProperties;", "invoke"}, k = 3, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class AndroidServicebasedrouterProperties$dataProps$2 extends hab0 implements Function0 {
    final /* synthetic */ AndroidServicebasedrouterProperties this$0;

    /* JADX INFO: renamed from: com.spotify.cosmos.servicebasedrouter.AndroidServicebasedrouterProperties$dataProps$2$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final /* synthetic */ class AnonymousClass1 implements ydy0, iv30 {
        final /* synthetic */ AndroidServicebasedrouterProperties $tmp0;

        public AnonymousClass1(AndroidServicebasedrouterProperties androidServicebasedrouterProperties) {
            this.$tmp0 = androidServicebasedrouterProperties;
        }

        /* JADX INFO: renamed from: create, reason: merged with bridge method [inline-methods] */
        public final AndroidServicebasedrouterProperties m15create(aey0 aey0Var) {
            return this.$tmp0.parse(aey0Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
            }
            return false;
        }

        public final cv30 getFunctionDelegate() {
            return new tv30(1, this.$tmp0, AndroidServicebasedrouterProperties.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/cosmos/servicebasedrouter/AndroidServicebasedrouterProperties;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidServicebasedrouterProperties$dataProps$2(AndroidServicebasedrouterProperties androidServicebasedrouterProperties) {
        super(0);
        this.this$0 = androidServicebasedrouterProperties;
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final AndroidServicebasedrouterProperties m14invoke() {
        luk lukVar = this.this$0.configProvider;
        if (lukVar != null) {
            return (AndroidServicebasedrouterProperties) lukVar.e(new AnonymousClass1(this.this$0));
        }
        return null;
    }
}
