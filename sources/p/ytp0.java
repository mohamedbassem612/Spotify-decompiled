package p;

import android.icu.text.DateFormat;
import android.icu.text.RelativeDateTimeFormatter;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.TrackListView;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.creatorbutton.CreatorButtonView;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.viewstub.EncoreViewStub;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.Suppressions$Providers;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import com.spotify.playlist.policy.proto.ItemMetadataPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ytp0 implements uaq0, Function, cyd {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public ytp0(mtx0 mtx0Var, pe peVar, p1f0 p1f0Var, y11 y11Var, yqg yqgVar, gw70 gw70Var, e511 e511Var) {
        this.a = (byte) 21;
        y441 y441Var = (y441) p1f0Var.g;
        EncoreButton encoreButton = (EncoreButton) y441Var.b;
        this.b = mtx0Var;
        this.c = peVar;
        this.d = p1f0Var;
        this.e = y11Var;
        TrackListView trackListView = (TrackListView) p1f0Var.e;
        qqf1 qqf1Var = new qqf1(yqgVar, gw70Var, e511Var);
        trackListView.b = qqf1Var;
        ((RecyclerView) trackListView.a.b).setAdapter(qqf1Var);
        uux0 uux0Var = new uux0(this, (byte) 0);
        qqf1 qqf1Var2 = trackListView.b;
        if (qqf1Var2 == null) {
            u890.C("adapter");
            throw null;
        }
        qqf1Var2.h = uux0Var;
        ((ShapeableImageView) p1f0Var.b).setOnClickListener(new vux0(this, (byte) 0));
        ((EncoreTextView) y441Var.d).setText(2131952261);
        ((EncoreTextView) y441Var.c).setText(2131952259);
        encoreButton.setText(2131952260);
        encoreButton.setOnClickListener(new vux0(this, (byte) 1));
        b8k1.m((SeeMoreTextView) p1f0Var.d, fg.g, ((ConstraintLayout) p1f0Var.a).getContext().getString(2131956046), (sh) null);
        this.f = r4u.c(new r4u[]{r4u.d(e2x0.c, r4u.a(new vgq0(this, (byte) 23))), r4u.d(new hyr(wux0.b, (byte) 5), r4u.a(new rut0(this, (byte) 14))), r4u.d(new hyr(xux0.b, (byte) 5), r4u.a(new sks0(this, (byte) 21))), r4u.d(new hyr(yux0.b, (byte) 5), r4u.a(new jxp0(this, (byte) 23)))});
    }

    public static ArrayList K(List list) {
        String uri;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w8l1 w8l1Var = (z0i) it.next();
            String vjlVar = null;
            w8l1 w8l1Var2 = w8l1Var instanceof w8l1 ? w8l1Var : null;
            if (w8l1Var2 != null && (uri = w8l1Var2.getUri()) != null) {
                vpl vplVarA = w8l1Var.a();
                vjlVar = new vjl(uri, vplVarA != null ? vplVarA.j() : null);
            }
            if (vjlVar != null) {
                arrayList.add(vjlVar);
            }
        }
        return arrayList;
    }

    public static ItemExtensionPolicy L(clc0 clc0Var, hz00 hz00Var) {
        fj90 fj90VarN = ItemExtensionPolicy.n();
        fj90VarN.r(clc0Var);
        fj90VarN.n(hz00Var);
        return fj90VarN.build();
    }

    public static FlowableObserveOn q(ytp0 ytp0Var) {
        return ((Flowable) ytp0Var.c).J(new clv("", (byte) 12)).t(Functions.a).L((Scheduler) ytp0Var.b);
    }

    public static gm50 r(cr01 cr01Var, int i) {
        et31 et31Var = et31.e;
        boolean zS = hxo1.s(cr01Var);
        String str = cr01Var.b;
        if (zS) {
            return et31.d;
        }
        return (eyo1.r(str) || eyo1.v(str) || i != 1) ? et31Var : new ft31(new zbm(i, cr01Var.c));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object A(abu abuVar, String str, String str2, vu30 vu30Var, onm onmVar) {
        s9r0 s9r0Var;
        String str3;
        vu30 vu30Var2;
        String str4;
        vu30 vu30Var3;
        s9l1 s9l1Var;
        ftc ftcVar;
        s9l1 s9l1Var2;
        s9l1 s9l1Var3;
        String str5;
        int i;
        qzq qzqVar = ((u680) this.c).a;
        xjl xjlVar = (xjl) this.d;
        if (onmVar instanceof s9r0) {
            s9r0Var = (s9r0) onmVar;
            int i2 = s9r0Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s9r0Var.i = i2 - Integer.MIN_VALUE;
            } else {
                s9r0Var = new s9r0(this, onmVar);
            }
        } else {
            s9r0Var = new s9r0(this, onmVar);
        }
        Object objA = s9r0Var.g;
        int i3 = s9r0Var.i;
        rih1 rih1Var = etc.a;
        rih1 rih1Var2 = d9n.a;
        if (i3 == 0) {
            hm5.M(objA);
            mjs mjsVar = (mjs) this.b;
            ArrayList arrayListC = xjlVar.c();
            str3 = str;
            s9r0Var.a = str3;
            s9r0Var.b = vu30Var;
            s9r0Var.i = 1;
            objA = mjsVar.a(abuVar, arrayListC, str2, s9r0Var);
            if (objA != rih1Var2) {
                vu30Var2 = vu30Var;
            }
            return rih1Var2;
        }
        if (i3 == 1) {
            vu30Var2 = s9r0Var.b;
            str3 = s9r0Var.a;
            hm5.M(objA);
        } else {
            if (i3 == 2) {
                s9l1Var = s9r0Var.c;
                vu30Var3 = s9r0Var.b;
                str4 = s9r0Var.a;
                hm5.M(objA);
                ftcVar = (ftc) objA;
                if (ftcVar instanceof dtc) {
                    xjlVar.a(str4, K(s9l1Var.b));
                    s9l1Var = (s9l1) vu30Var3.invoke(((dtc) ftcVar).a, s9l1Var);
                } else {
                    if (u890.j(ftcVar, rih1Var)) {
                        eg.o();
                        return null;
                    }
                    Logger.d("Illegal Watch Feed cache state: current model in cache is empty, and the next page is requested", new Object[0]);
                }
                s9l1Var2 = s9l1Var;
                s9r0Var.a = str4;
                s9r0Var.b = null;
                s9r0Var.c = null;
                s9r0Var.d = s9l1Var2;
                s9r0Var.e = s9l1Var2;
                s9r0Var.f = 0;
                s9r0Var.i = 3;
                if (xpn1.H(s9r0Var) != rih1Var2) {
                    s9l1Var3 = s9l1Var2;
                    str5 = str4;
                    i = 0;
                }
                return rih1Var2;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s9l1 s9l1Var4 = s9r0Var.d;
                hm5.M(objA);
                return s9l1Var4;
            }
            i = s9r0Var.f;
            s9l1Var2 = s9r0Var.e;
            s9l1Var3 = s9r0Var.d;
            str5 = s9r0Var.a;
            hm5.M(objA);
        }
        s9r0Var.a = null;
        s9r0Var.b = null;
        s9r0Var.c = null;
        s9r0Var.d = s9l1Var3;
        s9r0Var.e = null;
        s9r0Var.f = i;
        s9r0Var.i = 4;
        qzqVar.put(str5, s9l1Var2);
        if (rih1.a != rih1Var2) {
            return rih1Var2;
        }
        return s9l1Var3;
        s9l1 s9l1Var5 = (s9l1) objA;
        s9r0Var.a = str3;
        s9r0Var.b = vu30Var2;
        s9r0Var.c = s9l1Var5;
        s9r0Var.i = 2;
        s9l1 s9l1Var6 = (s9l1) qzqVar.get(str3);
        rih1 dtcVar = s9l1Var6 != null ? new dtc(s9l1Var6) : rih1Var;
        if (dtcVar != rih1Var2) {
            str4 = str3;
            vu30Var3 = vu30Var2;
            s9l1Var = s9l1Var5;
            objA = dtcVar;
            ftcVar = (ftc) objA;
            if (ftcVar instanceof dtc) {
                xjlVar.a(str4, K(s9l1Var.b));
                s9l1Var = (s9l1) vu30Var3.invoke(((dtc) ftcVar).a, s9l1Var);
            } else {
                if (u890.j(ftcVar, rih1Var)) {
                    eg.o();
                    return null;
                }
                Logger.d("Illegal Watch Feed cache state: current model in cache is empty, and the next page is requested", new Object[0]);
            }
            s9l1Var2 = s9l1Var;
            s9r0Var.a = str4;
            s9r0Var.b = null;
            s9r0Var.c = null;
            s9r0Var.d = s9l1Var2;
            s9r0Var.e = s9l1Var2;
            s9r0Var.f = 0;
            s9r0Var.i = 3;
            if (xpn1.H(s9r0Var) != rih1Var2) {
                s9l1Var3 = s9l1Var2;
                str5 = str4;
                i = 0;
                s9r0Var.a = null;
                s9r0Var.b = null;
                s9r0Var.c = null;
                s9r0Var.d = s9l1Var3;
                s9r0Var.e = null;
                s9r0Var.f = i;
                s9r0Var.i = 4;
                qzqVar.put(str5, s9l1Var2);
                if (rih1.a != rih1Var2) {
                    return s9l1Var3;
                }
            }
        }
        return rih1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object B(String str, tv80 tv80Var, onm onmVar) {
        nkt0 nkt0Var;
        if (onmVar instanceof nkt0) {
            nkt0Var = (nkt0) onmVar;
            int i = nkt0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nkt0Var.c = i - Integer.MIN_VALUE;
            } else {
                nkt0Var = new nkt0(this, onmVar);
            }
        } else {
            nkt0Var = new nkt0(this, onmVar);
        }
        Object obj = nkt0Var.a;
        int i2 = nkt0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                f1n0 f1n0Var = (f1n0) this.b;
                bwn0 bwn0Var = tv80Var != null ? new bwn0(tv80Var) : null;
                if (str == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                dwn0 dwn0Var = new dwn0(str, "", false, false, 0, 0, false, null, null, bwn0Var);
                nkt0Var.c = 1;
                Object objD = f1n0.d(f1n0Var, dwn0Var, nkt0Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "UserActivityRowElement: Navigation failed", new Object[0]);
        }
        return rih1.a;
    }

    public Completable C(String str) {
        return ((muz) this.d).a(PlayCommand.create(Context.fromUri(str), (PlayOrigin) this.e)).ignoreElement();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object D(String str, aew aewVar, onm onmVar) throws NoWhenBranchMatchedException {
        pkt0 pkt0Var;
        ou80 ou80Var;
        if (onmVar instanceof pkt0) {
            pkt0Var = (pkt0) onmVar;
            int i = pkt0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pkt0Var.c = i - Integer.MIN_VALUE;
            } else {
                pkt0Var = new pkt0(this, onmVar);
            }
        } else {
            pkt0Var = new pkt0(this, onmVar);
        }
        pkt0 pkt0Var2 = pkt0Var;
        Object objB = pkt0Var2.a;
        int i2 = pkt0Var2.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                long jB = ((yqg) this.e).b();
                zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                zpzVarY.w(((lik1) this.d).a);
                zpzVarY.s("listening-activity");
                EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
                coz cozVarR = EsLoggingParams.LoggingParams.r();
                tv80 tv80Var = aewVar.c;
                String str2 = (tv80Var == null || (ou80Var = tv80Var.a) == null) ? null : ou80Var.a;
                if (str2 == null) {
                    str2 = "";
                }
                cozVarR.n(str2);
                y6r0 y6r0Var = ((b7r0) this.f).get();
                String str3 = y6r0Var != null ? y6r0Var.a : null;
                cozVarR.q(str3 != null ? str3 : "");
                qpz qpzVarP = EsOptional.OptionalInt64.p();
                qpzVarP.n(jB);
                cozVarR.t(qpzVarP);
                EsLoggingParams.LoggingParams loggingParamsBuild = cozVarR.build();
                lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
                wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
                wrzVarP.t(aewVar.a);
                lqzVarS.C(wrzVarP.build());
                EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsBuild = lqzVarS.build();
                xrc0 xrc0Var = (xrc0) this.c;
                playOriginBuild.getClass();
                trc0 trc0Var = new trc0(PlaylistRequestDecorationPolicy.n(), (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
                preparePlayOptionsBuild.getClass();
                loggingParamsBuild.getClass();
                pkt0Var2.c = 1;
                objB = xrc0.b(xrc0Var, str, trc0Var, preparePlayOptionsBuild, playOriginBuild, (EsPlayOptions.PlayOptions) null, (Map) null, loggingParamsBuild, (ayc0) null, pkt0Var2, 176);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            ly21 ly21Var = (py21) objB;
            ly21Var.getClass();
            if (ly21Var instanceof ly21) {
                Logger.d("UserActivityRowElement: Play in context failed: %s", new Object[]{ly21Var.a.b()});
                return rih1Var;
            }
            if (!(ly21Var instanceof oy21)) {
                throw new NoWhenBranchMatchedException();
            }
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "UserActivityRowElement: Play in context failed", new Object[0]);
            return rih1Var;
        }
    }

    public evz E(String str) {
        return h5p1.s(((zr00) this.c).a, yoi1.g(((yh2) this.b).a()), (str == null || ihc1.y0(str)) ? new huz(z6x.a, (byte) 10) : new lt20(new m441(new k1e0(this, Collections.singletonList(str), (lnm) null, (byte) 23)), new q8t0(3, (lnm) null, (byte) 3), (byte) 0), new td1(4, (lnm) null, (byte) 8));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    public wt01 F(cr01 cr01Var, int i, String str) {
        String strU0;
        String str2 = cr01Var.i;
        String str3 = cr01Var.a;
        String str4 = cr01Var.c;
        String str5 = cr01Var.h;
        c380 c380VarA = mqo1.A(cr01Var.f);
        boolean zBooleanValue = cr01Var.n.booleanValue();
        br01 br01Var = cr01Var.e;
        boolean z = true;
        boolean z2 = br01Var == br01.b;
        if (br01Var != br01.c) {
            z = false;
        }
        boolean z3 = i == 4;
        boolean z4 = cr01Var.j;
        gm50 gm50VarR = r(cr01Var, i);
        m87 m87Var = cr01Var.g;
        if (hxo1.s(cr01Var)) {
            yq01 yq01Var = cr01Var.m;
            if (yq01Var != null) {
                strU0 = yq01Var.a;
            } else {
                strU0 = null;
            }
        } else if (str2 != null) {
            strU0 = ihc1.U0(str2, "group_id_", str2);
        } else {
            strU0 = null;
        }
        yq01 yq01Var2 = cr01Var.m;
        y6r0 y6r0Var = ((b7r0) this.b).get();
        String str6 = y6r0Var != null ? y6r0Var.a : null;
        if (str6 == null) {
            str6 = "";
        }
        return new wt01(new ney0(str3, str4, str5, c380VarA, zBooleanValue, z2, z, z3, gm50VarR, m87Var, str, strU0, yq01Var2, z4, str6, ((q7r0) this.c).a(), cr01Var.r, cr01Var.s, (!u890.j(str2, "group_id_0") || hxo1.s(cr01Var)) ? true : cr01Var.t, cr01Var.q, cr01Var.v, mqo1.A(cr01Var.o), br01Var, cr01Var.w, cr01Var.y, j(str, cr01Var)));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    public zt01 G(cr01 cr01Var, int i, String str) {
        String strU0;
        String str2;
        hxz0 hxz0Var;
        String str3 = cr01Var.a;
        String str4 = cr01Var.c;
        String str5 = cr01Var.h;
        c380 c380VarA = mqo1.A(cr01Var.f);
        br01 br01Var = cr01Var.e;
        boolean z = br01Var == br01.b;
        boolean z2 = cr01Var.j;
        gm50 gm50VarR = r(cr01Var, i);
        if (hxo1.s(cr01Var)) {
            yq01 yq01Var = cr01Var.m;
            if (yq01Var != null) {
                strU0 = yq01Var.a;
                str2 = strU0;
            } else {
                str2 = null;
            }
        } else {
            String str6 = cr01Var.i;
            if (str6 != null) {
                strU0 = ihc1.U0(str6, "group_id_", str6);
                str2 = strU0;
            } else {
                str2 = null;
            }
        }
        yq01 yq01Var2 = cr01Var.m;
        y6r0 y6r0Var = ((b7r0) this.b).get();
        String str7 = y6r0Var != null ? y6r0Var.a : null;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = str7;
        String strA = ((q7r0) this.c).a();
        boolean z3 = cr01Var.q;
        boolean z4 = cr01Var.r;
        boolean z5 = cr01Var.s;
        boolean z6 = cr01Var.t;
        boolean z7 = cr01Var.u;
        String str9 = cr01Var.v;
        c380 c380VarA2 = mqo1.A(cr01Var.o);
        zq01 zq01Var = cr01Var.w;
        List list = cr01Var.A;
        if (list.isEmpty() || !((hgd0) this.d).h()) {
            hxz0Var = null;
        } else {
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ar01) it.next()).a);
            }
            hxz0Var = new hxz0(list.size(), mqo1.A(o7h.d1(o7h.j0(arrayList), 3)));
        }
        return new zt01(new oey0(str3, str4, str5, c380VarA, z, gm50VarR, z2, str, z3, str2, yq01Var2, str8, strA, z4, z5, z6, z7, str9, c380VarA2, br01Var, zq01Var, hxz0Var, (int) (cr01Var.d.getTime() / 1000), j(str, cr01Var)));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0062 A[Catch: CancellationException -> 0x0075, Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:12:0x0024, B:27:0x005c, B:29:0x0062, B:31:0x006d), top: B:42:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d A[Catch: CancellationException -> 0x0075, Exception -> 0x0077, TRY_LEAVE, TryCatch #0 {Exception -> 0x0077, blocks: (B:12:0x0024, B:27:0x005c, B:29:0x0062, B:31:0x006d), top: B:42:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object H(onm onmVar) {
        kur0 kur0Var;
        String str;
        if (onmVar instanceof kur0) {
            kur0Var = (kur0) onmVar;
            int i = kur0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kur0Var.d = i - Integer.MIN_VALUE;
            } else {
                kur0Var = new kur0(this, onmVar);
            }
        } else {
            kur0Var = new kur0(this, onmVar);
        }
        Object obj = kur0Var.b;
        int i2 = kur0Var.d;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = kur0Var.a;
                try {
                    hm5.M(obj);
                    return ((tur0) obj).g ? new wxa0(new xig1(str)) : new vxa0(str);
                } catch (Exception unused) {
                    return new vxa0(str);
                }
            }
            hm5.M(obj);
            pur0 pur0Var = (pur0) this.c;
            String str2 = pur0Var.d;
            if (str2 != null) {
                return new wxa0(new wig1(str2));
            }
            String str3 = pur0Var.c;
            if (str3 == null) {
                return new vxa0((String) null);
            }
            try {
                w0g w0gVar = (w0g) this.e;
                kur0Var.a = str3;
                kur0Var.d = 1;
                Object objB = w0gVar.b(str3, kur0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
                obj = objB;
                str = str3;
                if (((tur0) obj).g) {
                }
            } catch (Exception unused2) {
                str = str3;
                return new vxa0(str);
            }
        } catch (CancellationException e) {
            throw e;
        }
    }

    public void I() {
        Observable observableH;
        q54 q54Var = (q54) this.d;
        if (q54Var.d != null) {
            observableH = ((Observable) q54Var.f.getValue()).map(fkj0.e).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(q54Var.a);
        }
        ((rku) this.f).b(observableH.filter(p5x0.f).switchMapCompletable(new rut0(this, (byte) 24)).subscribe());
    }

    public void J() {
        ((rku) this.f).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object M(String str, onm onmVar) {
        zzs0 zzs0Var;
        if (onmVar instanceof zzs0) {
            zzs0Var = (zzs0) onmVar;
            int i = zzs0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzs0Var.c = i - Integer.MIN_VALUE;
            } else {
                zzs0Var = new zzs0(this, onmVar);
            }
        } else {
            zzs0Var = new zzs0(this, onmVar);
        }
        Object objH = zzs0Var.a;
        int i2 = zzs0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objH);
                bza0 bza0Var = (bza0) this.b;
                zzs0Var.c = 1;
                objH = bza0Var.h(str, zzs0Var);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objH);
            }
            return ((Boolean) objH).booleanValue() ? r0t0.a : q0t0.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return s0t0.a;
        }
    }

    public poy0 a(bs0 bs0Var, dyd dydVar) {
        return y3o1.X(new n5u0(this, (byte) 20), o5v0.X0, new t1t0(this, (byte) 20), new vdv0(dydVar, (byte) 0), 8);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.f;
        Object obj4 = this.b;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 12:
                s8u0 s8u0Var = (s8u0) obj4;
                String str = (String) obj6;
                Context context = (Context) obj5;
                ou80 ou80Var = (ou80) obj2;
                gqt0 gqt0Var = (gqt0) obj3;
                if (((Boolean) obj).booleanValue()) {
                    if (gqt0Var instanceof gqt0) {
                        return s8u0Var.e(ou80Var);
                    }
                    eg.o();
                    return null;
                }
                PreparePlayOptions.Builder builderSuppressions = PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUri(str).build()).suppressions(Suppressions.create(Collections.singleton(Suppressions$Providers.MFT)));
                PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
                Boolean bool = Boolean.FALSE;
                PreparePlayOptions.Builder builderPlayerOptionsOverride = builderSuppressions.playerOptionsOverride(builder.shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build());
                PlayCommand.Builder builder2 = PlayCommand.builder(context, s8u0Var.b.a);
                String str2 = ou80Var != null ? ou80Var.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                Single singleA = s8u0Var.a.a(builder2.loggingParams(s8u0Var.a(str2)).options(builderPlayerOptionsOverride.build()).build());
                return singleA.map(new l1p0(singleA, (byte) 17));
            default:
                gx01 gx01Var = (gx01) obj4;
                int iOrdinal = ((ax01) obj).ordinal();
                if (iOrdinal == 0) {
                    return rqt0.F(gx01Var.j, new elu0((byte) 17, gx01Var, (String) obj6, (tv80) obj2, (String) obj5, (lnm) null)).flatMapCompletable(kcx0.e);
                }
                if (iOrdinal == 1) {
                    return CompletableEmpty.a;
                }
                if (iOrdinal == 2) {
                    return gx01Var.g.a((String) obj3, (String) obj6, (String) obj5);
                }
                eg.o();
                return null;
        }
    }

    public void b(String str) {
        String strValueOf = nhc1.S(str, "", false) ? "https://audiobooks.spotify.com/top-up" : String.valueOf(str);
        zhh1 zhh1Var = (zhh1) this.e;
        dg30 dg30Var = (dg30) this.b;
        Uri uri = Uri.parse(strValueOf);
        xxf xxfVar = dxf.b;
        xxf xxfVar2 = xxf.b;
        if (xxfVar == xxfVar2) {
            n57.e("CheckoutSource must not be " + xxfVar2);
        }
        x8g x8gVar = zhh1Var.a;
        v5g v5gVarB = x8gVar.c(uri) ? x8gVar.b(xxfVar, uri) : null;
        dg30Var.startActivity(v5gVarB != null ? x8g.a(dg30Var, v5gVarB) : zhh1Var.b.a(dg30Var, new lyf(xxfVar, new jyf(dg30Var.getString(2131953829)), uri)));
        vnd1 vnd1Var = (vnd1) this.d;
        i8h1 i8h1Var = (i8h1) vnd1Var.b;
        x6h1 x6h1VarC = ((xok0) vnd1Var.c).b.c();
        x6h1VarC.i.add(new a7h1("top_up_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strValueOf)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void c(String str) {
        String str2;
        if (!nhc1.Y(str, "https://", false)) {
            if (nhc1.Y(str, "spotify:audiobook:consideration", false)) {
                str2 = str;
                ((lzn0) this.c).f(new dwn0(str2, "", false, false, 0, 0, false, null, null, null));
            }
            vnd1 vnd1Var = (vnd1) this.d;
            i8h1 i8h1Var = (i8h1) vnd1Var.b;
            x6h1 x6h1VarC = ((xok0) vnd1Var.c).b.c();
            x6h1VarC.i.add(new a7h1("add_to_subscription_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        zhh1 zhh1Var = (zhh1) this.e;
        dg30 dg30Var = (dg30) this.b;
        Uri uri = Uri.parse(str);
        xxf xxfVar = dxf.b;
        xxf xxfVar2 = xxf.b;
        if (xxfVar == xxfVar2) {
            n57.e("CheckoutSource must not be " + xxfVar2);
        }
        x8g x8gVar = zhh1Var.a;
        v5g v5gVarB = x8gVar.c(uri) ? x8gVar.b(xxfVar, uri) : null;
        dg30Var.startActivity(v5gVarB != null ? x8g.a(dg30Var, v5gVarB) : zhh1Var.b.a(dg30Var, new lyf(xxfVar, new jyf(dg30Var.getString(2131953829)), uri)));
        str2 = str;
        vnd1 vnd1Var2 = (vnd1) this.d;
        i8h1 i8h1Var2 = (i8h1) vnd1Var2.b;
        x6h1 x6h1VarC2 = ((xok0) vnd1Var2.c).b.c();
        x6h1VarC2.i.add(new a7h1("add_to_subscription_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = true;
        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void d(String str) {
        vnd1 vnd1Var = (vnd1) this.d;
        lzn0 lzn0Var = (lzn0) this.c;
        if (str.equals("spotify:aaa:con:t")) {
            lzn0Var.f(new dwn0("spotify:aaa:con:t", "", false, false, 0, 0, false, null, null, null));
            vnd1Var.q("spotify:aaa:con:t");
        } else {
            lzn0Var.f(new dwn0(str, "", false, false, 0, 0, false, null, null, null));
            vnd1Var.q(str);
        }
    }

    public void e(String str) {
        String str2;
        lzn0 lzn0Var = (lzn0) this.c;
        if (str.equals("spotify:account-management:aom")) {
            lzn0Var.f(new dwn0("spotify:account-management:aom", "", false, false, 0, 0, false, null, null, null));
            str2 = str;
        } else {
            str2 = str;
            lzn0Var.f(new dwn0(str2, "", false, false, 0, 0, false, null, null, null));
        }
        vnd1 vnd1Var = (vnd1) this.d;
        i8h1 i8h1Var = (i8h1) vnd1Var.b;
        x6h1 x6h1VarC = ((xok0) vnd1Var.c).b.c();
        x6h1VarC.i.add(new a7h1("manage_add_on_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void f(String str) {
        dwn0 dwn0Var = new dwn0(str, "", false, false, 0, 0, false, null, null, null);
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(str).c;
        blc0 blc0Var2 = blc0.l2;
        if (blc0Var == blc0Var2) {
            ((wp20) this.f).M((dg30) this.b).subscribe();
        } else if (uic.u(str) && uic.x(str).c != blc0Var2) {
            ((lzn0) this.c).f(dwn0Var);
        }
        vnd1 vnd1Var = (vnd1) this.d;
        i8h1 i8h1Var = (i8h1) vnd1Var.b;
        x6h1 x6h1VarC = ((xok0) vnd1Var.c).b.c();
        x6h1VarC.i.add(new a7h1("request_listening_hours_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void g(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) this.f;
        ArrayList arrayList3 = (ArrayList) this.e;
        ArrayList arrayList4 = (ArrayList) this.d;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            arrayList.get(size).getClass();
            bhn0.d();
            return;
        }
        if (arrayList4.size() > 0) {
            int size2 = arrayList4.size();
            for (int i = 0; i < size2; i++) {
                if (arrayList2.contains(Integer.valueOf(i))) {
                    arrayList3.add(Integer.valueOf(i));
                } else {
                    if (arrayList4.get(i) != null) {
                        bhn0.d();
                        return;
                    }
                    int i2 = i + 1;
                    if (i2 < arrayList4.size()) {
                        arrayList4.get(i2).getClass();
                        bhn0.d();
                        return;
                    }
                }
            }
            for (int size3 = arrayList3.size() - 1; -1 < size3; size3--) {
                arrayList4.remove(((Number) arrayList3.get(size3)).intValue());
            }
            if (arrayList4.size() > 0) {
                arrayList4.get(0).getClass();
                bhn0.d();
            } else {
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(int i, onm onmVar) {
        wzs0 wzs0Var;
        if (onmVar instanceof wzs0) {
            wzs0Var = (wzs0) onmVar;
            int i2 = wzs0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wzs0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                wzs0Var = new wzs0(this, onmVar);
            }
        } else {
            wzs0Var = new wzs0(this, onmVar);
        }
        Object obj = wzs0Var.a;
        int i3 = wzs0Var.c;
        if (i3 == 0) {
            hm5.M(obj);
            wzs0Var.c = 1;
            Object objI = hap1.i(((long) i) * 1000, wzs0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return m0t0.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01cb A[LOOP:2: B:100:0x01c5->B:102:0x01cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:85:0x0186  */
    /* JADX WARN: Multi-variable type inference failed */
    public Serializable i(List list, ArrayList arrayList, onm onmVar) {
        xku0 xku0Var;
        Exception exc;
        ArrayList arrayList2;
        p811 p811Var;
        LinkedHashSet linkedHashSet;
        Iterator it;
        Object[] objArr;
        if (onmVar instanceof xku0) {
            xku0Var = (xku0) onmVar;
            int i = xku0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xku0Var.e = i - Integer.MIN_VALUE;
            } else {
                xku0Var = new xku0(this, onmVar);
            }
        } else {
            xku0Var = new xku0(this, onmVar);
        }
        Object objP = xku0Var.c;
        int i2 = xku0Var.e;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list) {
                    if (((zuc0) obj).m) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((zuc0) it2.next()).c);
                }
                Set setP1 = o7h.p1(arrayList4);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof yh90) {
                        arrayList5.add(obj2);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : arrayList5) {
                    yh90 yh90Var = (yh90) obj3;
                    if (yh90Var.g && setP1.contains(yh90Var.a)) {
                        arrayList6.add(obj3);
                    }
                }
                ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
                Iterator it3 = arrayList6.iterator();
                while (true) {
                    Object obj4 = null;
                    objArr = 0;
                    if (!it3.hasNext()) {
                        break;
                    }
                    yh90 yh90Var2 = (yh90) it3.next();
                    String str = yh90Var2.a;
                    for (Object obj5 : yh90Var2.X) {
                        xh90 xh90Var = (xh90) obj5;
                        if (nhc1.Y(xh90Var.a, "spotify:artist:", false) && xh90Var.a.length() > 15) {
                            obj4 = obj5;
                            break;
                        }
                    }
                    xh90 xh90Var2 = (xh90) obj4;
                    arrayList7.add(new p7b(str, xh90Var2 != null ? new n7b(xh90Var2.a) : m7b.a));
                }
                if (arrayList7.isEmpty()) {
                    return w7x.a;
                }
                try {
                    p811 p811Var2 = new p811();
                    p811Var2.a = b7x.a;
                    long j = yku0.a;
                    dvq0 dvq0Var = new dvq0((Object) this, (Object) arrayList7, (Object) p811Var2, (lnm) (objArr == true ? 1 : 0), (byte) 27);
                    xku0Var.a = arrayList7;
                    xku0Var.b = p811Var2;
                    xku0Var.e = 1;
                    objP = rc2.P(j, dvq0Var, xku0Var);
                    d9n d9nVar = d9n.a;
                    if (objP == d9nVar) {
                        return d9nVar;
                    }
                    arrayList2 = arrayList7;
                    p811Var = p811Var2;
                } catch (Exception e) {
                    exc = e;
                    arrayList2 = arrayList7;
                    Logger.e(exc, "Failed to look up blocked tracks", new Object[0]);
                    linkedHashSet = new LinkedHashSet();
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(((p7b) it.next()).a);
                    }
                    return linkedHashSet;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p811Var = xku0Var.b;
                arrayList2 = xku0Var.a;
                try {
                    hm5.M(objP);
                } catch (Exception e2) {
                    exc = e2;
                    Logger.e(exc, "Failed to look up blocked tracks", new Object[0]);
                    linkedHashSet = new LinkedHashSet();
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(((p7b) it.next()).a);
                    }
                    return linkedHashSet;
                }
            }
            Map map = (Map) objP;
            Map map2 = map == null ? (Map) p811Var.a : map;
            ArrayList arrayList8 = new ArrayList();
            for (Object obj6 : arrayList2) {
                ycy ycyVar = (ycy) map2.get(((p7b) obj6).a);
                if (ycyVar != null) {
                    if ((ycyVar.b || ycyVar.c.a()) != true) {
                        if (map != null) {
                        }
                    }
                    arrayList8.add(obj6);
                } else if (map != null && (ycyVar == null || !(!(ycyVar.c instanceof ucy)))) {
                    arrayList8.add(obj6);
                }
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it4 = arrayList8.iterator();
            while (it4.hasNext()) {
                linkedHashSet2.add(((p7b) it4.next()).a);
            }
            return linkedHashSet2;
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    public boolean j(String str, cr01 cr01Var) {
        return ((vh4) this.f).e() && !hxo1.s(cr01Var) && cr01Var.t && !cr01Var.u && dko1.o((waz0) this.e, str, cr01Var.B);
    }

    public b0i0 k(List list) {
        return new b0i0((android.content.Context) this.b, ((g4q) this.c).a(list), (qxz0) this.d, (h4q) this.e, (zwz0) this.f);
    }

    public Observable l() {
        wgb wgbVar = (wgb) this.d;
        ArrayList arrayList = new ArrayList();
        arrayList.add(wgbVar.a.get());
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bru0 bru0Var = (bru0) ((dz01) it.next());
            arrayList2.add(Observable.combineLatest(bru0Var.d, bru0Var.e, new pvc((byte) 19)).subscribeOn(bru0Var.b).onErrorReturn(mi10.b1));
        }
        return Observable.combineLatest(arrayList2, djx0.e).scan(z6x.a, new a0b(this, (byte) 22)).distinctUntilChanged().observeOn((Scheduler) this.b).debounce(njx0.e).compose((o4e0) this.f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r10.invoke(r0) == r5) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(java.lang.String r7, p.m4m r8, p.tv80 r9, p.iu30 r10, p.onm r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof p.z2u0
            if (r0 == 0) goto L13
            r0 = r11
            p.z2u0 r0 = (p.z2u0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.z2u0 r0 = new p.z2u0
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L41
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            p.hm5.M(r11)
            goto La4
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L32:
            p.a8d1 r7 = r0.d
            r10 = r7
            p.iu30 r10 = (p.iu30) r10
            p.tv80 r9 = r0.c
            p.m4m r8 = r0.b
            java.lang.String r7 = r0.a
            p.hm5.M(r11)
            goto L5c
        L41:
            p.hm5.M(r11)
            p.evz r11 = r6.E(r7)
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r1 = r10
            p.a8d1 r1 = (p.a8d1) r1
            r0.d = r1
            r0.g = r3
            java.lang.Object r11 = p.b5p1.k(r11, r0)
            if (r11 != r5) goto L5c
            goto La3
        L5c:
            p.y2u0 r11 = (p.y2u0) r11
            if (r11 == 0) goto La4
            boolean r1 = r11.c
            if (r1 == 0) goto L73
            java.lang.Object r6 = r6.f
            p.vb2 r6 = (p.vb2) r6
            p.db2 r7 = new p.db2
            int r8 = r11.d
            r7.<init>(r8)
            p.vb2.b(r6, r7, r3, r9)
            goto La4
        L73:
            p.m4m r9 = p.m4m.a
            if (r8 != r9) goto L83
            boolean r9 = r11.b
            if (r9 == 0) goto L83
            java.lang.Object r6 = r6.b
            p.yh2 r6 = (p.yh2) r6
            r6.c(r7, r4)
            goto La4
        L83:
            p.m4m r9 = p.m4m.b
            if (r8 != r9) goto L93
            boolean r8 = r11.a
            if (r8 == 0) goto L93
            java.lang.Object r6 = r6.d
            p.wr00 r6 = (p.wr00) r6
            r6.a(r7)
            goto La4
        L93:
            r0.a = r4
            r0.b = r4
            r0.c = r4
            r0.d = r4
            r0.g = r2
            java.lang.Object r6 = r10.invoke(r0)
            if (r6 != r5) goto La4
        La3:
            return r5
        La4:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ytp0.m(java.lang.String, p.m4m, p.tv80, p.iu30, p.onm):java.lang.Object");
    }

    public String n(long j) {
        idd1 idd1Var = (idd1) this.e;
        yqg yqgVar = (yqg) this.b;
        if (j == 0) {
            return "";
        }
        long jB = yqgVar.b();
        ytw0 ytw0Var = jfv.b;
        long jL0 = fdg1.l0(jB - j, ngv.d);
        ngv ngvVar = ngv.g;
        if (jfv.u(jL0, ngvVar) < 24) {
            return ((RelativeDateTimeFormatter) idd1Var.getValue()).format(jfv.u(jL0, ngvVar), RelativeDateTimeFormatter.Direction.LAST, RelativeDateTimeFormatter.RelativeUnit.HOURS);
        }
        ngv ngvVar2 = ngv.h;
        if (jfv.u(jL0, ngvVar2) < 7) {
            return ((RelativeDateTimeFormatter) idd1Var.getValue()).format(jfv.u(jL0, ngvVar2), RelativeDateTimeFormatter.Direction.LAST, RelativeDateTimeFormatter.RelativeUnit.DAYS);
        }
        if (jfv.u(jL0, ngvVar2) < 28) {
            return ((RelativeDateTimeFormatter) idd1Var.getValue()).format(jfv.u(jL0, ngvVar2) / 7, RelativeDateTimeFormatter.Direction.LAST, RelativeDateTimeFormatter.RelativeUnit.WEEKS);
        }
        Calendar calendarD = yqgVar.d();
        calendarD.setTimeInMillis(jB);
        int i = calendarD.get(1);
        Calendar calendarD2 = yqgVar.d();
        calendarD2.setTimeInMillis(j);
        if (calendarD2.get(1) == i) {
            String str = ((DateFormat) ((idd1) this.c).getValue()).format(Long.valueOf(j));
            str.getClass();
            return str;
        }
        String str2 = ((DateFormat) ((idd1) this.d).getValue()).format(Long.valueOf(j));
        str2.getClass();
        return str2;
    }

    public void o(ArrayList arrayList) {
        synchronized (((ArrayList) this.c)) {
            arrayList.clear();
            g((ArrayList) this.b);
            g((ArrayList) this.c);
        }
    }

    public n6r0 p() {
        return (n6r0) ((idd1) this.d).getValue();
    }

    public int s() {
        return ((Number) ((idd1) this.e).getValue()).intValue();
    }

    public lik1 t() {
        return (lik1) ((idd1) this.c).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (B(r8, r9, r0) == r5) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object u(p.aew r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.lkt0
            if (r0 == 0) goto L13
            r0 = r9
            p.lkt0 r0 = (p.lkt0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.lkt0 r0 = new p.lkt0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L76
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            java.lang.String r8 = r0.b
            p.aew r1 = r0.a
            p.hm5.M(r9)
            goto L63
        L39:
            p.hm5.M(r9)
            p.lst0 r9 = r8.b
            java.lang.String r1 = r8.a
            if (r9 == 0) goto L4f
            java.lang.String r9 = r9.getUri()
            if (r9 == 0) goto L4f
            boolean r6 = r9.equals(r1)
            if (r6 != 0) goto L4f
            goto L50
        L4f:
            r9 = r4
        L50:
            if (r9 != 0) goto L53
            goto L54
        L53:
            r1 = r9
        L54:
            r0.a = r8
            r0.b = r9
            r0.e = r3
            java.lang.Object r1 = r7.D(r1, r8, r0)
            if (r1 != r5) goto L61
            goto L75
        L61:
            r1 = r8
            r8 = r9
        L63:
            if (r8 != 0) goto L67
            java.lang.String r8 = r1.a
        L67:
            p.tv80 r9 = r1.c
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r7 = r7.B(r8, r9, r0)
            if (r7 != r5) goto L76
        L75:
            return r5
        L76:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ytp0.u(p.aew, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    public boolean v(le30 le30Var, String str, int i) {
        ge4 ge4Var = (ge4) this.b;
        boolean z = ge4Var.d() != fe4.b;
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC != 1) {
                if (iC != 2) {
                    eg.o();
                    return false;
                }
            } else if (z || ge4Var.c() != ee4.d) {
                z = false;
            } else {
                z = true;
            }
        } else if (z || ge4Var.c() != ee4.c) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = ge4Var.e() && le30Var == le30.b;
        boolean zB = ((fza1) this.c).b(str);
        if (zB && z && !z2) {
            fn31.T(smo1.e((q8n) this.f), (o8n) null, 0, new f3t0(this, str, null, (byte) 18), 3);
        }
        return (!z || z2 || zB) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:52:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x0117  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0148  */
    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    public Object w(abu abuVar, String str, onm onmVar) {
        r9r0 r9r0Var;
        abu abuVar2;
        Object dtcVar;
        abu abuVar3;
        abu abuVar4;
        String str2;
        s9l1 s9l1Var;
        String str3;
        s9l1 s9l1Var2;
        String str4;
        s9l1 s9l1Var3;
        String str5 = str;
        lc31 lc31Var = (lc31) this.e;
        qzq qzqVar = ((u680) this.c).a;
        v75 v75Var = (v75) this.f;
        xjl xjlVar = (xjl) this.d;
        if (onmVar instanceof r9r0) {
            r9r0Var = (r9r0) onmVar;
            int i = r9r0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                r9r0Var.g = i - Integer.MIN_VALUE;
            } else {
                r9r0Var = new r9r0(this, onmVar);
            }
        } else {
            r9r0Var = new r9r0(this, onmVar);
        }
        Object objA = r9r0Var.e;
        int i2 = r9r0Var.g;
        etc etcVar = etc.a;
        lnm lnmVar = null;
        rih1 rih1Var = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            xjlVar.d(str5, abuVar.getContextUri());
            abuVar2 = abuVar;
            r9r0Var.a = abuVar2;
            r9r0Var.b = str5;
            r9r0Var.g = 1;
            s9l1 s9l1Var4 = (s9l1) qzqVar.get(str5);
            dtcVar = s9l1Var4 != null ? new dtc(s9l1Var4) : etcVar;
            if (dtcVar != rih1Var) {
            }
            return rih1Var;
        }
        if (i2 == 1) {
            str5 = r9r0Var.b;
            abu abuVar5 = r9r0Var.a;
            hm5.M(objA);
            dtcVar = objA;
            abuVar2 = abuVar5;
        } else {
            if (i2 == 2) {
                str5 = r9r0Var.b;
                abuVar3 = r9r0Var.a;
                hm5.M(objA);
                abuVar2 = abuVar3;
                if (v75Var.c()) {
                    wvq0 wvq0Var = new wvq0(this, (byte) 8);
                    cto0 cto0Var = new cto0(this, abuVar2, lnmVar, (byte) 17);
                    r9r0Var.a = null;
                    r9r0Var.b = str5;
                    r9r0Var.g = 3;
                    objA = dzo1.g(3, wvq0Var, cto0Var, r9r0Var);
                    if (objA != rih1Var) {
                        str2 = str5;
                        s9l1Var = (s9l1) objA;
                        abuVar4 = null;
                        str3 = str2;
                        s9l1Var2 = s9l1Var;
                        if (!s9l1Var2.b.isEmpty()) {
                            eg.m("The list of items shouldn't be empty.");
                            return null;
                        }
                        r9r0Var.a = abuVar4;
                        r9r0Var.b = str3;
                        r9r0Var.c = s9l1Var2;
                        r9r0Var.d = s9l1Var2;
                        r9r0Var.g = 5;
                        qzqVar.put(str3, s9l1Var2);
                        if (rih1.a != rih1Var) {
                            str4 = str3;
                            s9l1Var3 = s9l1Var2;
                        }
                    }
                } else {
                    mjs mjsVar = (mjs) this.b;
                    ArrayList arrayListC = xjlVar.c();
                    abuVar4 = null;
                    r9r0Var.a = null;
                    r9r0Var.b = str5;
                    r9r0Var.g = 4;
                    objA = mjsVar.a(abuVar2, arrayListC, (String) null, r9r0Var);
                    if (objA != rih1Var) {
                        str2 = str5;
                        s9l1Var = (s9l1) objA;
                        str3 = str2;
                        s9l1Var2 = s9l1Var;
                        if (!s9l1Var2.b.isEmpty()) {
                            eg.m("The list of items shouldn't be empty.");
                            return null;
                        }
                        r9r0Var.a = abuVar4;
                        r9r0Var.b = str3;
                        r9r0Var.c = s9l1Var2;
                        r9r0Var.d = s9l1Var2;
                        r9r0Var.g = 5;
                        qzqVar.put(str3, s9l1Var2);
                        if (rih1.a != rih1Var) {
                            str4 = str3;
                            s9l1Var3 = s9l1Var2;
                        }
                    }
                }
                return rih1Var;
            }
            if (i2 == 3) {
                str2 = r9r0Var.b;
                hm5.M(objA);
                s9l1Var = (s9l1) objA;
                abuVar4 = null;
                str3 = str2;
                s9l1Var2 = s9l1Var;
                if (!s9l1Var2.b.isEmpty()) {
                    eg.m("The list of items shouldn't be empty.");
                    return null;
                }
                r9r0Var.a = abuVar4;
                r9r0Var.b = str3;
                r9r0Var.c = s9l1Var2;
                r9r0Var.d = s9l1Var2;
                r9r0Var.g = 5;
                qzqVar.put(str3, s9l1Var2);
                if (rih1.a != rih1Var) {
                    str4 = str3;
                    s9l1Var3 = s9l1Var2;
                }
                return rih1Var;
            }
            if (i2 == 4) {
                str2 = r9r0Var.b;
                hm5.M(objA);
                abuVar4 = null;
                s9l1Var = (s9l1) objA;
                str3 = str2;
                s9l1Var2 = s9l1Var;
                if (!s9l1Var2.b.isEmpty()) {
                    eg.m("The list of items shouldn't be empty.");
                    return null;
                }
                r9r0Var.a = abuVar4;
                r9r0Var.b = str3;
                r9r0Var.c = s9l1Var2;
                r9r0Var.d = s9l1Var2;
                r9r0Var.g = 5;
                qzqVar.put(str3, s9l1Var2);
                if (rih1.a != rih1Var) {
                    str4 = str3;
                    s9l1Var3 = s9l1Var2;
                }
                return rih1Var;
            }
            if (i2 != 5) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s9l1Var2 = r9r0Var.d;
            s9l1Var3 = r9r0Var.c;
            str4 = r9r0Var.b;
            hm5.M(objA);
        }
        xjlVar.a(str4, K(s9l1Var2.b));
        if (v75Var.b()) {
            lc31Var.b.set(0);
            lc31Var.c.set(0L);
        }
        return s9l1Var3;
        ftc ftcVar = (ftc) dtcVar;
        if (ftcVar instanceof dtc) {
            return ((dtc) ftcVar).a;
        }
        if (!u890.j(ftcVar, etcVar)) {
            eg.o();
            return null;
        }
        if (v75Var.b()) {
            r9r0Var.a = abuVar2;
            r9r0Var.b = str5;
            r9r0Var.g = 2;
            if (lc31Var.a(r9r0Var) != rih1Var) {
                abuVar3 = abuVar2;
                abuVar2 = abuVar3;
                if (v75Var.c()) {
                    wvq0 wvq0Var2 = new wvq0(this, (byte) 8);
                    cto0 cto0Var2 = new cto0(this, abuVar2, lnmVar, (byte) 17);
                    r9r0Var.a = null;
                    r9r0Var.b = str5;
                    r9r0Var.g = 3;
                    objA = dzo1.g(3, wvq0Var2, cto0Var2, r9r0Var);
                    if (objA != rih1Var) {
                        str2 = str5;
                        s9l1Var = (s9l1) objA;
                        abuVar4 = null;
                        str3 = str2;
                        s9l1Var2 = s9l1Var;
                        if (!s9l1Var2.b.isEmpty()) {
                            eg.m("The list of items shouldn't be empty.");
                            return null;
                        }
                        r9r0Var.a = abuVar4;
                        r9r0Var.b = str3;
                        r9r0Var.c = s9l1Var2;
                        r9r0Var.d = s9l1Var2;
                        r9r0Var.g = 5;
                        qzqVar.put(str3, s9l1Var2);
                        if (rih1.a != rih1Var) {
                            str4 = str3;
                            s9l1Var3 = s9l1Var2;
                            xjlVar.a(str4, K(s9l1Var2.b));
                            if (v75Var.b()) {
                                lc31Var.b.set(0);
                                lc31Var.c.set(0L);
                            }
                            return s9l1Var3;
                        }
                    }
                } else {
                    mjs mjsVar2 = (mjs) this.b;
                    ArrayList arrayListC2 = xjlVar.c();
                    abuVar4 = null;
                    r9r0Var.a = null;
                    r9r0Var.b = str5;
                    r9r0Var.g = 4;
                    objA = mjsVar2.a(abuVar2, arrayListC2, (String) null, r9r0Var);
                    if (objA != rih1Var) {
                        str2 = str5;
                        s9l1Var = (s9l1) objA;
                        str3 = str2;
                        s9l1Var2 = s9l1Var;
                        if (!s9l1Var2.b.isEmpty()) {
                            eg.m("The list of items shouldn't be empty.");
                            return null;
                        }
                        r9r0Var.a = abuVar4;
                        r9r0Var.b = str3;
                        r9r0Var.c = s9l1Var2;
                        r9r0Var.d = s9l1Var2;
                        r9r0Var.g = 5;
                        qzqVar.put(str3, s9l1Var2);
                        if (rih1.a != rih1Var) {
                            str4 = str3;
                            s9l1Var3 = s9l1Var2;
                            xjlVar.a(str4, K(s9l1Var2.b));
                            if (v75Var.b()) {
                                lc31Var.b.set(0);
                                lc31Var.c.set(0L);
                            }
                            return s9l1Var3;
                        }
                    }
                }
            }
        } else if (v75Var.c()) {
            wvq0 wvq0Var3 = new wvq0(this, (byte) 8);
            cto0 cto0Var3 = new cto0(this, abuVar2, lnmVar, (byte) 17);
            r9r0Var.a = null;
            r9r0Var.b = str5;
            r9r0Var.g = 3;
            objA = dzo1.g(3, wvq0Var3, cto0Var3, r9r0Var);
            if (objA != rih1Var) {
                str2 = str5;
                s9l1Var = (s9l1) objA;
                abuVar4 = null;
                str3 = str2;
                s9l1Var2 = s9l1Var;
                if (!s9l1Var2.b.isEmpty()) {
                    eg.m("The list of items shouldn't be empty.");
                    return null;
                }
                r9r0Var.a = abuVar4;
                r9r0Var.b = str3;
                r9r0Var.c = s9l1Var2;
                r9r0Var.d = s9l1Var2;
                r9r0Var.g = 5;
                qzqVar.put(str3, s9l1Var2);
                if (rih1.a != rih1Var) {
                    str4 = str3;
                    s9l1Var3 = s9l1Var2;
                    xjlVar.a(str4, K(s9l1Var2.b));
                    if (v75Var.b()) {
                        lc31Var.b.set(0);
                        lc31Var.c.set(0L);
                    }
                    return s9l1Var3;
                }
            }
        } else {
            mjs mjsVar3 = (mjs) this.b;
            ArrayList arrayListC3 = xjlVar.c();
            abuVar4 = null;
            r9r0Var.a = null;
            r9r0Var.b = str5;
            r9r0Var.g = 4;
            objA = mjsVar3.a(abuVar2, arrayListC3, (String) null, r9r0Var);
            if (objA != rih1Var) {
                str2 = str5;
                s9l1Var = (s9l1) objA;
                str3 = str2;
                s9l1Var2 = s9l1Var;
                if (!s9l1Var2.b.isEmpty()) {
                    eg.m("The list of items shouldn't be empty.");
                    return null;
                }
                r9r0Var.a = abuVar4;
                r9r0Var.b = str3;
                r9r0Var.c = s9l1Var2;
                r9r0Var.d = s9l1Var2;
                r9r0Var.g = 5;
                qzqVar.put(str3, s9l1Var2);
                if (rih1.a != rih1Var) {
                    str4 = str3;
                    s9l1Var3 = s9l1Var2;
                    xjlVar.a(str4, K(s9l1Var2.b));
                    if (v75Var.b()) {
                        lc31Var.b.set(0);
                        lc31Var.c.set(0L);
                    }
                    return s9l1Var3;
                }
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r11 == r6) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object x(p.onm r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ytp0.x(p.onm):java.lang.Object");
    }

    public Observable y(r9c r9cVar, int i) {
        m210 m210Var = r9cVar.e;
        return m210Var == null ? Observable.error(new Throwable("externalAccessoryDescription is null")) : ((Observable) this.b).filter(va20.W0).map(kc20.X0).switchMap(new b8p1(this, m210Var, i, r9cVar, (byte) 15));
    }

    public ytp0(Observable observable, krh krhVar, q54 q54Var, Scheduler scheduler) {
        this.a = (byte) 28;
        this.b = observable;
        this.c = krhVar;
        this.d = q54Var;
        this.e = scheduler;
        this.f = new rku();
    }

    public ytp0(hvp0 hvp0Var) {
        this.a = (byte) 20;
        this.b = hvp0Var;
        this.f = new idd1(new pbx0(this, (byte) 1));
        this.c = new idd1(new pbx0(this, (byte) 3));
        this.d = new idd1(new pbx0(this, (byte) 0));
        this.e = new idd1(new pbx0(this, (byte) 2));
    }

    public ytp0(ov20 ov20Var, xv61 xv61Var, m020 m020Var, pcl pclVar) {
        this.a = (byte) 0;
        this.b = ov20Var;
        this.c = xv61Var;
        this.d = m020Var;
        this.e = pclVar;
        this.f = new idd1(wso0.T0);
    }

    public ytp0(Scheduler scheduler, uu00 uu00Var, wgb wgbVar, gx01 gx01Var, fza fzaVar) {
        this.a = (byte) 26;
        this.b = scheduler;
        this.c = uu00Var;
        this.d = wgbVar;
        this.e = gx01Var;
        this.f = new o4e0(this, (byte) 28);
    }

    public ytp0(yqg yqgVar) {
        this.a = (byte) 29;
        this.b = yqgVar;
        this.f = new idd1(w0n0.O0);
        this.c = new idd1(new fo11(this, (byte) 0));
        this.d = new idd1(new fo11(this, (byte) 1));
        this.e = new idd1(new fo11(this, (byte) 2));
    }

    public ytp0() {
        this.a = (byte) 5;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        new ArrayList();
    }

    public /* synthetic */ ytp0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public ytp0(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, EncoreButton encoreButton, ConstraintLayout constraintLayout2, TextView textView2) {
        this.a = (byte) 10;
        this.b = textView;
        this.c = imageView;
        this.d = encoreButton;
        this.e = constraintLayout2;
        this.f = textView2;
    }

    public ytp0(ConstraintLayout constraintLayout, ContextMenuButton contextMenuButton, CreatorButtonView creatorButtonView, TextView textView, EncoreViewStub encoreViewStub, ImageButton imageButton) {
        this.a = (byte) 19;
        this.b = constraintLayout;
        this.c = contextMenuButton;
        this.d = creatorButtonView;
        this.e = textView;
        this.f = imageButton;
    }

    public ytp0(xrc0 xrc0Var, sx3 sx3Var, f8b f8bVar, q8n q8nVar) {
        this.a = (byte) 15;
        this.b = xrc0Var;
        this.c = sx3Var;
        this.d = f8bVar;
        this.e = q8nVar;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        iou0VarV.x();
        iou0VarV.w(ItemMetadataPolicy.o());
        hz00 hz00Var = hz00.W3;
        clc0 clc0Var = clc0.e;
        ItemExtensionPolicy itemExtensionPolicyL = L(clc0Var, hz00Var);
        hz00 hz00Var2 = hz00.X3;
        ItemExtensionPolicy itemExtensionPolicyL2 = L(clc0Var, hz00Var2);
        hz00 hz00Var3 = hz00.a4;
        ItemExtensionPolicy itemExtensionPolicyL3 = L(clc0Var, hz00Var3);
        hz00 hz00Var4 = hz00.Z3;
        ItemExtensionPolicy itemExtensionPolicyL4 = L(clc0Var, hz00Var4);
        clc0 clc0Var2 = clc0.h;
        iou0VarV.n(p7h.M(new ItemExtensionPolicy[]{itemExtensionPolicyL, itemExtensionPolicyL2, itemExtensionPolicyL3, itemExtensionPolicyL4, L(clc0Var2, hz00Var), L(clc0Var2, hz00Var2), L(clc0Var2, hz00Var3), L(clc0Var2, hz00Var4), L(clc0Var2, hz00.b4)}));
        hru0VarS.v(iou0VarV);
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.R();
        hru0VarS.x(sku0VarP);
        this.f = hru0VarS.build();
    }
}
