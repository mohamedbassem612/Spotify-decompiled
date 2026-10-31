package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.player.esperanto.proto.EsStop;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.StopCommand;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tzo implements pie, qiw, Function, jrn0, BiFunction, yu30 {
    public final /* synthetic */ byte a;
    public Object b;

    public tzo(Context context, n0v0 n0v0Var, vqv0 vqv0Var, jtl1 jtl1Var, eh4 eh4Var, uxy0 uxy0Var) {
        this.a = (byte) 17;
        this.b = new lvc1(new dx0((bs0) vqv0Var.b, new ze21(context, jtl1Var, (byte) 1)), new dx0((bs0) n0v0Var.b, new ze21(context, jtl1Var, (byte) 2), (byte) 0), rpo1.r(eh4Var.b(), uxy0Var), (byte) 7);
    }

    public Object a(onm onmVar) {
        return ((wlr) this.b).b(onmVar);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 12:
                boolean zJ = l4o1.J((ContextTrack) this.b);
                Boolean bool = ((to91) obj).a;
                if (bool != null) {
                    zJ = bool.booleanValue();
                }
                return Boolean.valueOf(zJ);
            case 15:
                return ((u9c) this.b).l((c481) obj);
            case 16:
                return (kpq0) this.b;
            case 19:
                so soVar = (so) this.b;
                return ((pta1) soVar.b).c((suz) soVar.c, ((dra1) obj).a).x(zsa1.b).onErrorReturnItem(zsa1.a);
            case 22:
                return ((bkv) this.b).a.c().c((spq0) obj).ignoreElement();
            case 28:
                nez nezVar = ((qez) this.b).a;
                boolean z = ((egw) obj).a;
                bqz bqzVar = nezVar.a;
                iqz iqzVarR = EsPrefs.Value.r();
                iqzVarR.n(z);
                EsPrefs.Value valueBuild = iqzVarR.build();
                valueBuild.getClass();
                return bqzVar.d("audio.equalizer_v2", valueBuild);
            default:
                ruz ruzVar = (ruz) this.b;
                StopCommand stopCommandCreate = StopCommand.create();
                xrz xrzVarO = EsStop.StopRequest.o();
                xrzVarO.n(tgp1.s(ruzVar.b.a(stopCommandCreate.loggingParams())));
                EsStop.StopRequest stopRequestBuild = xrzVarO.build();
                ujm ujmVar = ruzVar.a;
                stopRequestBuild.getClass();
                return ujmVar.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Stop", stopRequestBuild).map(zp8.T0).map(zhm0.a1);
        }
    }

    public u7r0 b() {
        xau xauVar = (abu) this.b;
        xau xauVar2 = xauVar instanceof xau ? xauVar : null;
        if (xauVar2 == null || !xauVar2.d) {
            return new u7r0(rbc.a1, new awj(new a7e0(2131959535, 2131959535), (byte) 3), (iu30) null, true, false, 116);
        }
        return new u7r0((s6t0) null, (g4h1) null, (iu30) null, false, false, 127);
    }

    public ezc c(String str) {
        return yoi1.g(((z3v0) this.b).a(Collections.singletonList(str)).map(uh21.V0).map(j561.V0).onErrorReturn(mpi1.U0));
    }

    public irn0 l(Intent intent, th61 th61Var) {
        b72 b72Var = (b72) this.b;
        ((h21) b72Var.c).a().g1((th30) b72Var.b, (String) null);
        return crn0.a;
    }

    public void v(Object obj) {
        Drawable drawableFindDrawableByLayerId;
        switch (this.a) {
            case 6:
                zmr zmrVar = (zmr) this.b;
                e93 e93Var = zmrVar.e;
                ((TextView) e93Var.X).setText((String) obj);
                ((TextView) e93Var.X).setTextColor(zmrVar.s(2130968791));
                break;
            case 7:
            case 8:
            default:
                snf1 snf1Var = (snf1) obj;
                lvs lvsVar = (lvs) this.b;
                snf1Var.getClass();
                ip31 ip31Var = lvsVar.d;
                boolean z = snf1Var.k;
                String str = snf1Var.c;
                if (!z) {
                    ((TextView) ip31Var.f).setText(str);
                } else {
                    Context context = lvsVar.a;
                    Drawable drawable = context.getDrawable(2131233985);
                    if (drawable == null) {
                        drawable = null;
                    } else {
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165733);
                        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
                        if (layerDrawable != null && (drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(2131429845)) != null) {
                            drawableFindDrawableByLayerId.setTint(context.getColor(2131101505));
                        }
                    }
                    if (drawable != null) {
                        int i = Build.VERSION.SDK_INT >= 29 ? 2 : 1;
                        TextView textView = (TextView) ip31Var.f;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(new ImageSpan(drawable, i), 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) spannableString);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) str);
                        textView.setText(spannableStringBuilder);
                    } else {
                        ((TextView) ip31Var.f).setText(str);
                    }
                }
                break;
            case 9:
                String str2 = (String) obj;
                TextView textView2 = (TextView) ((srr) this.b).b.X;
                textView2.setVisibility(!ihc1.y0(str2) ? 0 : 8);
                textView2.setText(Html.fromHtml(str2, 0));
                break;
            case 10:
                yir yirVar = (yir) this.b;
                ((z800) obj).getClass();
                ((TextView) ((dxy) yirVar.c).g).setText("");
                break;
        }
    }

    public tzo(byte b) {
        this.a = b;
        switch (b) {
            case 13:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                this.b = yon1.G1("PODCAST_SHOW_LOADING", "podcast/show/loading", 1498, "podcast");
                break;
        }
    }

    public tzo(qhy qhyVar, EncoreTextView encoreTextView) {
        this.a = (byte) 26;
        this.b = encoreTextView;
    }

    public tzo(pfx pfxVar) {
        this.a = (byte) 24;
        this.b = pfxVar.a((l0i) null);
    }

    public tzo(Flowable flowable, c9c0 c9c0Var, Observable observable, g0l g0lVar) {
        this.a = (byte) 14;
        ezc ezcVarG = yoi1.g(observable);
        zob1 zob1VarCurrent = c9c0Var.b.current();
        wef wefVar = new wef(yoi1.g(hqq0.K(g0lVar)), (byte) 28);
        vbm[] vbmVarArr = q601.a;
        this.b = rqt0.u(h5p1.r(ezcVarG, zob1VarCurrent, wefVar, new kge(flowable), xhs.h));
    }

    public /* synthetic */ tzo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj, Object obj2) {
        return c3z.a((c3z) ((p811) this.b).a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Integer) null, 4);
    }
}
