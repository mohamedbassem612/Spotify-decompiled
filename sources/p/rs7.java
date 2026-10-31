package p;

import android.bluetooth.BluetoothGattCharacteristic;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.view.View;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.destination.BrowsePageInfo;
import com.spotify.destination.ChipReference;
import com.spotify.destination.DestinationPageHeader;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rs7 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs7(Object obj, byte b) {
        super(1);
        this.a = b;
    }

    public final Object invoke(Object obj) throws Exception {
        q8c q8cVarN;
        byte b = this.a;
        ng9 ng9Var = ng9.a;
        lg9 lg9Var = lg9.a;
        q8c q8cVar = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return mno1.h(new mmr0[]{new mmr0("audio.content.format.share.card.key", (Parcelable) obj)});
            case 1:
                return (Parcelable) jhc1.t((Bundle) obj, "audio.content.format.share.card.key", lt7.class);
            case 2:
                return vg9.k(((ai9) obj).b(), ng9Var);
            case 3:
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) obj;
                return vg9.k((bluetoothGattCharacteristic.getProperties() & 2) != 0 ? bluetoothGattCharacteristic : null, lg9Var);
            case 4:
                return vg9.k(((ai9) obj).b(), ng9Var);
            case 5:
                BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) obj;
                return vg9.k((bluetoothGattCharacteristic2.getProperties() & 8) != 0 ? bluetoothGattCharacteristic2 : null, lg9Var);
            case 6:
                return mno1.h(new mmr0[]{new mmr0("background.with.sticker.state.key", (Parcelable) obj)});
            case 7:
                return (Parcelable) jhc1.t((Bundle) obj, "background.with.sticker.state.key", b0a.class);
            case 8:
                return new wcm(((uv11) obj).a, (String) null, (String) null, (ucm) null, (Function0) null, new wam1(0, (byte) 28), false, (String) null, (String) null, 990);
            case 9:
                return mno1.h(new mmr0[]{new mmr0("share.betterscreenshot.card.bundle.key", (Parcelable) obj)});
            case 10:
                return (Parcelable) jhc1.t((Bundle) obj, "share.betterscreenshot.card.bundle.key", nqa.class);
            case 11:
                return Single.just(((jy21) obj) instanceof ey21 ? new ajo(1) : new ajo(3));
            case 12:
                String strF = lfb.f(((cxc0) obj).f.q);
                return new s0b(new xcg(strF != null ? strF : "", true));
            case 13:
                eqc eqcVar = (eqc) obj;
                float fMin = Math.min(eqcVar.h() * 50.0f, Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) / 2.0f);
                return eqcVar.b(new ivb(v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.j)), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b))}, Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) - fMin, Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)), 8), fMin, (byte) 0));
            case 14:
                return Single.just(((jy21) obj) instanceof ey21 ? new ajo(1) : new ajo(3));
            case 15:
                return ((jy21) obj) instanceof ey21 ? new ajo(1) : new ajo(3);
            case 16:
                wsc0 wsc0Var = (wsc0) obj;
                kby kbyVar = wsc0Var.f;
                Map map = kbyVar.q;
                String str = kbyVar.b;
                String str2 = kbyVar.c;
                String str3 = str2 == null ? "" : str2;
                String str4 = (String) map.get("page_header");
                DestinationPageHeader destinationPageHeaderR = DestinationPageHeader.r(Base64.decode(str4 != null ? str4 : "", 0));
                q8c q8cVarQ = destinationPageHeaderR.q();
                q8c q8cVar2 = q8c.PAGE_TYPE_DEFAULT;
                q8c q8cVar3 = q8c.UNRECOGNIZED;
                q8c q8cVar4 = q8cVarQ == q8cVar3 ? q8cVar2 : q8cVarQ;
                String strP = destinationPageHeaderR.p();
                String strN = destinationPageHeaderR.n();
                h290<ChipReference> h290VarO = destinationPageHeaderR.o();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                for (ChipReference chipReference : h290VarO) {
                    arrayList.add(new z3g(chipReference.getUri(), chipReference.n()));
                }
                xu50 xu50Var = new xu50(str, str3, strP, strN, arrayList, q8cVar4);
                List list = wsc0Var.e;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str5 = ((zuc0) it.next()).c;
                    arrayList2.add(new hpv0(str5, str5));
                }
                if (map.containsKey("browse_page_kind")) {
                    BrowsePageInfo browsePageInfo = (BrowsePageInfo) l6o1.B(map, "browse_page_kind", hi51.a);
                    q8cVar = (browsePageInfo == null || (q8cVarN = browsePageInfo.n()) == q8cVar3) ? q8cVar2 : q8cVarN;
                }
                q8c q8cVar5 = xu50Var.f;
                if (q8cVar5 != q8cVar2) {
                    q8cVar2 = q8cVar5;
                } else if (q8cVar != null) {
                    q8cVar2 = q8cVar;
                }
                String string = (String) map.get("response_id");
                if (string == null) {
                    string = UUID.randomUUID().toString();
                }
                return new oy21(new zol(xu50Var, arrayList2, string, q8cVar2));
            case 17:
                j3f1 j3f1Var = (j3f1) obj;
                return new rg20(j3f1Var.a, j3f1Var.b, j3f1Var.c, j3f1Var.d);
            case 18:
                int iOrdinal = ((qg20) obj).ordinal();
                if (iOrdinal == 0) {
                    return fwz.a;
                }
                if (iOrdinal == 1) {
                    return awz.a;
                }
                if (iOrdinal == 2) {
                    return p300.a;
                }
                eg.o();
                return null;
            case 19:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 20:
                d441 d441VarG1 = ((y341) obj).g1("DELETE FROM message_id_and_capping");
                try {
                    d441VarG1.f1();
                    return rih1Var;
                } finally {
                    d441VarG1.close();
                }
            case 21:
                return ohe.a;
            case 22:
                return phf.f((ahf) obj);
            case 23:
                return new qzf(false, false, false);
            case 24:
                kd31 kd31Var = (kd31) obj;
                kd31Var.q(1.25f);
                kd31Var.r(1.25f);
                return rih1Var;
            case 25:
                return mno1.h(new mmr0[]{new mmr0("share.collection.card.bundle.key", (Parcelable) obj)});
            case 26:
                return (Parcelable) jhc1.t((Bundle) obj, "share.collection.card.bundle.key", s6h.class);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                DrawScope drawScope = (DrawScope) obj;
                float fX0 = drawScope.X0(24.0f);
                long jB = u7h.b(u7h.f, 0.4f, 0.0f, 0.0f, 0.0f, 14);
                z1a1 z1a1VarA = er31.b(8.0f).a((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)))) << 32), drawScope.getLayoutDirection(), drawScope);
                lw4 lw4VarL = fdg1.l();
                lw4VarL.c(jB);
                Paint paint = lw4VarL.a;
                paint.setColor(z4p1.G(jB));
                paint.setMaskFilter(new BlurMaskFilter(fX0, BlurMaskFilter.Blur.NORMAL));
                fid fidVarP = drawScope.a1().p();
                fidVarP.q();
                vpb1.t(fidVarP, z1a1VarA, lw4VarL);
                fidVarP.i();
                return rih1Var;
            case 28:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            default:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs7(int i, byte b) {
        super(i);
        this.a = b;
    }
}
