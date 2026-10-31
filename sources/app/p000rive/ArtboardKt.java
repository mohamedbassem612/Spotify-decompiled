package app.p000rive;

import com.comscore.streaming.ContentType;
import kotlin.Metadata;
import p.adt;
import p.b0k;
import p.fkj0;
import p.hab0;
import p.iu30;
import p.nku;
import p.oku;
import p.qxd0;
import p.vu30;
import p.x340;
import p.yto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/rive/RiveFile;", "file", "", "artboardName", "Lapp/rive/Artboard;", "rememberArtboard", "(Lapp/rive/RiveFile;Ljava/lang/String;Lp/b0k;II)Lapp/rive/Artboard;", "Lapp/rive/Result;", "rememberArtboardResult", "(Lapp/rive/RiveFile;Ljava/lang/String;Lp/b0k;II)Lapp/rive/Result;", "ARTBOARD_TAG", "Ljava/lang/String;", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ArtboardKt {
    private static final String ARTBOARD_TAG = "Rive/Artboard";

    /* JADX INFO: renamed from: app.rive.ArtboardKt$rememberArtboard$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/oku;", "Lp/nku;", "invoke", "(Lp/oku;)Lp/nku;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements iu30 {
        final /* synthetic */ Artboard $artboard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Artboard artboard) {
            super(1);
            this.$artboard = artboard;
        }

        public final nku invoke(oku okuVar) {
            final Artboard artboard = this.$artboard;
            return new nku() { // from class: app.rive.ArtboardKt$rememberArtboard$1$invoke$$inlined$onDispose$1
                public void dispose() {
                    artboard.close();
                }
            };
        }
    }

    @adt
    public static final Artboard rememberArtboard(RiveFile riveFile, String str, b0k b0kVar, int i, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(976856554);
        if ((i2 & 2) != 0) {
            str = null;
        }
        x340Var.i0(-829358723);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && x340Var.g(riveFile)) || (i & 6) == 4;
        if ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 || !x340Var.g(str)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objT = x340Var.T();
        if (z3 || objT == fkj0.X) {
            objT = Artboard.INSTANCE.fromFile(riveFile, str);
            x340Var.s0(objT);
        }
        Artboard artboard = (Artboard) objT;
        x340Var.r(false);
        qxd0.i(artboard, new AnonymousClass1(artboard), x340Var);
        x340Var.r(false);
        return artboard;
    }

    public static final Result<Artboard> rememberArtboardResult(RiveFile riveFile, String str, b0k b0kVar, int i, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(613815943);
        if ((i2 & 2) != 0) {
            str = null;
        }
        x340Var.f0(-2129303797, x340Var.K(riveFile, str));
        Result.Loading loading = Result.Loading.INSTANCE;
        x340Var.i0(-2129301298);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && x340Var.g(riveFile)) || (i & 6) == 4;
        if ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 || !x340Var.g(str)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objT = x340Var.T();
        if (z3 || objT == fkj0.X) {
            objT = new ArtboardKt$rememberArtboardResult$1$1(riveFile, str, null);
            x340Var.s0(objT);
        }
        x340Var.r(false);
        Result<Artboard> result = (Result) yto.q(loading, x340Var, (vu30) objT).getValue();
        x340Var.r(false);
        x340Var.r(false);
        return result;
    }
}
