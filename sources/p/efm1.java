package p;

import android.graphics.Color;
import com.spotify.wrapped.v1.proto.ConsumerShareMessaging;
import com.spotify.wrapped.v1.proto.RiveAnimationInput;
import com.spotify.wrapped.v1.proto.RiveFont;
import com.spotify.wrapped.v1.proto.ShareAssetResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class efm1 {
    public static final /* synthetic */ efm1 a = new efm1();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(h290 h290Var, cxc cxcVar, q8n q8nVar, onm onmVar) {
        cfm1 cfm1Var;
        h290<RiveAnimationInput> h290Var2;
        Object sj31Var;
        if (onmVar instanceof cfm1) {
            cfm1Var = (cfm1) onmVar;
            int i = cfm1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cfm1Var.d = i - Integer.MIN_VALUE;
            } else {
                cfm1Var = new cfm1(this, onmVar);
            }
        } else {
            cfm1Var = new cfm1(this, onmVar);
        }
        Object objS = cfm1Var.b;
        int i2 = cfm1Var.d;
        if (i2 == 0) {
            hm5.M(objS);
            cfm1Var.a = h290Var;
            cfm1Var.d = 1;
            objS = smo1.s(new nsf1(h290Var, q8nVar, cxcVar, (lnm) null, (byte) 24), cfm1Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
            h290Var2 = h290Var;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h290Var2 = cfm1Var.a;
            hm5.M(objS);
        }
        Map map = (Map) objS;
        ArrayList arrayList = new ArrayList();
        for (RiveAnimationInput riveAnimationInput : h290Var2) {
            String path = riveAnimationInput.getPath();
            int iQ = riveAnimationInput.n().q();
            switch (iQ == 0 ? -1 : bfm1.b[l1d.C(iQ)]) {
                case -1:
                case 8:
                    sj31Var = null;
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 0:
                default:
                    eg.o();
                    return null;
                case 1:
                    path.getClass();
                    sj31Var = new sj31(path, riveAnimationInput.n().getStringValue());
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 2:
                    path.getClass();
                    sj31Var = new nj31(path, riveAnimationInput.n().getBoolValue());
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 3:
                    path.getClass();
                    sj31Var = new rj31(path, riveAnimationInput.n().r());
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 4:
                    path.getClass();
                    sj31Var = new tj31(path);
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 5:
                    path.getClass();
                    sj31Var = new oj31(path, Color.parseColor(riveAnimationInput.n().n()));
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 6:
                    path.getClass();
                    sj31Var = new pj31(path, riveAnimationInput.n().p());
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 7:
                    byte[] bArr = (byte[]) map.get(path);
                    if (bArr != null) {
                        path.getClass();
                        sj31Var = new qj31(path, bArr);
                    } else {
                        sj31Var = null;
                    }
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:53:0x0131  */
    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:56:0x013e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX WARN: Code duplicated, block: B:60:0x014e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:72:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ShareAssetResponse shareAssetResponse, cxc cxcVar, q8n q8nVar, onm onmVar) {
        dfm1 dfm1Var;
        hfm1 gfm1Var;
        String str;
        Collection<ShareAssetResponse.AudioAttachment.DestinationAudioConfig> collectionO;
        ArrayList arrayList;
        o571 o571VarR;
        ffm1 ffm1Var;
        String entityUri;
        Boolean boolValueOf;
        if (onmVar instanceof dfm1) {
            dfm1Var = (dfm1) onmVar;
            int i = dfm1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dfm1Var.e = i - Integer.MIN_VALUE;
            } else {
                dfm1Var = new dfm1(this, onmVar);
            }
        } else {
            dfm1Var = new dfm1(this, onmVar);
        }
        Object obj = dfm1Var.c;
        int i2 = dfm1Var.e;
        boolean z = true;
        ArrayList arrayList2 = null;
        if (i2 == 0) {
            hm5.M(obj);
            int iN = shareAssetResponse.o().n();
            int i3 = iN == 0 ? -1 : bfm1.a[l1d.C(iN)];
            if (i3 != -1) {
                if (i3 == 1) {
                    gfm1Var = new gfm1(shareAssetResponse.o().getImageUrl());
                } else if (i3 == 2) {
                    String url = shareAssetResponse.o().p().getUrl();
                    h290 h290VarQ = shareAssetResponse.o().p().q();
                    dfm1Var.a = shareAssetResponse;
                    dfm1Var.b = url;
                    dfm1Var.e = 1;
                    Serializable serializableA = a(h290VarQ, cxcVar, q8nVar, dfm1Var);
                    Serializable serializable = d9n.a;
                    if (serializableA == serializable) {
                        return serializable;
                    }
                    obj = serializableA;
                    str = url;
                } else if (i3 != 3) {
                    eg.o();
                    return null;
                }
                hfm1 hfm1Var = gfm1Var;
                String strR = shareAssetResponse.r();
                ConsumerShareMessaging consumerShareMessagingQ = shareAssetResponse.q();
                mfm1 mfm1Var = new mfm1(consumerShareMessagingQ.o(), consumerShareMessagingQ.q(), consumerShareMessagingQ.p());
                String strN = shareAssetResponse.n();
                String entityUri2 = shareAssetResponse.p().getEntityUri();
                if (shareAssetResponse.s() && !shareAssetResponse.p().p()) {
                    z = false;
                }
                collectionO = shareAssetResponse.p().o();
                collectionO.getClass();
                if (collectionO.isEmpty()) {
                    collectionO = null;
                }
                if (collectionO != null) {
                    arrayList = new ArrayList();
                    for (ShareAssetResponse.AudioAttachment.DestinationAudioConfig destinationAudioConfig : collectionO) {
                        o571VarR = gyo1.R(destinationAudioConfig.n());
                        if (o571VarR != null) {
                            if (destinationAudioConfig.q()) {
                                entityUri = destinationAudioConfig.getEntityUri();
                            } else {
                                entityUri = null;
                            }
                            if (destinationAudioConfig.p()) {
                                boolValueOf = Boolean.valueOf(destinationAudioConfig.o());
                            } else {
                                boolValueOf = null;
                            }
                            ffm1Var = new ffm1(o571VarR, entityUri, boolValueOf, destinationAudioConfig.getEnabled());
                        } else {
                            ffm1Var = null;
                        }
                        if (ffm1Var != null) {
                            arrayList.add(ffm1Var);
                        }
                    }
                    arrayList2 = arrayList;
                }
                return new nfm1(strR, mfm1Var, strN, new jfm1(entityUri2, arrayList2, z), hfm1Var);
            }
            bhn0.B(shareAssetResponse.r(), "asset is empty for ");
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = dfm1Var.b;
        shareAssetResponse = dfm1Var.a;
        hm5.M(obj);
        List list = (List) obj;
        h290 h290VarP = shareAssetResponse.o().p().p();
        ArrayList arrayList3 = new ArrayList(q7h.U(h290VarP, 10));
        Iterator it = h290VarP.iterator();
        while (it.hasNext()) {
            arrayList3.add(((RiveFont) it.next()).getName());
        }
        gfm1Var = new hfm1(str, arrayList3, list);
        hfm1 hfm1Var2 = gfm1Var;
        String strR2 = shareAssetResponse.r();
        ConsumerShareMessaging consumerShareMessagingQ2 = shareAssetResponse.q();
        mfm1 mfm1Var2 = new mfm1(consumerShareMessagingQ2.o(), consumerShareMessagingQ2.q(), consumerShareMessagingQ2.p());
        String strN2 = shareAssetResponse.n();
        String entityUri3 = shareAssetResponse.p().getEntityUri();
        if (shareAssetResponse.s()) {
            z = false;
        }
        collectionO = shareAssetResponse.p().o();
        collectionO.getClass();
        if (collectionO.isEmpty()) {
            collectionO = null;
        }
        if (collectionO != null) {
            arrayList = new ArrayList();
            while (r12.hasNext()) {
                o571VarR = gyo1.R(destinationAudioConfig.n());
                if (o571VarR != null) {
                    if (destinationAudioConfig.q()) {
                        entityUri = destinationAudioConfig.getEntityUri();
                    } else {
                        entityUri = null;
                    }
                    if (destinationAudioConfig.p()) {
                        boolValueOf = Boolean.valueOf(destinationAudioConfig.o());
                    } else {
                        boolValueOf = null;
                    }
                    ffm1Var = new ffm1(o571VarR, entityUri, boolValueOf, destinationAudioConfig.getEnabled());
                } else {
                    ffm1Var = null;
                }
                if (ffm1Var != null) {
                    arrayList.add(ffm1Var);
                }
            }
            arrayList2 = arrayList;
        }
        return new nfm1(strR2, mfm1Var2, strN2, new jfm1(entityUri3, arrayList2, z), hfm1Var2);
    }
}
