package com.spotify.share.audioparamstestpage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.b3l1;
import p.b7x;
import p.d9n;
import p.dqz0;
import p.eg;
import p.hhg1;
import p.hm5;
import p.ihc1;
import p.iy7;
import p.jy7;
import p.ky7;
import p.l15;
import p.mqo1;
import p.myo1;
import p.o571;
import p.onm;
import p.ou80;
import p.q7h;
import p.rih1;
import p.sx7;
import p.tr80;
import p.tv80;
import p.ux7;
import p.vm71;
import p.vx7;
import p.wa71;
import p.wx7;
import p.xh71;
import p.xx7;
import p.y6r0;
import p.yoi1;
import p.zxa;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a {
    public final xh71 a;
    public final zxa b;
    public final l15 c;

    public a(xh71 xh71Var, zxa zxaVar, l15 l15Var) {
        this.a = xh71Var;
        this.b = zxaVar;
        this.c = l15Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075 A[Catch: all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0027, blocks: (B:12:0x0023, B:25:0x0075, B:28:0x007b, B:29:0x0082), top: B:36:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007b A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #1 {all -> 0x0027, blocks: (B:12:0x0023, B:25:0x0075, B:28:0x007b, B:29:0x0082), top: B:36:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable a(onm onmVar) throws Throwable {
        jy7 jy7Var;
        Bitmap bitmap;
        if (onmVar instanceof jy7) {
            jy7Var = (jy7) onmVar;
            int i = jy7Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jy7Var.d = i - Integer.MIN_VALUE;
            } else {
                jy7Var = new jy7(this, onmVar);
            }
        } else {
            jy7Var = new jy7(this, onmVar);
        }
        Object objC = jy7Var.b;
        int i2 = jy7Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bitmap = jy7Var.a;
            try {
                hm5.M(objC);
                if (objC != null) {
                    throw new IllegalArgumentException("Unable to store test-share background");
                }
                Uri uri = (Uri) objC;
                bitmap.recycle();
                return uri;
            } catch (Throwable th) {
                th = th;
                bitmap.recycle();
                throw th;
            }
        }
        hm5.M(objC);
        int iHSVToColor = Color.HSVToColor(new float[]{yoi1.H(new tr80(0, 359, 1), dqz0.a), 0.7f, 0.85f});
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1080, 1920, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(iHSVToColor);
        try {
            zxa zxaVar = this.b;
            jy7Var.a = bitmapCreateBitmap;
            jy7Var.d = 1;
            objC = zxaVar.c(bitmapCreateBitmap, Bitmap.CompressFormat.PNG, 100, jy7Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
            bitmap = bitmapCreateBitmap;
            if (objC != null) {
                throw new IllegalArgumentException("Unable to store test-share background");
            }
            Uri uri2 = (Uri) objC;
            bitmap.recycle();
            return uri2;
        } catch (Throwable th2) {
            th = th2;
            bitmap = bitmapCreateBitmap;
            bitmap.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(iy7 iy7Var, onm onmVar) throws Throwable {
        ky7 ky7Var;
        xx7 xx7Var;
        wa71 wa71Var;
        Map mapSingletonMap;
        xx7 wx7Var;
        iy7 iy7Var2 = iy7Var;
        if (onmVar instanceof ky7) {
            ky7Var = (ky7) onmVar;
            int i = ky7Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ky7Var.f = i - Integer.MIN_VALUE;
            } else {
                ky7Var = new ky7(this, onmVar);
            }
        } else {
            ky7Var = new ky7(this, onmVar);
        }
        Object objA = ky7Var.d;
        int i2 = ky7Var.f;
        if (i2 == 0) {
            hm5.M(objA);
            String string = ihc1.e1(iy7Var2.a).toString();
            if (string.length() <= 0) {
                hhg1.n("Entity URI cannot be empty");
                return null;
            }
            String string2 = ihc1.e1(this.c.a().a).toString();
            int length = string2.length();
            vx7 vx7Var = vx7.a;
            if (length == 0 || string2.equals("disabled")) {
                xx7Var = vx7Var;
            } else {
                if (string2.equals("all")) {
                    wx7Var = ux7.a;
                } else {
                    List listQ0 = ihc1.Q0(string2, new String[]{"-"}, 0, 6);
                    ArrayList arrayList = new ArrayList(q7h.U(listQ0, 10));
                    Iterator it = listQ0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ihc1.e1((String) it.next()).toString());
                    }
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((String) it2.next()).replace('_', '-'));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        o571 o571VarO = myo1.o((String) it3.next());
                        if (o571VarO != null) {
                            arrayList3.add(o571VarO);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        xx7Var = vx7Var;
                    } else {
                        wx7Var = new wx7(arrayList3);
                    }
                }
                xx7Var = wx7Var;
            }
            if (xx7Var.equals(vx7Var)) {
                throw AudioParamsTestSharePresenterException.ShareMenuDisabled.a;
            }
            int iOrdinal = iy7Var2.c.ordinal();
            if (iOrdinal == 0) {
                mapSingletonMap = b7x.a;
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                mapSingletonMap = Collections.singletonMap("feature", "partnerTestAccess");
            }
            wa71Var = new wa71(string, null, mqo1.G(mapSingletonMap), null, null, null, null, 122);
            ky7Var.a = iy7Var2;
            ky7Var.b = xx7Var;
            ky7Var.c = wa71Var;
            ky7Var.f = 1;
            objA = a(ky7Var);
            Object obj = d9n.a;
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wa71 wa71Var2 = ky7Var.c;
            xx7Var = ky7Var.b;
            iy7 iy7Var3 = ky7Var.a;
            hm5.M(objA);
            wa71Var = wa71Var2;
            iy7Var2 = iy7Var3;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("vtec.share.share_menu_data", wa71Var);
        bundle.putString("vtec.share.image_url", ((Uri) objA).toString());
        String str = iy7Var2.b;
        if (str != null) {
            bundle.putString("vtec.share.audio_preview_entity_uri", str);
        }
        if (iy7Var2.c == sx7.YES) {
            bundle.putBoolean("vtec.share.allow_audio_attachment", true);
        }
        if (xx7Var instanceof wx7) {
            ArrayList arrayList4 = ((wx7) xx7Var).a;
            ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                arrayList5.add(((o571) it4.next()).a);
            }
            bundle.putStringArrayList("vtec.share.destinations", new ArrayList<>(arrayList5));
        }
        bundle.putBoolean("vtec.share.enable_legacy_sharing", true);
        vm71 vm71Var = new vm71("share-audio-params-test");
        ou80.Companion.getClass();
        this.a.a((wa71) null, bundle, vm71Var, new tv80(new ou80(""), (y6r0) null), Collections.singletonList(b3l1.a));
        return rih1.a;
    }
}
