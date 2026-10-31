package p;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.compose.ui.geometry.Offset;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.processors.ReplayProcessor;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class k7b1 extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7b1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke(Object obj) {
        Integer numA;
        woa0 woa0VarT;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((jzq) ((lyc) this).receiver).getClass();
                return jzq.a((String) obj);
            case 1:
                ((idi1) ((lyc) this).receiver).getClass();
                return new jdi1((String) null, (String) null, false, (String) obj, 3);
            case 2:
                ((jzq) ((lyc) this).receiver).getClass();
                return jzq.a((String) obj);
            case 3:
                ((jzq) ((lyc) this).receiver).getClass();
                return jzq.a((String) obj);
            case 4:
                ((jzq) ((lyc) this).receiver).getClass();
                return jzq.a((String) obj);
            case 5:
                int iIntValue = ((Number) obj).intValue();
                w4c1 w4c1Var = (w4c1) ((lyc) this).receiver;
                if (iIntValue < 0) {
                    w4c1Var.getClass();
                } else if (iIntValue < w4c1Var.c.size()) {
                    return (n9c1) w4c1Var.c.get(iIntValue);
                }
                return m9c1.a;
            case 6:
                ((scc1) ((lyc) this).receiver).b.c.U((kcc1) obj);
                return rih1Var;
            case 7:
                t480 t480Var = (t480) obj;
                ryc1 ryc1Var = (ryc1) ((lyc) this).receiver;
                if (t480Var != null) {
                    ryc1Var.b.o(t480Var, ryc1.d);
                } else {
                    ryc1Var.getClass();
                }
                return rih1Var;
            case 8:
                return ((ux8) ((lyc) this).receiver).a((lnm) obj);
            case 9:
                ((ReplayProcessor) ((lyc) this).receiver).onNext((kdn) obj);
                return rih1Var;
            case 10:
                ((ysd1) ((lyc) this).receiver).getClass();
                return ysd1.g((psd1) obj);
            case 11:
                rsd1 rsd1Var = (tsd1) obj;
                ysd1 ysd1Var = (ysd1) ((lyc) this).receiver;
                o3r o3rVar = ysd1.Z;
                ysd1Var.getClass();
                if (rsd1Var instanceof rsd1) {
                    rsd1 rsd1Var2 = rsd1Var;
                    return mno1.h(new mmr0[]{new mmr0("saved_state_type", "percentage_only"), new mmr0("is_sent_by_current_user", Boolean.valueOf(rsd1Var2.a)), new mmr0("percentage", Integer.valueOf(rsd1Var2.b))});
                }
                if (rsd1Var instanceof ssd1) {
                    ssd1 ssd1Var = (ssd1) rsd1Var;
                    return mno1.h(new mmr0[]{new mmr0("saved_state_type", "revealed"), new mmr0("is_sent_by_current_user", Boolean.valueOf(ssd1Var.a)), new mmr0("percentage", Integer.valueOf(ssd1Var.b)), new mmr0("entity_uri", ssd1Var.c), new mmr0("entity_name", ssd1Var.d), new mmr0("entity_type", ssd1Var.e.name()), new mmr0("creator_name", ssd1Var.f), new mmr0("cover_art_url", ssd1Var.g)});
                }
                if (rsd1Var instanceof qsd1) {
                    return new Bundle();
                }
                eg.o();
                return null;
            case 12:
                return ((ivd1) ((lyc) this).receiver).a((lnm) obj);
            case 13:
                long j = ((Offset) obj).a;
                k3e1 k3e1Var = (k3e1) ((lyc) this).receiver;
                k3e1Var.getClass();
                o3e1 o3e1Var = (o3e1) lcc.z(k3e1Var, p3e1.a);
                if (o3e1Var != null) {
                    fn31.T(k3e1Var.v1(), (o8n) null, 0, new d6(k3e1Var, j, o3e1Var, new j3e1(k3e1Var, j), (lnm) null), 3);
                }
                return rih1Var;
            case 14:
                ((d3e1) ((lyc) this).receiver).b.b((iu30) obj);
                return rih1Var;
            case 15:
                KeyEvent keyEvent = ((cpa0) obj).a;
                q5e1 q5e1Var = (q5e1) ((lyc) this).receiver;
                jbe1 jbe1Var = q5e1Var.f;
                boolean z2 = q5e1Var.d;
                qqh qqhVar = (n3p1.n(keyEvent) && (numA = q5e1Var.i.a(keyEvent)) != null) ? new qqh(new StringBuilder().appendCodePoint(numA.intValue()).toString(), 1) : null;
                if (qqhVar != null) {
                    if (z2) {
                        q5e1Var.a(Collections.singletonList(qqhVar));
                        jbe1Var.a = null;
                        z = true;
                    }
                } else if (ern1.t(keyEvent) == 2 && (woa0VarT = fdg1.a.t(keyEvent)) != null && (!woa0VarT.a || z2)) {
                    l811 l811Var = new l811();
                    l811Var.a = true;
                    d5e1 d5e1Var = new d5e1(woa0VarT, q5e1Var, l811Var, (byte) 1);
                    c8e1 c8e1Var = q5e1Var.c;
                    n6e1 n6e1Var = new n6e1(c8e1Var, q5e1Var.g, q5e1Var.a.d(), jbe1Var);
                    d5e1Var.invoke(n6e1Var);
                    boolean zC = nbe1.c(n6e1Var.f, c8e1Var.b);
                    af5 af5Var = n6e1Var.g;
                    if (!zC || !u890.j(af5Var, c8e1Var.a)) {
                        q5e1Var.j.invoke(c8e1.a(c8e1Var, af5Var, n6e1Var.f, 4));
                    }
                    q5e1Var.h.e = true;
                    z = l811Var.a;
                }
                return Boolean.valueOf(z);
            case 16:
                return Integer.valueOf(((y9e1) ((lyc) this).receiver).b.d(((Number) obj).intValue()));
            case 17:
                int iIntValue2 = ((Number) obj).intValue();
                y9e1 y9e1Var = (y9e1) ((lyc) this).receiver;
                return y9e1Var.a.a.f(y9e1Var.i(iIntValue2), y9e1Var.b.c(iIntValue2, false)).b;
            case 18:
                return Float.valueOf(((y9e1) ((lyc) this).receiver).b.f(((Number) obj).intValue()));
            case 19:
                return Float.valueOf(((y9e1) ((lyc) this).receiver).b.b(((Number) obj).intValue()));
            case 20:
                zke1 zke1Var = (zke1) ((lyc) this).receiver;
                yg7 yg7Var = zke1Var.f;
                String str = ((wke1) obj).a;
                return o4p1.r(new lt20(new a1b1(new lt20(rqt0.u(new sii0(new k6e0(new xs4(yoi1.g(yg7Var.a.b(new oi("time_cap_music_video_upsell_page", false, new fki0(str, (byte) 17)))), str, (byte) 11), (byte) 8), yg7Var, (byte) 7)), new i440(3, (lnm) null, (byte) 15), (byte) 0), zke1Var, (byte) 12), new q8t0(3, (lnm) null, (byte) 17), (byte) 0), zke1Var.d);
            case 21:
                return Boolean.valueOf(mue1.L((nue1) ((lyc) this).receiver, (uvg1) obj));
            case 22:
                return Boolean.valueOf(mue1.L((nue1) ((lyc) this).receiver, (uvg1) obj));
            case 23:
                ((pue1) ((lyc) this).receiver).getClass();
                return pue1.c;
            case 24:
                ((kia) ((lyc) this).receiver).a(((Number) obj).intValue());
                return rih1Var;
            case 25:
                ((ard1) ((lyc) this).receiver).d((t480) obj);
                return rih1Var;
            case 26:
                ((kia) ((lyc) this).receiver).a(((Number) obj).intValue());
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((ard1) ((lyc) this).receiver).d((t480) obj);
                return rih1Var;
            case 28:
                ((kia) ((lyc) this).receiver).a(((Number) obj).intValue());
                return rih1Var;
            default:
                ((ard1) ((lyc) this).receiver).d((t480) obj);
                return rih1Var;
        }
    }
}
