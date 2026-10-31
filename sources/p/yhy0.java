package p;

import com.google.protobuf.Timestamp;
import com.spotify.gander.v2.proto.EntityImage;
import com.spotify.gander.v2.proto.MessagingMetadata;
import com.spotify.gander.v2.proto.MultiUserImage;
import com.spotify.gander.v2.proto.Notification;
import com.spotify.gander.v2.proto.NotificationAction;
import com.spotify.gander.v2.proto.UserAndEntityImage;
import com.spotify.gander.v2.proto.UserImage;
import j$.time.Instant;
import j$.time.format.DateTimeFormatter;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yhy0 implements nma0 {
    public static final yhy0 a = new yhy0();
    public static final j661 b = omo1.j("com.spotify.gander.v2.proto.Notification", new h661[0]);

    public final Object deserialize(dar darVar) {
        String strG;
        String strG2;
        String strG3;
        String strG4;
        String strG5;
        String strG6;
        String strG7;
        String strG8;
        String strG9;
        String strG10;
        String strG11;
        String strG12;
        String strG13;
        String strG14;
        String strG15;
        String strG16;
        uga0 uga0VarL = fga0.l(((bga0) darVar).m());
        ejo0 ejo0VarX = Notification.x();
        ega0 ega0Var = (ega0) uga0VarL.get("id");
        if (ega0Var != null && (strG16 = fga0.g(fga0.m(ega0Var))) != null) {
            ejo0VarX.s(strG16);
        }
        ega0 ega0Var2 = (ega0) uga0VarL.get("createdTimestamp");
        if (ega0Var2 != null && (strG15 = fga0.g(fga0.m(ega0Var2))) != null) {
            try {
                Instant instant = Instant.parse(strG15);
                sve1 sve1VarR = Timestamp.r();
                sve1VarR.q(instant.getEpochSecond());
                sve1VarR.n(instant.getNano());
                ejo0VarX.q((Timestamp) sve1VarR.build());
            } catch (Exception e) {
                n57.e("Failed to parse timestamp: " + strG15 + ". Exception: " + e);
            }
        }
        ega0 ega0Var3 = (ega0) uga0VarL.get("title");
        if (ega0Var3 != null && (strG14 = fga0.g(fga0.m(ega0Var3))) != null) {
            ejo0VarX.x(strG14);
        }
        ega0 ega0Var4 = (ega0) uga0VarL.get("action");
        if (ega0Var4 != null) {
            uga0 uga0VarL2 = fga0.l(ega0Var4);
            mjo0 mjo0VarP = NotificationAction.p();
            ega0 ega0Var5 = (ega0) uga0VarL2.get("uri");
            if (ega0Var5 != null && (strG13 = fga0.g(fga0.m(ega0Var5))) != null) {
                mjo0VarP.q(strG13);
            }
            ega0 ega0Var6 = (ega0) uga0VarL2.get("type");
            if (ega0Var6 != null && (strG12 = fga0.g(fga0.m(ega0Var6))) != null) {
                try {
                    mjo0VarP.n(q80.valueOf(strG12));
                } catch (IllegalArgumentException unused) {
                    mjo0VarP.n(q80.UNRECOGNIZED);
                }
            }
            ejo0VarX.n((NotificationAction) mjo0VarP.build());
        }
        ega0 ega0Var7 = (ega0) uga0VarL.get("multiUserImage");
        if (ega0Var7 != null) {
            uga0 uga0VarL3 = fga0.l(ega0Var7);
            ejo0VarX.getClass();
            gvm0 gvm0VarQ = MultiUserImage.q();
            ega0 ega0Var8 = (ega0) uga0VarL3.get("userImages");
            if (ega0Var8 != null) {
                Iterator it = fga0.k(ega0Var8).a.iterator();
                while (it.hasNext()) {
                    uga0 uga0VarL4 = fga0.l((ega0) it.next());
                    vbi1 vbi1VarP = UserImage.p();
                    ega0 ega0Var9 = (ega0) uga0VarL4.get("imageUrl");
                    if (ega0Var9 != null && (strG11 = fga0.g(fga0.m(ega0Var9))) != null) {
                        vbi1VarP.n(strG11);
                    }
                    ega0 ega0Var10 = (ega0) uga0VarL4.get("userDisplayName");
                    if (ega0Var10 != null && (strG10 = fga0.g(fga0.m(ega0Var10))) != null) {
                        vbi1VarP.q(strG10);
                    }
                    gvm0VarQ.n((UserImage) vbi1VarP.build());
                }
            }
            ejo0VarX.v((MultiUserImage) gvm0VarQ.build());
        }
        ega0 ega0Var11 = (ega0) uga0VarL.get("entityImage");
        if (ega0Var11 != null) {
            uga0 uga0VarL5 = fga0.l(ega0Var11);
            ejo0VarX.getClass();
            ugy ugyVarP = EntityImage.p();
            ega0 ega0Var12 = (ega0) uga0VarL5.get("imageUrl");
            if (ega0Var12 != null && (strG9 = fga0.g(fga0.m(ega0Var12))) != null) {
                ugyVarP.q(strG9);
            }
            ega0 ega0Var13 = (ega0) uga0VarL5.get("entityUrl");
            if (ega0Var13 != null && (strG8 = fga0.g(fga0.m(ega0Var13))) != null) {
                ugyVarP.n(strG8);
            }
            ejo0VarX.r((EntityImage) ugyVarP.build());
        }
        ega0 ega0Var14 = (ega0) uga0VarL.get("userAndEntityImage");
        if (ega0Var14 != null) {
            uga0 uga0VarL6 = fga0.l(ega0Var14);
            ejo0VarX.getClass();
            q6i1 q6i1VarQ = UserAndEntityImage.q();
            ega0 ega0Var15 = (ega0) uga0VarL6.get("userImage");
            if (ega0Var15 != null) {
                uga0 uga0VarL7 = fga0.l(ega0Var15);
                vbi1 vbi1VarP2 = UserImage.p();
                ega0 ega0Var16 = (ega0) uga0VarL7.get("imageUrl");
                if (ega0Var16 != null && (strG7 = fga0.g(fga0.m(ega0Var16))) != null) {
                    vbi1VarP2.n(strG7);
                }
                ega0 ega0Var17 = (ega0) uga0VarL7.get("userDisplayName");
                if (ega0Var17 != null && (strG6 = fga0.g(fga0.m(ega0Var17))) != null) {
                    vbi1VarP2.q(strG6);
                }
                q6i1VarQ.q((UserImage) vbi1VarP2.build());
            }
            ega0 ega0Var18 = (ega0) uga0VarL6.get("entityImage");
            if (ega0Var18 != null) {
                uga0 uga0VarL8 = fga0.l(ega0Var18);
                ugy ugyVarP2 = EntityImage.p();
                ega0 ega0Var19 = (ega0) uga0VarL8.get("imageUrl");
                if (ega0Var19 != null && (strG5 = fga0.g(fga0.m(ega0Var19))) != null) {
                    ugyVarP2.q(strG5);
                }
                ega0 ega0Var20 = (ega0) uga0VarL8.get("entityUrl");
                if (ega0Var20 != null && (strG4 = fga0.g(fga0.m(ega0Var20))) != null) {
                    ugyVarP2.n(strG4);
                }
                q6i1VarQ.n((EntityImage) ugyVarP2.build());
            }
            ejo0VarX.y((UserAndEntityImage) q6i1VarQ.build());
        }
        ega0 ega0Var21 = (ega0) uga0VarL.get("isNew");
        if (ega0Var21 != null) {
            ejo0VarX.t(fga0.e(fga0.m(ega0Var21)));
        }
        ega0 ega0Var22 = (ega0) uga0VarL.get("storageId");
        if (ega0Var22 != null && (strG3 = fga0.g(fga0.m(ega0Var22))) != null) {
            ejo0VarX.w(strG3);
        }
        ega0 ega0Var23 = (ega0) uga0VarL.get("messagingMetadata");
        if (ega0Var23 != null) {
            uga0 uga0VarL9 = fga0.l(ega0Var23);
            ejo0VarX.getClass();
            zcj0 zcj0VarP = MessagingMetadata.p();
            ega0 ega0Var24 = (ega0) uga0VarL9.get("messageId");
            if (ega0Var24 != null && (strG2 = fga0.g(fga0.m(ega0Var24))) != null) {
                zcj0VarP.n(strG2);
            }
            ega0 ega0Var25 = (ega0) uga0VarL9.get("opportunityId");
            if (ega0Var25 != null && (strG = fga0.g(fga0.m(ega0Var25))) != null) {
                zcj0VarP.q(strG);
            }
            ejo0VarX.u((MessagingMetadata) zcj0VarP.build());
        }
        return (Notification) ejo0VarX.build();
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        Notification notification = (Notification) obj;
        jga0 jga0Var = (jga0) uaxVar;
        vga0 vga0Var = new vga0();
        j9k1.A(vga0Var, "id", notification.getId());
        if (notification.w()) {
            Timestamp timestampO = notification.o();
            j9k1.A(vga0Var, "created_timestamp", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochSecond(timestampO.q(), timestampO.p())));
        }
        j9k1.A(vga0Var, "title", notification.getTitle());
        if (notification.v()) {
            j9k1.B(vga0Var, "action", new xhy0(notification, (byte) 0));
        }
        int iQ = notification.q();
        int i = iQ == 0 ? -1 : why0.a[l1d.C(iQ)];
        byte b2 = 2;
        if (i != 1) {
            byte b3 = 3;
            if (i == 2) {
                j9k1.B(vga0Var, "entity_image", new xhy0(notification, b3));
            } else if (i == 3) {
                j9k1.B(vga0Var, "user_and_entity_image", new xhy0(notification, (byte) 6));
            } else if (i != 4) {
                eg.o();
                return;
            }
        } else {
            j9k1.B(vga0Var, "multi_user_image", new xhy0(notification, b2));
        }
        j9k1.y(vga0Var, "is_new", Boolean.valueOf(notification.getIsNew()));
        j9k1.A(vga0Var, "storage_id", notification.t());
        jga0Var.R(vga0Var.a());
    }
}
