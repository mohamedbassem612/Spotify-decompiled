package com.spotify.cosmos.core;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.aey0;
import p.fpb;
import p.idd1;
import p.k4p1;
import p.luk;
import p.pdy0;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\tB\u0013\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/AndroidServicebasedrouterProperties;", "Lp/pdy0;", "", "_useComputationScheduler", "Lp/luk;", "configProvider", "<init>", "(ZLp/luk;)V", "(Lp/luk;)V", "()V", "useComputationScheduler", "(Z)V", "", "Lp/fpb;", "models", "()Ljava/util/List;", "Lp/aey0;", "parser", "fromParser", "(Lp/aey0;)Lcom/spotify/cosmos/servicebasedrouter/AndroidServicebasedrouterProperties;", "parse", "Z", "Lp/luk;", "dataProps$delegate", "Lp/znb0;", "getDataProps", "()Lcom/spotify/cosmos/servicebasedrouter/AndroidServicebasedrouterProperties;", "dataProps", "getUseComputationScheduler", "()Z", "Companion", "TestHelper", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter_properties_lib"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class AndroidServicebasedrouterProperties implements pdy0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String SCOPE = "android-servicebasedrouter";
    private final boolean _useComputationScheduler;
    private final luk configProvider;

    /* JADX INFO: renamed from: dataProps$delegate, reason: from kotlin metadata */
    private final znb0 dataProps;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/AndroidServicebasedrouterProperties$Companion;", "", "<init>", "()V", "SCOPE", "", "defaults", "Lcom/spotify/cosmos/servicebasedrouter/AndroidServicebasedrouterProperties;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter_properties_lib"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AndroidServicebasedrouterProperties defaults() {
            return new AndroidServicebasedrouterProperties();
        }

        private Companion() {
        }
    }

    public AndroidServicebasedrouterProperties(boolean z, luk lukVar) {
        this._useComputationScheduler = z;
        this.configProvider = lukVar;
        this.dataProps = new idd1(new AndroidServicebasedrouterProperties$dataProps$2(this));
    }

    public static final AndroidServicebasedrouterProperties defaults() {
        return INSTANCE.defaults();
    }

    private final AndroidServicebasedrouterProperties getDataProps() {
        return (AndroidServicebasedrouterProperties) this.dataProps.getValue();
    }

    public final boolean getUseComputationScheduler() {
        AndroidServicebasedrouterProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getUseComputationScheduler() : this._useComputationScheduler;
    }

    public List<fpb> models() {
        return k4p1.x(new fpb("use_computation_scheduler", SCOPE, getUseComputationScheduler()));
    }

    public final AndroidServicebasedrouterProperties parse(aey0 parser) {
        return new AndroidServicebasedrouterProperties(parser.c("android-servicebasedrouter:use_computation_scheduler", false));
    }

    /* JADX INFO: renamed from: fromParser, reason: merged with bridge method [inline-methods] */
    public AndroidServicebasedrouterProperties m13fromParser(aey0 parser) {
        return parse(parser);
    }

    public /* synthetic */ AndroidServicebasedrouterProperties(boolean z, luk lukVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, lukVar);
    }

    public AndroidServicebasedrouterProperties(luk lukVar) {
        this(false, lukVar);
    }

    public AndroidServicebasedrouterProperties() {
        this(false, null);
    }

    public AndroidServicebasedrouterProperties(boolean z) {
        this(z, null);
    }

    public /* synthetic */ AndroidServicebasedrouterProperties(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
