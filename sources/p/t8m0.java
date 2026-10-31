package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t8m0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ l9m0 a;
    public final /* synthetic */ ilh1 b;

    public t8m0(l9m0 l9m0Var, ilh1 ilh1Var) {
        this.a = l9m0Var;
        this.b = ilh1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gdm0 gdm0Var;
        fdm0 fdm0Var = ((jcm1) obj).e;
        nfa0 nfa0Var = this.a.d.a;
        if (fdm0Var instanceof edm0) {
            gdm0Var = new gdm0("chatObservationStarted", nfa0Var.b(edm0.Companion.serializer(), (edm0) fdm0Var));
        } else if (fdm0Var instanceof xcm0) {
            gdm0Var = new gdm0("chatInitialMessages", nfa0Var.b(xcm0.Companion.serializer(), (xcm0) fdm0Var));
        } else if (fdm0Var instanceof adm0) {
            gdm0Var = new gdm0("chatNewMessage", nfa0Var.b(adm0.Companion.serializer(), (adm0) fdm0Var));
        } else if (fdm0Var instanceof bdm0) {
            gdm0Var = new gdm0("chatObservationError", null);
        } else {
            if (!(fdm0Var instanceof ucm0)) {
                eg.o();
                return null;
            }
            gdm0Var = new gdm0("accessibilityState", nfa0Var.b(ucm0.Companion.serializer(), (ucm0) fdm0Var));
        }
        ozk1 ozk1Var = new ozk1(new jdm0(gdm0Var.a, gdm0Var.b));
        ilh1 ilh1Var = this.b;
        j1l1 j1l1Var = (j1l1) ilh1Var.b;
        j1l1Var.a.c(new sjj1((n7m0) ilh1Var.c, String.format("\nwindow.spotifyWebView &&\nwindow.spotifyWebView.postMessage &&\nwindow.spotifyWebView.postMessage(%s);\n", Arrays.copyOf(new Object[]{j1l1Var.c.b(ozk1Var)}, 1)), (byte) 3));
        return rih1.a;
    }
}
