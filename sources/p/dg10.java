package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dg10 extends h471 {
    public final /* synthetic */ byte g;
    public final Object h;
    public final boolean i;
    public final r2a1 j;
    public final c9 k;
    public final d471 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg10(zg0 zg0Var, r7n0 r7n0Var, boolean z, r2a1 r2a1Var, byte b) {
        super(zg0Var, mqo1.s(new String[]{"com.facebook.katana"}), "com.facebook.stories.ADD_TO_STORY", "image/png", null, 48);
        this.g = b;
        yy61 yy61Var = yy61.GRADIENT_STORY;
        yy61 yy61Var2 = yy61.IMAGE_STORY;
        yy61 yy61Var3 = yy61.VIDEO_STORY;
        switch (b) {
            case 1:
                super(zg0Var, mqo1.s(new String[]{"com.instagram.android"}), "com.instagram.share.ADD_TO_STORY", "image/png", null, 48);
                this.h = r7n0Var;
                this.i = z;
                this.j = r2a1Var;
                this.k = mqo1.s(new yy61[]{yy61Var3, yy61Var2, yy61Var});
                w471 w471Var = w471.d;
                this.l = new d471(2131233910, false);
                break;
            default:
                this.h = r7n0Var;
                this.i = z;
                this.j = r2a1Var;
                this.k = mqo1.s(new yy61[]{yy61Var3, yy61Var2, yy61Var});
                s471 s471Var = s471.d;
                this.l = new d471(2131233909, false);
                break;
        }
    }

    public final o571 a() {
        switch (this.g) {
            case 0:
                return s471.d;
            case 1:
                return w471.d;
            default:
                return m571.d;
        }
    }

    public final c9 b() {
        switch (this.g) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.k;
    }

    public final int c() {
        switch (this.g) {
            case 0:
                return 2131962212;
            case 1:
                return 2131962220;
            default:
                return 2131962240;
        }
    }

    public final hyo1 d() {
        byte b = this.g;
        return this.l;
    }

    public final int e() {
        switch (this.g) {
            case 0:
                return 2131962211;
            case 1:
                return 2131962219;
            default:
                return 2131962239;
        }
    }

    @Override // p.h471
    public boolean f() {
        switch (this.g) {
            case 2:
                return ph5.E((Context) this.h, this.b) >= 253176000;
            default:
                return super.f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:33:0x011c  */
    /* JADX WARN: Code duplicated, block: B:42:0x014a  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x01df  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0228  */
    /* JADX WARN: Code duplicated, block: B:80:0x0247  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    @Override // p.h471
    public final Object g(Intent intent, x871 x871Var, lnm lnmVar) {
        cg10 cg10Var;
        p371 p371Var;
        int i;
        x871 x871Var2;
        Object obj;
        Intent intent2;
        jn80 jn80Var;
        p371 p371Var2;
        x871 x871Var3;
        Object obj2;
        int i2;
        Intent intent3;
        Parcelable parcelable;
        p371 p371Var3;
        Bundle bundle;
        String string;
        yml1 yml1Var;
        p371 p371Var4;
        Object objM;
        Intent intent4;
        int i3;
        Object obj3;
        Parcelable parcelable2;
        Object objK;
        Intent intent5;
        Intent intent6;
        Intent intent7 = intent;
        x871 x871Var4 = x871Var;
        byte b = this.g;
        boolean z = this.i;
        Object obj4 = this.h;
        r2a1 r2a1Var = this.j;
        Object obj5 = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof cg10) {
                    cg10Var = (cg10) lnmVar;
                    int i4 = cg10Var.h;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        cg10Var.h = i4 - Integer.MIN_VALUE;
                    } else {
                        cg10Var = new cg10(this, (onm) lnmVar);
                    }
                } else {
                    cg10Var = new cg10(this, (onm) lnmVar);
                }
                Object obj6 = cg10Var.f;
                int i5 = cg10Var.h;
                if (i5 == 0) {
                    hm5.M(obj6);
                    p371Var = x871Var4.a;
                    if (!(p371Var instanceof i9c1)) {
                        eg.m("FacebookStories requires share data to be StoryShareData");
                        return null;
                    }
                    i9c1 i9c1Var = (i9c1) p371Var;
                    bnt bntVarH = i9c1Var.h();
                    cg10Var.a = x871Var4;
                    cg10Var.b = intent7;
                    cg10Var.c = intent7;
                    cg10Var.d = i9c1Var;
                    cg10Var.e = 0;
                    cg10Var.h = 1;
                    Object objM2 = r2a1Var.m(intent7, bntVarH, cg10Var);
                    if (objM2 != obj5) {
                        i = 0;
                        x871Var2 = x871Var4;
                        obj = objM2;
                        intent2 = intent7;
                    }
                    return obj5;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Intent intent8 = cg10Var.b;
                    hm5.M(obj6);
                    return intent8;
                }
                i = cg10Var.e;
                i9c1 i9c1Var2 = cg10Var.d;
                Intent intent9 = cg10Var.c;
                intent2 = cg10Var.b;
                x871Var2 = cg10Var.a;
                hm5.M(obj6);
                p371Var = i9c1Var2;
                intent7 = intent9;
                obj = obj6;
                Parcelable parcelable3 = (Uri) obj;
                String str = x871Var2.b.c;
                p371 p371Var5 = p371Var;
                o371 o371VarC = ((i9c1) p371Var).c();
                Map mapE = p371Var5.e();
                if (parcelable3 != null) {
                    intent7.putExtra("interactive_asset_uri", parcelable3);
                }
                mmr0 mmr0Var = new mmr0("content_url", x871Var2.b.a);
                Bundle bundle2 = (Bundle) ((kf10) ((r7n0) obj4).b.getValue()).b.getValue();
                String string2 = bundle2 != null ? bundle2.getString("com.facebook.sdk.ApplicationId") : null;
                if (string2 == null) {
                    string2 = "";
                }
                dzo1.k(intent7, new mmr0[]{mmr0Var, new mmr0("com.facebook.platform.extra.APPLICATION_ID", string2)});
                t2p1.v(intent7, o371VarC.a, "entity_uri");
                t2p1.x(intent7, z, "entity_uri", str, x871Var2.c);
                t2p1.h(intent7, !o371VarC.b, mapE, o371VarC.c);
                cg10Var.a = null;
                cg10Var.b = intent2;
                cg10Var.c = null;
                cg10Var.d = null;
                cg10Var.e = i;
                cg10Var.h = 2;
                if (i(intent7, (i9c1) p371Var5, cg10Var) != obj5) {
                    return intent2;
                }
                return obj5;
            case 1:
                if (lnmVar instanceof jn80) {
                    jn80Var = (jn80) lnmVar;
                    int i6 = jn80Var.h;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        jn80Var.h = i6 - Integer.MIN_VALUE;
                    } else {
                        jn80Var = new jn80(this, (onm) lnmVar);
                    }
                } else {
                    jn80Var = new jn80(this, (onm) lnmVar);
                }
                Object obj7 = jn80Var.f;
                int i7 = jn80Var.h;
                if (i7 == 0) {
                    hm5.M(obj7);
                    p371Var2 = x871Var4.a;
                    if (!(p371Var2 instanceof i9c1)) {
                        eg.m("InstagramStories requires share data to be StoryShareData");
                        return null;
                    }
                    i9c1 i9c1Var3 = (i9c1) p371Var2;
                    bnt bntVarH2 = i9c1Var3.h();
                    jn80Var.a = x871Var4;
                    jn80Var.b = intent7;
                    jn80Var.c = intent7;
                    jn80Var.d = i9c1Var3;
                    jn80Var.e = 0;
                    jn80Var.h = 1;
                    Object objM3 = r2a1Var.m(intent7, bntVarH2, jn80Var);
                    if (objM3 != obj5) {
                        x871Var3 = x871Var4;
                        obj2 = objM3;
                        i2 = 0;
                        intent3 = intent7;
                        parcelable = (Uri) obj2;
                        String str2 = x871Var3.b.c;
                        o371 o371VarC2 = ((i9c1) p371Var2).c();
                        p371Var3 = p371Var2;
                        Map mapE2 = p371Var3.e();
                        if (parcelable != null) {
                            intent7.putExtra("interactive_asset_uri", parcelable);
                        }
                        mmr0 mmr0Var2 = new mmr0("content_url", x871Var3.b.a);
                        bundle = (Bundle) ((kf10) ((r7n0) obj4).b.getValue()).b.getValue();
                        if (bundle != null) {
                            string = bundle.getString("com.facebook.sdk.ApplicationId");
                        } else {
                            string = null;
                        }
                        dzo1.k(intent7, new mmr0[]{mmr0Var2, new mmr0("source_application", string != null ? string : "")});
                        t2p1.v(intent7, o371VarC2.a, "com.instagram.sharedSticker.entityURI");
                        t2p1.h(intent7, !o371VarC2.b, mapE2, o371VarC2.c);
                        t2p1.x(intent7, z, "com.instagram.sharedSticker.entityURI", str2, x871Var3.c);
                        jn80Var.a = null;
                        jn80Var.b = intent3;
                        jn80Var.c = null;
                        jn80Var.d = null;
                        jn80Var.e = i2;
                        jn80Var.h = 2;
                        if (j(intent7, (i9c1) p371Var3, jn80Var) != obj5) {
                            return intent3;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Intent intent10 = jn80Var.b;
                        hm5.M(obj7);
                        return intent10;
                    }
                    i2 = jn80Var.e;
                    i9c1 i9c1Var4 = jn80Var.d;
                    Intent intent11 = jn80Var.c;
                    intent3 = jn80Var.b;
                    x871Var3 = jn80Var.a;
                    hm5.M(obj7);
                    p371Var2 = i9c1Var4;
                    intent7 = intent11;
                    obj2 = obj7;
                    parcelable = (Uri) obj2;
                    String str3 = x871Var3.b.c;
                    o371 o371VarC3 = ((i9c1) p371Var2).c();
                    p371Var3 = p371Var2;
                    Map mapE3 = p371Var3.e();
                    if (parcelable != null) {
                        intent7.putExtra("interactive_asset_uri", parcelable);
                    }
                    mmr0 mmr0Var3 = new mmr0("content_url", x871Var3.b.a);
                    bundle = (Bundle) ((kf10) ((r7n0) obj4).b.getValue()).b.getValue();
                    if (bundle != null) {
                        string = bundle.getString("com.facebook.sdk.ApplicationId");
                    } else {
                        string = null;
                    }
                    dzo1.k(intent7, new mmr0[]{mmr0Var3, new mmr0("source_application", string != null ? string : "")});
                    t2p1.v(intent7, o371VarC3.a, "com.instagram.sharedSticker.entityURI");
                    t2p1.h(intent7, !o371VarC3.b, mapE3, o371VarC3.c);
                    t2p1.x(intent7, z, "com.instagram.sharedSticker.entityURI", str3, x871Var3.c);
                    jn80Var.a = null;
                    jn80Var.b = intent3;
                    jn80Var.c = null;
                    jn80Var.d = null;
                    jn80Var.e = i2;
                    jn80Var.h = 2;
                    if (j(intent7, (i9c1) p371Var3, jn80Var) != obj5) {
                        return intent3;
                    }
                }
                return obj5;
            default:
                if (lnmVar instanceof yml1) {
                    yml1Var = (yml1) lnmVar;
                    int i8 = yml1Var.h;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        yml1Var.h = i8 - Integer.MIN_VALUE;
                    } else {
                        yml1Var = new yml1(this, (onm) lnmVar);
                    }
                } else {
                    yml1Var = new yml1(this, (onm) lnmVar);
                }
                Object obj8 = yml1Var.f;
                int i9 = yml1Var.h;
                if (i9 == 0) {
                    hm5.M(obj8);
                    p371Var4 = x871Var4.a;
                    if (!(p371Var4 instanceof i9c1)) {
                        eg.m("WhatsappStatus requires share data to be StoryShareData");
                        return null;
                    }
                    i9c1 i9c1Var5 = (i9c1) p371Var4;
                    bnt bntVarH3 = i9c1Var5.h();
                    yml1Var.a = x871Var4;
                    yml1Var.b = intent7;
                    yml1Var.c = intent7;
                    yml1Var.d = i9c1Var5;
                    yml1Var.e = 0;
                    yml1Var.h = 1;
                    objM = r2a1Var.m(intent7, bntVarH3, yml1Var);
                    if (objM == obj5) {
                        obj3 = obj5;
                    } else {
                        intent4 = intent7;
                        i3 = 0;
                        parcelable2 = (Uri) objM;
                        Map mapE4 = p371Var4.e();
                        String str4 = x871Var4.b.c;
                        i9c1 i9c1Var6 = (i9c1) p371Var4;
                        o371 o371VarC4 = i9c1Var6.c();
                        intent7.setPackage((String) this.b.get(0));
                        dzo1.k(intent7, new mmr0[]{new mmr0("source_app_package_name", ((Context) obj4).getPackageName()), new mmr0("share_type", "SHARE_TO_STATUS"), new mmr0("media_attribution_url", x871Var4.b.a)});
                        t2p1.v(intent7, o371VarC4.a, "entity_uri");
                        t2p1.x(intent7, z, "entity_uri", str4, x871Var4.c);
                        t2p1.h(intent7, !o371VarC4.b, mapE4, o371VarC4.c);
                        if (parcelable2 != null) {
                            intent7.putExtra("foreground_media", parcelable2);
                        }
                        yml1Var.a = null;
                        yml1Var.b = intent4;
                        yml1Var.c = intent7;
                        yml1Var.d = null;
                        yml1Var.e = i3;
                        yml1Var.h = 2;
                        objK = k(intent7, i9c1Var6, yml1Var);
                        obj3 = obj5;
                        if (objK != obj3) {
                            intent5 = intent7;
                            intent6 = intent4;
                            intent5.setFlags(1);
                            intent5.setData(Uri.parse("https://wa.me/status"));
                            return intent6;
                        }
                    }
                    return obj3;
                }
                if (i9 == 1) {
                    int i10 = yml1Var.e;
                    i9c1 i9c1Var7 = yml1Var.d;
                    Intent intent12 = yml1Var.c;
                    intent4 = yml1Var.b;
                    x871 x871Var5 = yml1Var.a;
                    hm5.M(obj8);
                    i3 = i10;
                    intent7 = intent12;
                    objM = obj8;
                    p371Var4 = i9c1Var7;
                    x871Var4 = x871Var5;
                    parcelable2 = (Uri) objM;
                    Map mapE5 = p371Var4.e();
                    String str5 = x871Var4.b.c;
                    i9c1 i9c1Var8 = (i9c1) p371Var4;
                    o371 o371VarC5 = i9c1Var8.c();
                    intent7.setPackage((String) this.b.get(0));
                    dzo1.k(intent7, new mmr0[]{new mmr0("source_app_package_name", ((Context) obj4).getPackageName()), new mmr0("share_type", "SHARE_TO_STATUS"), new mmr0("media_attribution_url", x871Var4.b.a)});
                    t2p1.v(intent7, o371VarC5.a, "entity_uri");
                    t2p1.x(intent7, z, "entity_uri", str5, x871Var4.c);
                    t2p1.h(intent7, !o371VarC5.b, mapE5, o371VarC5.c);
                    if (parcelable2 != null) {
                        intent7.putExtra("foreground_media", parcelable2);
                    }
                    yml1Var.a = null;
                    yml1Var.b = intent4;
                    yml1Var.c = intent7;
                    yml1Var.d = null;
                    yml1Var.e = i3;
                    yml1Var.h = 2;
                    objK = k(intent7, i9c1Var8, yml1Var);
                    obj3 = obj5;
                    if (objK != obj3) {
                        intent5 = intent7;
                        intent6 = intent4;
                    }
                    return obj3;
                }
                if (i9 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                intent5 = yml1Var.c;
                Intent intent13 = yml1Var.b;
                hm5.M(obj8);
                intent6 = intent13;
                intent5.setFlags(1);
                intent5.setData(Uri.parse("https://wa.me/status"));
                return intent6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(Intent intent, i9c1 i9c1Var, onm onmVar) {
        bg10 bg10Var;
        t0c t0cVar;
        if (onmVar instanceof bg10) {
            bg10Var = (bg10) onmVar;
            int i = bg10Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bg10Var.e = i - Integer.MIN_VALUE;
            } else {
                bg10Var = new bg10(this, onmVar);
            }
        } else {
            bg10Var = new bg10(this, onmVar);
        }
        Object obj = bg10Var.c;
        int i2 = bg10Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            t0c t0cVarG = i9c1Var.g();
            if (t0cVarG instanceof ant) {
                ant antVar = (ant) t0cVarG;
                dzo1.k(intent, new mmr0[]{new mmr0("top_background_color", bmq0.k(antVar.e)), new mmr0("bottom_background_color", bmq0.k(antVar.f))});
            } else {
                t0c t0cVarG2 = i9c1Var.g();
                bg10Var.a = intent;
                bg10Var.b = t0cVarG;
                bg10Var.e = 1;
                Object objH = this.j.h(intent, t0cVarG2, bg10Var);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
                obj = objH;
                t0cVar = t0cVarG;
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        t0cVar = bg10Var.b;
        intent = bg10Var.a;
        hm5.M(obj);
        t2p1.w(intent, (Uri) obj, t0cVar);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(Intent intent, i9c1 i9c1Var, onm onmVar) {
        in80 in80Var;
        t0c t0cVar;
        if (onmVar instanceof in80) {
            in80Var = (in80) onmVar;
            int i = in80Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                in80Var.e = i - Integer.MIN_VALUE;
            } else {
                in80Var = new in80(this, onmVar);
            }
        } else {
            in80Var = new in80(this, onmVar);
        }
        Object obj = in80Var.c;
        int i2 = in80Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            t0c t0cVarG = i9c1Var.g();
            if (t0cVarG instanceof ant) {
                ant antVar = (ant) t0cVarG;
                dzo1.k(intent, new mmr0[]{new mmr0("top_background_color", bmq0.k(antVar.e)), new mmr0("bottom_background_color", bmq0.k(antVar.f))});
            } else {
                t0c t0cVarG2 = i9c1Var.g();
                in80Var.a = intent;
                in80Var.b = t0cVarG;
                in80Var.e = 1;
                Object objH = this.j.h(intent, t0cVarG2, in80Var);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
                obj = objH;
                t0cVar = t0cVarG;
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        t0cVar = in80Var.b;
        intent = in80Var.a;
        hm5.M(obj);
        t2p1.w(intent, (Uri) obj, t0cVar);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(Intent intent, i9c1 i9c1Var, onm onmVar) {
        xml1 xml1Var;
        if (onmVar instanceof xml1) {
            xml1Var = (xml1) onmVar;
            int i = xml1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xml1Var.d = i - Integer.MIN_VALUE;
            } else {
                xml1Var = new xml1(this, onmVar);
            }
        } else {
            xml1Var = new xml1(this, onmVar);
        }
        Object objH = xml1Var.b;
        int i2 = xml1Var.d;
        if (i2 == 0) {
            hm5.M(objH);
            t0c t0cVarG = i9c1Var.g();
            if (t0cVarG instanceof ant) {
                ant antVar = (ant) t0cVarG;
                dzo1.k(intent, new mmr0[]{new mmr0("color_gradient_top", bmq0.k(antVar.e)), new mmr0("color_gradient_bottom", bmq0.k(antVar.f))});
            } else {
                t0c t0cVarG2 = i9c1Var.g();
                xml1Var.a = intent;
                xml1Var.d = 1;
                objH = this.j.h(intent, t0cVarG2, xml1Var);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        intent = xml1Var.a;
        hm5.M(objH);
        intent.putExtra("android.intent.extra.STREAM", (Uri) objH).getClass();
        return rih1.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg10(zg0 zg0Var, Context context, r2a1 r2a1Var, boolean z, boolean z2) {
        super(zg0Var, mqo1.s(new String[]{"com.whatsapp"}), "android.intent.action.VIEW", null, "https://wa.me/status", 40);
        this.g = (byte) 2;
        this.h = context;
        this.j = r2a1Var;
        this.i = z2;
        smc0 smc0VarN = k4p1.n();
        if (z) {
            smc0VarN.add(yy61.VIDEO_STORY);
        }
        smc0VarN.add(yy61.IMAGE_STORY);
        smc0VarN.add(yy61.GRADIENT_STORY);
        this.k = mqo1.F(k4p1.k(smc0VarN));
        m571 m571Var = m571.d;
        this.l = new d471(2131233919, false);
    }
}
