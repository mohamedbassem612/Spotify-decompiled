package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.connect.esperanto.proto.ConnectMessages;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.watchfeed.uiusecases.element.videothumbnail.VideoThumbnailView;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qmr implements qiw, Function, sh, n7b1, Init, yu30 {
    public final /* synthetic */ byte a;
    public final Object b;

    public qmr() {
        this.a = (byte) 4;
        this.b = Build.VERSION.SDK_INT >= 28 ? new owr((byte) 6) : new l7c((byte) 6);
    }

    public static dig1 a(go1 go1Var, Set set) {
        boolean zIsEmpty = set.isEmpty();
        w7x w7xVar = w7x.a;
        if (zIsEmpty) {
            return new dig1(go1Var, w7xVar);
        }
        List list = go1Var.d;
        ArrayList<ot1> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (set.contains(((pt1) obj).getUri())) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return new dig1(go1Var, w7xVar);
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        for (ot1 ot1VarG : arrayList) {
            if (ot1VarG instanceof ot1) {
                ot1VarG = ot1.g(ot1VarG, true, 32743);
            } else if (!(ot1VarG instanceof nt1)) {
                eg.o();
                return null;
            }
            arrayList3.add(ot1VarG);
        }
        return new dig1(go1.a(go1Var, 0L, o7h.N0(arrayList3, go1Var.c), arrayList2, 51), set);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                sor sorVar = (sor) obj2;
                jo20 jo20Var = sorVar.c;
                q8n q8nVar = sorVar.d;
                boolean zIsEnabled = jo20Var.isEnabled();
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                c3l c3lVar = sorVar.b;
                if (zBooleanValue) {
                    return yoi1.i(c3lVar.g(zIsEnabled), q8nVar);
                }
                c3l c3lVar2 = c3lVar;
                c3lVar2.getClass();
                u4l u4lVarN = ConnectMessages.StateRequest.n();
                u4lVarN.q();
                u4lVarN.n(false);
                u4lVarN.t(true);
                u4lVarN.s(true);
                u4lVarN.r(zIsEnabled);
                ConnectMessages.StateRequest stateRequestBuild = u4lVarN.build();
                stateRequestBuild.getClass();
                return yoi1.i(c3lVar2.c(stateRequestBuild), q8nVar);
            case 7:
                mmr0 mmr0Var = (mmr0) obj;
                Object obj3 = mmr0Var.a;
                Object obj4 = mmr0Var.b;
                Objects.toString(obj3);
                Objects.toString(obj4);
                vgr vgrVar = (vgr) obj2;
                l0l l0lVarC = ((g0l) vgrVar.c).c();
                return l0lVarC != null ? new i5w0(new sa0(l0lVarC, (kx7) obj3, vgrVar.a, ((v5u0) vgrVar.e).b, vgrVar.b)) : j5.a;
            case 10:
                String str = (String) obj;
                kp5 kp5Var = (kp5) obj2;
                int length = str.length();
                Context context = (Context) kp5Var.a;
                String string = length > 0 ? context.getString(2131952253, str) : context.getString(2131952249);
                string.getClass();
                return kp5Var.y(string);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                mmr0 mmr0Var2 = (mmr0) obj;
                return new v9u(((Number) mmr0Var2.b).longValue(), ((yqg) ((s24) obj2).t).b(), ((Boolean) mmr0Var2.a).booleanValue());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((k3v) obj2).b.b((YourLibraryRequest) obj);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                kby kbyVar = ((wsc0) obj).f;
                boolean z2 = kbyVar.w.b;
                le30 le30VarA = ((me30) ((jut) obj2).c).a(kbyVar.p);
                if (z2 && le30VarA != le30.b1 && le30VarA != le30.c1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                Integer numC0 = nhc1.c0((String) obj);
                return Integer.valueOf(numC0 != null ? numC0.intValue() : ((h84) ((yjq) obj2).e).c());
            case 27:
                vn90 vn90Var = (vn90) obj;
                jma jmaVar = ((zdz) obj2).d;
                rw20 items = vn90Var.getItems();
                rw20 pw20Var = items instanceof rw20 ? items : new pw20(items, items);
                return new ydz(b380.o(hr80.o((Iterable) pw20Var.a.e(pw20Var), new kf21(jmaVar))), vn90Var);
            default:
                return ((ruz) obj2).e(SeekToCommand.create(((i9u0) obj).a));
        }
    }

    public void b() {
        ((iu30) this.b).invoke(chj0.a);
    }

    public r930 c(Context context) {
        ProviderInfo providerInfo;
        o930 o930Var;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        o0c.p(packageManager, "Package manager required to locate emoji font provider");
        l7c l7cVar = (l7c) this.b;
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            o930Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrO = l7cVar.o(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrO) {
                    arrayList.add(signature.toByteArray());
                }
                o930Var = new o930(str, str2, "emojicompat-emoji-font", (String) null, (String) null, Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException unused) {
                o930Var = null;
            }
        }
        if (o930Var == null) {
            return null;
        }
        return new r930(new q930(context, o930Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, String str2, onm onmVar) {
        sdt sdtVar;
        qmr qmrVar;
        Object qdtVar;
        if (onmVar instanceof sdt) {
            sdtVar = (sdt) onmVar;
            int i = sdtVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdtVar.e = i - Integer.MIN_VALUE;
            } else {
                sdtVar = new sdt(this, onmVar);
            }
        } else {
            sdtVar = new sdt(this, onmVar);
        }
        Object objO = sdtVar.c;
        int i2 = sdtVar.e;
        py21 py21Var = null;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                try {
                    qmrVar = this;
                    try {
                        zlo zloVar = new zlo(qmrVar, str, str2, (lnm) null, (byte) 25);
                        sdtVar.a = str;
                        sdtVar.b = str2;
                        sdtVar.e = 1;
                        objO = rc2.O(20000L, zloVar, sdtVar);
                        d9n d9nVar = d9n.a;
                        if (objO == d9nVar) {
                            return d9nVar;
                        }
                        str = str;
                        str2 = str2;
                        py21Var = (py21) objO;
                    } catch (Exception unused) {
                        str = str;
                        str2 = str2;
                    }
                } catch (Exception unused2) {
                    qmrVar = this;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = sdtVar.b;
                str = sdtVar.a;
                try {
                    hm5.M(objO);
                    qmrVar = this;
                    try {
                        py21Var = (py21) objO;
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                    qmrVar = this;
                }
            }
            if (py21Var == null) {
                return new pdt(str2, str, false);
            }
            os osVar = new os(str2, str, qmrVar, (byte) 11);
            if (py21Var instanceof ly21) {
                qdtVar = osVar.invoke(((ly21) py21Var).a);
            } else {
                if (!(py21Var instanceof oy21)) {
                    eg.o();
                    return null;
                }
                hyc0 hyc0Var = (hyc0) ((oy21) py21Var).a;
                qdtVar = new qdt(hyc0Var.a, hyc0Var.b);
            }
            return (rdt) qdtVar;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(go1 go1Var, String str, Set set, onm onmVar) {
        wxs wxsVar;
        if (onmVar instanceof wxs) {
            wxsVar = (wxs) onmVar;
            int i = wxsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wxsVar.d = i - Integer.MIN_VALUE;
            } else {
                wxsVar = new wxs(this, onmVar);
            }
        } else {
            wxsVar = new wxs(this, onmVar);
        }
        Object objB = wxsVar.b;
        int i2 = wxsVar.d;
        if (i2 == 0) {
            hm5.M(objB);
            if (set != null) {
                return a(go1Var, set);
            }
            List list = go1Var.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ot1) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                ot1 ot1Var = (ot1) obj2;
                String str2 = ot1Var.a;
                String str3 = bo1.a;
                Set set2 = s4b1.f;
                if (bo1.a(uic.x(str2)) && ot1Var.h) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((ot1) it.next()).a);
            }
            if (arrayList3.isEmpty()) {
                return new dig1(go1Var, w7x.a);
            }
            cig1 cig1Var = (cig1) this.b;
            wxsVar.a = go1Var;
            wxsVar.d = 1;
            objB = cig1Var.b(str, arrayList3, wxsVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            go1Var = wxsVar.a;
            hm5.M(objB);
        }
        return a(go1Var, (Set) objB);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    public First e0(Object obj) {
        boolean z;
        boolean zBooleanValue;
        nt81 nt81Var = (nt81) obj;
        nt81Var.getClass();
        mnu mnuVar = ((fnu) this.b).f;
        boolean z2 = mnuVar.a == 2;
        if (mnuVar.a() == 1) {
            wnu wnuVar = (wnu) ((fnu) this.b).q.getValue();
            synchronized (wnuVar) {
                zBooleanValue = ((Boolean) wnuVar.b.getValue()).booleanValue();
            }
            if (zBooleanValue) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        as81 as81Var = null;
        wr81 wr81Var = z2 ? wr81.a : null;
        if (z && !nt81Var.o) {
            as81Var = as81.a;
        }
        return First.c(nt81Var, dm61.B0(new cs81[]{xr81.a, wr81Var, as81Var}));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:37|20|21|(1:23)(1:24)) */
    /* JADX WARN: Code duplicated, block: B:23:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        r5 = r9;
        r9 = r1;
        r1 = r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005c -> B:25:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0062 -> B:31:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(p.ocd1 r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.bwt
            if (r0 == 0) goto L13
            r0 = r9
            p.bwt r0 = (p.bwt) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.bwt r0 = new p.bwt
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 != r3) goto L30
            int r8 = r0.d
            int r1 = r0.c
            int r4 = r0.b
            p.ocd1 r5 = r0.a
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L66
            goto L5e
        L2e:
            r9 = move-exception
            goto L68
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L37:
            p.hm5.M(r9)
            r9 = 0
            r4 = r9
            r9 = r8
            r8 = r4
            r4 = r2
        L3f:
            if (r8 >= r4) goto L81
            java.lang.Object r1 = r7.b     // Catch: java.lang.Exception -> L61 java.util.concurrent.CancellationException -> L66
            p.awt r1 = (p.awt) r1     // Catch: java.lang.Exception -> L61 java.util.concurrent.CancellationException -> L66
            com.spotify.pushkatokens.v1.proto.SyncDeviceRequest r5 = p.sok.A(r9)     // Catch: java.lang.Exception -> L61 java.util.concurrent.CancellationException -> L66
            r0.a = r9     // Catch: java.lang.Exception -> L61 java.util.concurrent.CancellationException -> L66
            r0.b = r4     // Catch: java.lang.Exception -> L61 java.util.concurrent.CancellationException -> L66
            r0.c = r8     // Catch: java.lang.Exception -> L61 java.util.concurrent.CancellationException -> L66
            r0.d = r8     // Catch: java.lang.Exception -> L61 java.util.concurrent.CancellationException -> L66
            r0.g = r3     // Catch: java.lang.Exception -> L61 java.util.concurrent.CancellationException -> L66
            java.lang.Object r1 = r1.a(r5, r0)     // Catch: java.lang.Exception -> L61 java.util.concurrent.CancellationException -> L66
            p.d9n r5 = p.d9n.a
            if (r1 != r5) goto L5c
            return r5
        L5c:
            r1 = r8
            r5 = r9
        L5e:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L66
            return r7
        L61:
            r1 = move-exception
            r5 = r9
            r9 = r1
            r1 = r8
            goto L68
        L66:
            r7 = move-exception
            goto L80
        L68:
            int r8 = r8 + r3
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r8)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            java.lang.Object[] r8 = new java.lang.Object[]{r6, r8}
            java.lang.String r6 = "Notifications: Device service sync failed (attempt %d/%d)"
            com.spotify.base.java.logging.Logger.l(r9, r6, r8)
            int r8 = r1 + 1
            r9 = r5
            goto L3f
        L80:
            throw r7
        L81:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qmr.f(p.ocd1, p.onm):java.lang.Object");
    }

    public boolean r(View view) {
        ((err) this.b).Z.invoke(myn.a);
        return true;
    }

    public void v(Object obj) {
        byte b = this.a;
        boolean z = false;
        byte b2 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                xik xikVar = (xik) obj;
                zmr zmrVar = (zmr) obj2;
                xikVar.getClass();
                List list = xikVar.p;
                if (!list.isEmpty()) {
                    wik wikVar = xikVar.t;
                    if ((wikVar != null ? wikVar.e : 0) != 2) {
                        z = true;
                    }
                }
                e93 e93Var = zmrVar.e;
                if (z) {
                    ((ComposeView) e93Var.h).setContent(new j2i(-1697095324, new xmr(list, zmrVar, xikVar, b2), true));
                    return;
                } else {
                    ((ComposeView) e93Var.h).setVisibility(8);
                    return;
                }
            case 3:
                srr srrVar = (srr) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ViewStub viewStub = (ViewStub) srrVar.a.c;
                    viewStub.setLayoutResource(2131626127);
                    View viewInflate = viewStub.inflate();
                    qzg qzgVar = (qzg) viewInflate.getLayoutParams();
                    qzgVar.a = 1;
                    qzgVar.setMarginEnd(viewInflate.getContext().getResources().getDimensionPixelSize(2131166980));
                    viewInflate.setLayoutParams(qzgVar);
                    srrVar.g = viewInflate;
                    viewInflate.setOnClickListener(new c20(srrVar, (byte) 26));
                    View view = srrVar.g;
                    if (view == null) {
                        u890.C("shareButtonHolderView");
                        throw null;
                    }
                    ImageView imageView = (ImageView) view.findViewById(2131430938);
                    View view2 = srrVar.g;
                    if (view2 == null) {
                        u890.C("shareButtonHolderView");
                        throw null;
                    }
                    view2.findViewById(2131430939).setVisibility(0);
                    v9w0 v9w0VarO = b2u.o(imageView);
                    Collections.addAll(v9w0VarO.d, imageView);
                    v9w0VarO.a();
                    return;
                }
                return;
            case 5:
                ((ArtworkView) ((dxy) ((yir) obj2).c).c).h(new x07(new g07((String) obj), true));
                return;
            case 8:
                String str = (String) obj;
                str.getClass();
                ((TextView) ((em0) ((ngr) obj2).c).t).setText(str);
                return;
            case 9:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((TextView) ((uhs) obj2).e.b).setVisibility(bool.booleanValue() ? 0 : 8);
                return;
            case 12:
                String str2 = (String) obj;
                lvs lvsVar = (lvs) obj2;
                ((TextView) lvsVar.b.Y).setText(str2);
                TextView textView = lvsVar.c.e;
                aiq0.a(textView, new n9m(textView, textView, str2, (Object) null, o9m.a, (byte) 0));
                ContextMenuButton contextMenuButton = (ContextMenuButton) lvsVar.d.e;
                contextMenuButton.setEnabled(true);
                contextMenuButton.setContentDescription(contextMenuButton.getResources().getString(2131962418, str2));
                return;
            default:
                h8l1 h8l1Var = (h8l1) obj;
                ((VideoThumbnailView) ((s880) ((odr) obj2).c).g).a(new f3k1(h8l1Var.e, h8l1Var.h));
                return;
        }
    }

    public qmr(in4 in4Var) {
        this.a = (byte) 22;
        this.b = new idd1(new hn4(in4Var, (byte) 1));
    }

    public qmr(g0l g0lVar, t8u0 t8u0Var, ar51 ar51Var, i8h1 i8h1Var) {
        this.a = (byte) 25;
        this.b = t8u0Var;
    }

    public /* synthetic */ qmr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
