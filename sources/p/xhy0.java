package p;

import com.spotify.gander.v2.proto.Notification;
import com.spotify.gander.v2.proto.UserImage;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xhy0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Notification b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xhy0(Notification notification, byte b) {
        super(1);
        this.a = b;
        this.b = notification;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Notification notification = this.b;
        switch (b) {
            case 0:
                vga0 vga0Var = (vga0) obj;
                j9k1.A(vga0Var, "uri", notification.n().getUri());
                j9k1.A(vga0Var, "type", notification.n().o().name());
                break;
            case 1:
                qfa0 qfa0Var = (qfa0) obj;
                Iterator it = notification.s().p().iterator();
                while (it.hasNext()) {
                    hox0 hox0Var = new hox0((UserImage) it.next(), (byte) 20);
                    vga0 vga0Var2 = new vga0();
                    hox0Var.invoke(vga0Var2);
                    qfa0Var.a.add(vga0Var2.a());
                }
                break;
            case 2:
                xhy0 xhy0Var = new xhy0(notification, (byte) 1);
                qfa0 qfa0Var2 = new qfa0();
                xhy0Var.invoke(qfa0Var2);
                ((vga0) obj).b("user_images", new pfa0(qfa0Var2.a));
                break;
            case 3:
                vga0 vga0Var3 = (vga0) obj;
                j9k1.A(vga0Var3, "image_url", notification.p().getImageUrl());
                j9k1.A(vga0Var3, "entity_url", notification.p().o());
                break;
            case 4:
                vga0 vga0Var4 = (vga0) obj;
                j9k1.A(vga0Var4, "image_url", notification.u().p().getImageUrl());
                j9k1.A(vga0Var4, "user_display_name", notification.u().p().o());
                break;
            case 5:
                vga0 vga0Var5 = (vga0) obj;
                j9k1.A(vga0Var5, "image_url", notification.u().o().getImageUrl());
                j9k1.A(vga0Var5, "entity_url", notification.u().o().o());
                break;
            default:
                vga0 vga0Var6 = (vga0) obj;
                j9k1.B(vga0Var6, "user_image", new xhy0(notification, (byte) 4));
                j9k1.B(vga0Var6, "entity_image", new xhy0(notification, (byte) 5));
                break;
        }
        return rih1Var;
    }
}
