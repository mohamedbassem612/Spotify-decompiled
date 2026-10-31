package app.p000rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.bb00;
import p.gvg;
import p.hab0;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class Rive$NativeLoader$logLoadFailure$1 extends hab0 implements Function0 {
    final /* synthetic */ boolean $is64BitDevice;
    final /* synthetic */ String $libraryName;
    final /* synthetic */ String $loader;
    final /* synthetic */ String $supportedABIs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rive$NativeLoader$logLoadFailure$1(String str, String str2, String str3, boolean z) {
        super(0);
        this.$libraryName = str;
        this.$loader = str2;
        this.$supportedABIs = str3;
        this.$is64BitDevice = z;
    }

    public final String invoke() {
        String str = this.$libraryName;
        String str2 = this.$loader;
        String str3 = this.$supportedABIs;
        String str4 = this.$is64BitDevice ? "64-bit" : "32-bit";
        StringBuilder sbN = gvg.n("Failed to load lib", str, ".so using ", str2, ". Supported ABIs: ");
        bb00.j(sbN, str3, ". Device bitness: ", str4, ". Check your APK/AAB contains lib/<abi>/lib");
        return l1d.n(str, ".so and verify ABI filters, split APK/dynamic feature delivery, and 32-bit support (for example armeabi-v7a) are not stripped.", sbN);
    }
}
