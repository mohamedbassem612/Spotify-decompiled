package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import app.p000rive.runtime.kotlin.renderers.RendererMetrics;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p.asj0;
import p.b380;
import p.bg11;
import p.bhn0;
import p.bih1;
import p.bkh0;
import p.c8d0;
import p.cc9;
import p.dkh0;
import p.dm5;
import p.dz81;
import p.eg;
import p.ekh0;
import p.far;
import p.g2z;
import p.gar;
import p.ge30;
import p.hkh0;
import p.hph0;
import p.iar;
import p.ie30;
import p.ikh0;
import p.iwg;
import p.jca;
import p.jkh0;
import p.kkh0;
import p.kw7;
import p.kwg;
import p.l291;
import p.ld21;
import p.ljo1;
import p.ljv;
import p.lkh0;
import p.ln20;
import p.m980;
import p.moj1;
import p.o6t0;
import p.o7u0;
import p.oon1;
import p.owj1;
import p.p2i0;
import p.p641;
import p.p6t0;
import p.pwj1;
import p.q59;
import p.qub1;
import p.r38;
import p.r7u0;
import p.rdd1;
import p.s9p1;
import p.u7u0;
import p.upf;
import p.voj1;
import p.vqh0;
import p.w280;
import p.w2z;
import p.wjp0;
import p.x1c;
import p.x1k1;
import p.x74;
import p.x8h;
import p.xdh;
import p.xjp0;
import p.xoj1;
import p.y8v;
import p.yjh0;
import p.yjp0;
import p.yxh;
import p.z1k1;
import p.zoi1;
import p.zu41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class b extends dkh0 {
    public static final int[] c3 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean d3;
    public static boolean e3;
    public int A2;
    public List B2;
    public Surface C2;
    public p6t0 D2;
    public l291 E2;
    public boolean F2;
    public int G2;
    public int H2;
    public long I2;
    public int J2;
    public int K2;
    public int L2;
    public zu41 M2;
    public long N2;
    public boolean O2;
    public long P2;
    public int Q2;
    public long R2;
    public z1k1 S2;
    public z1k1 T2;
    public int U2;
    public boolean V2;
    public int W2;
    public lkh0 X2;
    public moj1 Y2;
    public long Z2;
    public boolean a3;
    public int b3;
    public final Context h2;
    public final boolean i2;
    public final bih1 j2;
    public final byte k2;
    public final boolean l2;
    public final c m2;
    public final x1c n2;
    public final ln20 o2;
    public final q59 p2;
    public final long q2;
    public final xoj1 r2;
    public final PriorityQueue s2;
    public cc9 t2;
    public boolean u2;
    public boolean v2;
    public boolean w2;
    public boolean x2;
    public x1k1 y2;
    public boolean z2;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(kkh0 kkh0Var) {
        Context context = kkh0Var.a;
        super(context.getApplicationContext(), 2, kkh0Var.c, kkh0Var.e);
        Context applicationContext = context.getApplicationContext();
        this.h2 = applicationContext;
        this.k2 = kkh0Var.h;
        this.y2 = null;
        this.j2 = new bih1(kkh0Var.f, kkh0Var.g);
        this.i2 = this.y2 == null;
        this.m2 = new c(applicationContext, this, kkh0Var.d);
        this.n2 = new x1c((byte) 4);
        this.o2 = new ln20(new c8d0(this, (byte) 14));
        HashSet hashSet = hph0.a;
        this.l2 = "NVIDIA".equals(Build.MANUFACTURER);
        this.E2 = l291.c;
        this.G2 = 1;
        this.H2 = 0;
        this.S2 = z1k1.d;
        this.W2 = 0;
        this.T2 = null;
        this.U2 = -1000;
        this.Z2 = -9223372036854775807L;
        this.p2 = new q59((byte) 1);
        this.s2 = new PriorityQueue();
        this.q2 = -15000L;
        this.r2 = new xoj1();
        this.M2 = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x0136  */
    /* JADX WARN: Code duplicated, block: B:109:0x013f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159  */
    /* JADX WARN: Code duplicated, block: B:118:0x015d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0166  */
    /* JADX WARN: Code duplicated, block: B:122:0x016a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0173  */
    /* JADX WARN: Code duplicated, block: B:126:0x0177  */
    /* JADX WARN: Code duplicated, block: B:129:0x0180  */
    /* JADX WARN: Code duplicated, block: B:130:0x0184  */
    /* JADX WARN: Code duplicated, block: B:133:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0191  */
    /* JADX WARN: Code duplicated, block: B:137:0x019a  */
    /* JADX WARN: Code duplicated, block: B:138:0x019e  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0200  */
    /* JADX WARN: Code duplicated, block: B:169:0x020a  */
    /* JADX WARN: Code duplicated, block: B:170:0x020e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0218  */
    /* JADX WARN: Code duplicated, block: B:174:0x021c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0226  */
    /* JADX WARN: Code duplicated, block: B:178:0x022a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0234  */
    /* JADX WARN: Code duplicated, block: B:182:0x0238  */
    /* JADX WARN: Code duplicated, block: B:185:0x0242  */
    /* JADX WARN: Code duplicated, block: B:186:0x0246  */
    /* JADX WARN: Code duplicated, block: B:189:0x0250  */
    /* JADX WARN: Code duplicated, block: B:190:0x0254  */
    /* JADX WARN: Code duplicated, block: B:193:0x025e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0262  */
    /* JADX WARN: Code duplicated, block: B:197:0x026c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0270  */
    /* JADX WARN: Code duplicated, block: B:201:0x027a  */
    /* JADX WARN: Code duplicated, block: B:202:0x027e  */
    /* JADX WARN: Code duplicated, block: B:205:0x0288  */
    /* JADX WARN: Code duplicated, block: B:206:0x028c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0296  */
    /* JADX WARN: Code duplicated, block: B:210:0x029a  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:221:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:225:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:229:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:230:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:233:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:241:0x0306  */
    /* JADX WARN: Code duplicated, block: B:242:0x030a  */
    /* JADX WARN: Code duplicated, block: B:245:0x0314  */
    /* JADX WARN: Code duplicated, block: B:246:0x0318  */
    /* JADX WARN: Code duplicated, block: B:249:0x0322  */
    /* JADX WARN: Code duplicated, block: B:250:0x0326  */
    /* JADX WARN: Code duplicated, block: B:253:0x0330  */
    /* JADX WARN: Code duplicated, block: B:254:0x0334  */
    /* JADX WARN: Code duplicated, block: B:257:0x033e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0342  */
    /* JADX WARN: Code duplicated, block: B:261:0x034c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0350  */
    /* JADX WARN: Code duplicated, block: B:265:0x035a  */
    /* JADX WARN: Code duplicated, block: B:266:0x035e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0368  */
    /* JADX WARN: Code duplicated, block: B:270:0x036c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0376  */
    /* JADX WARN: Code duplicated, block: B:274:0x037a  */
    /* JADX WARN: Code duplicated, block: B:277:0x0384  */
    /* JADX WARN: Code duplicated, block: B:278:0x0388  */
    /* JADX WARN: Code duplicated, block: B:281:0x0392  */
    /* JADX WARN: Code duplicated, block: B:282:0x0396  */
    /* JADX WARN: Code duplicated, block: B:285:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:293:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:294:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:297:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:298:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:302:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:306:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:313:0x0402  */
    /* JADX WARN: Code duplicated, block: B:314:0x0406  */
    /* JADX WARN: Code duplicated, block: B:317:0x0410  */
    /* JADX WARN: Code duplicated, block: B:318:0x0414  */
    /* JADX WARN: Code duplicated, block: B:321:0x041e  */
    /* JADX WARN: Code duplicated, block: B:322:0x0422  */
    /* JADX WARN: Code duplicated, block: B:325:0x042c  */
    /* JADX WARN: Code duplicated, block: B:326:0x0430  */
    /* JADX WARN: Code duplicated, block: B:329:0x043a  */
    /* JADX WARN: Code duplicated, block: B:330:0x043e  */
    /* JADX WARN: Code duplicated, block: B:333:0x0448  */
    /* JADX WARN: Code duplicated, block: B:334:0x044c  */
    /* JADX WARN: Code duplicated, block: B:337:0x0456  */
    /* JADX WARN: Code duplicated, block: B:338:0x045a  */
    /* JADX WARN: Code duplicated, block: B:341:0x0464  */
    /* JADX WARN: Code duplicated, block: B:342:0x0468  */
    /* JADX WARN: Code duplicated, block: B:345:0x0472  */
    /* JADX WARN: Code duplicated, block: B:346:0x0476  */
    /* JADX WARN: Code duplicated, block: B:349:0x0480  */
    /* JADX WARN: Code duplicated, block: B:350:0x0484  */
    /* JADX WARN: Code duplicated, block: B:353:0x048e  */
    /* JADX WARN: Code duplicated, block: B:354:0x0492  */
    /* JADX WARN: Code duplicated, block: B:357:0x049c  */
    /* JADX WARN: Code duplicated, block: B:358:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:361:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:366:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:370:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:381:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:386:0x0502  */
    /* JADX WARN: Code duplicated, block: B:389:0x050c  */
    /* JADX WARN: Code duplicated, block: B:390:0x0510  */
    /* JADX WARN: Code duplicated, block: B:393:0x051a  */
    /* JADX WARN: Code duplicated, block: B:394:0x051e  */
    /* JADX WARN: Code duplicated, block: B:397:0x0528  */
    /* JADX WARN: Code duplicated, block: B:398:0x052c  */
    /* JADX WARN: Code duplicated, block: B:401:0x0536  */
    /* JADX WARN: Code duplicated, block: B:402:0x053a  */
    /* JADX WARN: Code duplicated, block: B:405:0x0544  */
    /* JADX WARN: Code duplicated, block: B:406:0x0548  */
    /* JADX WARN: Code duplicated, block: B:409:0x0552  */
    /* JADX WARN: Code duplicated, block: B:410:0x0556  */
    /* JADX WARN: Code duplicated, block: B:413:0x0560  */
    /* JADX WARN: Code duplicated, block: B:414:0x0564  */
    /* JADX WARN: Code duplicated, block: B:417:0x056e  */
    /* JADX WARN: Code duplicated, block: B:418:0x0572  */
    /* JADX WARN: Code duplicated, block: B:421:0x057c  */
    /* JADX WARN: Code duplicated, block: B:422:0x0580  */
    /* JADX WARN: Code duplicated, block: B:425:0x058a  */
    /* JADX WARN: Code duplicated, block: B:426:0x058e  */
    /* JADX WARN: Code duplicated, block: B:429:0x0598  */
    /* JADX WARN: Code duplicated, block: B:430:0x059c  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:434:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:441:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:445:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:449:0x05de  */
    /* JADX WARN: Code duplicated, block: B:450:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:453:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:454:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:457:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:461:0x0608  */
    /* JADX WARN: Code duplicated, block: B:462:0x060c  */
    /* JADX WARN: Code duplicated, block: B:465:0x0616  */
    /* JADX WARN: Code duplicated, block: B:466:0x061a  */
    /* JADX WARN: Code duplicated, block: B:469:0x0624  */
    /* JADX WARN: Code duplicated, block: B:470:0x0628  */
    /* JADX WARN: Code duplicated, block: B:473:0x0632  */
    /* JADX WARN: Code duplicated, block: B:474:0x0636  */
    /* JADX WARN: Code duplicated, block: B:477:0x0640  */
    /* JADX WARN: Code duplicated, block: B:478:0x0644  */
    /* JADX WARN: Code duplicated, block: B:481:0x064e  */
    /* JADX WARN: Code duplicated, block: B:482:0x0652  */
    /* JADX WARN: Code duplicated, block: B:485:0x065c  */
    /* JADX WARN: Code duplicated, block: B:486:0x0660  */
    /* JADX WARN: Code duplicated, block: B:489:0x066a  */
    /* JADX WARN: Code duplicated, block: B:490:0x066e  */
    /* JADX WARN: Code duplicated, block: B:493:0x0678  */
    /* JADX WARN: Code duplicated, block: B:494:0x067c  */
    /* JADX WARN: Code duplicated, block: B:497:0x0686  */
    /* JADX WARN: Code duplicated, block: B:498:0x068a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:501:0x0694  */
    /* JADX WARN: Code duplicated, block: B:502:0x0698  */
    /* JADX WARN: Code duplicated, block: B:505:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:509:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:513:0x06be  */
    /* JADX WARN: Code duplicated, block: B:514:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:517:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:518:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:521:0x06da  */
    /* JADX WARN: Code duplicated, block: B:522:0x06de  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:526:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:530:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:533:0x0704  */
    /* JADX WARN: Code duplicated, block: B:534:0x0708  */
    /* JADX WARN: Code duplicated, block: B:537:0x0712  */
    /* JADX WARN: Code duplicated, block: B:538:0x0716  */
    /* JADX WARN: Code duplicated, block: B:541:0x0720  */
    /* JADX WARN: Code duplicated, block: B:542:0x0724  */
    /* JADX WARN: Code duplicated, block: B:545:0x072e  */
    /* JADX WARN: Code duplicated, block: B:546:0x0732  */
    /* JADX WARN: Code duplicated, block: B:549:0x073c  */
    /* JADX WARN: Code duplicated, block: B:552:0x0746  */
    /* JADX WARN: Code duplicated, block: B:553:0x0749  */
    /* JADX WARN: Code duplicated, block: B:556:0x0753  */
    /* JADX WARN: Code duplicated, block: B:557:0x0756  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f A[Catch: all -> 0x08c0, TRY_LEAVE, TryCatch #0 {all -> 0x08c0, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0023, B:664:0x08bb, B:52:0x0094, B:55:0x009f, B:98:0x011a, B:667:0x08c2), top: B:672:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:560:0x0760  */
    /* JADX WARN: Code duplicated, block: B:561:0x0764  */
    /* JADX WARN: Code duplicated, block: B:564:0x076e  */
    /* JADX WARN: Code duplicated, block: B:565:0x0772  */
    /* JADX WARN: Code duplicated, block: B:568:0x077c  */
    /* JADX WARN: Code duplicated, block: B:569:0x0780  */
    /* JADX WARN: Code duplicated, block: B:572:0x078a  */
    /* JADX WARN: Code duplicated, block: B:573:0x078e  */
    /* JADX WARN: Code duplicated, block: B:576:0x0798  */
    /* JADX WARN: Code duplicated, block: B:577:0x079c  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:581:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:592:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:596:0x07de  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:600:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:601:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:604:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:608:0x0808  */
    /* JADX WARN: Code duplicated, block: B:609:0x080c  */
    /* JADX WARN: Code duplicated, block: B:612:0x0816  */
    /* JADX WARN: Code duplicated, block: B:613:0x081a  */
    /* JADX WARN: Code duplicated, block: B:616:0x0824  */
    /* JADX WARN: Code duplicated, block: B:617:0x0828  */
    /* JADX WARN: Code duplicated, block: B:620:0x0832  */
    /* JADX WARN: Code duplicated, block: B:621:0x0836  */
    /* JADX WARN: Code duplicated, block: B:624:0x0840  */
    /* JADX WARN: Code duplicated, block: B:625:0x0844  */
    /* JADX WARN: Code duplicated, block: B:628:0x084e  */
    /* JADX WARN: Code duplicated, block: B:629:0x0851  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:632:0x085b  */
    /* JADX WARN: Code duplicated, block: B:633:0x085d  */
    /* JADX WARN: Code duplicated, block: B:636:0x0867  */
    /* JADX WARN: Code duplicated, block: B:637:0x0869  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:640:0x0873  */
    /* JADX WARN: Code duplicated, block: B:641:0x0875  */
    /* JADX WARN: Code duplicated, block: B:644:0x087f  */
    /* JADX WARN: Code duplicated, block: B:645:0x0881  */
    /* JADX WARN: Code duplicated, block: B:648:0x088b  */
    /* JADX WARN: Code duplicated, block: B:649:0x088d  */
    /* JADX WARN: Code duplicated, block: B:652:0x0897  */
    /* JADX WARN: Code duplicated, block: B:653:0x0899  */
    /* JADX WARN: Code duplicated, block: B:656:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:657:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:660:0x08af  */
    /* JADX WARN: Code duplicated, block: B:662:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a A[Catch: all -> 0x08c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08c0, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0023, B:664:0x08bb, B:52:0x0094, B:55:0x009f, B:98:0x011a, B:667:0x08c2), top: B:672:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean U0(String str) {
        String str2;
        byte b;
        String str3;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (b.class) {
            try {
                if (!d3) {
                    HashSet hashSet = hph0.a;
                    int i = Build.VERSION.SDK_INT;
                    byte b3 = 28;
                    if (i <= 28) {
                        String str4 = Build.DEVICE;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b2 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b2 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b2 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b2 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b2 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b2 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b2 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b2 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                if (i <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                    str2 = Build.MODEL;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b = 6;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b = 7;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b = 8;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        default:
                                            if (i <= 26) {
                                                str3 = Build.DEVICE;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b3 = 0;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b3 = 1;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b3 = 2;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b3 = 3;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b3 = 4;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b3 = 5;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b3 = 6;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b3 = 7;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b3 = 8;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b3 = 9;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b3 = 10;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b3 = 11;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b3 = 12;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b3 = 13;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b3 = 14;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b3 = 15;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b3 = 16;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b3 = 17;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b3 = 18;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b3 = 19;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b3 = 20;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b3 = 21;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b3 = 22;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b3 = 23;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b3 = 24;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b3 = 25;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b3 = 26;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b3 = 27;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b3 = 29;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b3 = 30;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b3 = 31;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b3 = 32;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b3 = 33;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b3 = 34;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b3 = 35;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b3 = 36;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b3 = 37;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b3 = 38;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b3 = 39;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b3 = 40;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b3 = 41;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b3 = 42;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b3 = 43;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b3 = 44;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b3 = 45;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b3 = 46;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b3 = 47;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b3 = 48;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b3 = 49;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b3 = 50;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b3 = 51;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b3 = 52;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b3 = 53;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b3 = 54;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b3 = 55;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b3 = 56;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b3 = 57;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b3 = 58;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b3 = 59;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b3 = 60;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b3 = 61;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b3 = 62;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b3 = 63;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b3 = 64;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b3 = 65;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b3 = 66;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b3 = 67;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b3 = 68;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b3 = 69;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b3 = 70;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b3 = 71;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b3 = 72;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b3 = 73;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b3 = 74;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b3 = 75;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b3 = 76;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b3 = 77;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b3 = 78;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b3 = 79;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b3 = 80;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b3 = 81;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b3 = 82;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b3 = 83;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b3 = 84;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b3 = 85;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b3 = 86;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b3 = 87;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b3 = 88;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b3 = 89;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b3 = 90;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b3 = 91;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b3 = 92;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b3 = 93;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b3 = 94;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b3 = 95;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b3 = 96;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b3 = 97;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b3 = 98;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b3 = 99;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b3 = 100;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b3 = 101;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b3 = 102;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b3 = 103;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b3 = 104;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b3 = 105;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b3 = 106;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b3 = 107;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b3 = 108;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b3 = 109;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b3 = 110;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b3 = 111;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b3 = 112;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b3 = 113;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b3 = 114;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b3 = 115;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b3 = 116;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b3 = 117;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b3 = 118;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b3 = 119;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b3 = 120;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b3 = 121;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b3 = 122;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b3 = 123;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b3 = 124;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b3 = 125;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b3 = 126;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b3 = 127;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b3 = 128;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b3 = 129;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b3 = 130;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b3 = 131;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b3 = 132;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b3 = 133;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b3 = 134;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b3 = 135;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b3 = 136;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b3 = 137;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b3 = 138;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b3 = 139;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b3 = -1;
                                                        break;
                                                }
                                                switch (b3) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                                    case RendererMetrics.SAMPLES /* 30 */:
                                                    case 31:
                                                    case 32:
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                    case 48:
                                                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case 64:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case ContentType.OTHER /* 100 */:
                                                    case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                                                    case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                                                    case ContentType.LIVE /* 113 */:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                                                    case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                                                    case ContentType.USER_GENERATED_LIVE /* 123 */:
                                                    case 124:
                                                    case 125:
                                                    case 126:
                                                    case 127:
                                                    case SemanticState.Focused /* 128 */:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z = true;
                                break;
                        }
                    } else if (i <= 27) {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = 7;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = 8;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b3 = 0;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b3 = 1;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b3 = 2;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b3 = 3;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b3 = 4;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b3 = 5;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b3 = 6;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b3 = 7;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b3 = 8;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b3 = 9;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b3 = 10;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b3 = 11;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b3 = 12;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b3 = 13;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b3 = 14;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b3 = 15;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b3 = 16;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b3 = 17;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b3 = 18;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b3 = 19;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b3 = 20;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b3 = 21;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b3 = 22;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b3 = 23;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b3 = 24;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b3 = 25;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b3 = 26;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b3 = 27;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b3 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b3 = 29;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b3 = 30;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b3 = 31;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b3 = 32;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b3 = 33;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b3 = 34;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b3 = 35;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b3 = 36;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b3 = 37;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b3 = 38;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b3 = 39;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b3 = 40;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b3 = 41;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b3 = 42;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b3 = 43;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b3 = 44;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b3 = 45;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b3 = 46;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b3 = 47;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b3 = 48;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b3 = 49;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b3 = 50;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b3 = 51;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b3 = 52;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b3 = 53;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b3 = 54;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b3 = 55;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b3 = 56;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b3 = 57;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b3 = 58;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b3 = 59;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b3 = 60;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b3 = 61;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b3 = 62;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b3 = 63;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b3 = 64;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b3 = 65;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b3 = 66;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b3 = 67;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b3 = 68;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b3 = 69;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b3 = 70;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b3 = 71;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b3 = 72;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b3 = 73;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b3 = 74;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b3 = 75;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b3 = 76;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b3 = 77;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b3 = 78;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b3 = 79;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b3 = 80;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b3 = 81;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b3 = 82;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b3 = 83;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b3 = 84;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b3 = 85;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b3 = 86;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b3 = 87;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b3 = 88;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b3 = 89;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b3 = 90;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b3 = 91;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b3 = 92;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b3 = 93;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b3 = 94;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b3 = 95;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b3 = 96;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b3 = 97;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b3 = 98;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b3 = 99;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b3 = 100;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b3 = 101;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b3 = 102;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b3 = 103;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b3 = 104;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b3 = 105;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b3 = 106;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b3 = 107;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b3 = 108;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b3 = 109;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b3 = 110;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b3 = 111;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b3 = 112;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b3 = 113;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b3 = 114;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b3 = 115;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b3 = 116;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b3 = 117;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b3 = 118;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b3 = 119;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b3 = 120;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b3 = 121;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b3 = 122;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b3 = 123;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b3 = 124;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b3 = 125;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b3 = 126;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b3 = 127;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b3 = 128;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b3 = 129;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b3 = 130;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b3 = 131;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b3 = 132;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b3 = 133;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b3 = 134;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b3 = 135;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b3 = 136;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b3 = 137;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b3 = 138;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b3 = 139;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                        case RendererMetrics.SAMPLES /* 30 */:
                                        case 31:
                                        case 32:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                        case 48:
                                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case ContentType.OTHER /* 100 */:
                                        case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                                        case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                                        case ContentType.LIVE /* 113 */:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                                        case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                                        case ContentType.USER_GENERATED_LIVE /* 123 */:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case SemanticState.Focused /* 128 */:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    } else {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b3 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 139;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                        case RendererMetrics.SAMPLES /* 30 */:
                                        case 31:
                                        case 32:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                        case 48:
                                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case ContentType.OTHER /* 100 */:
                                        case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                                        case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                                        case ContentType.LIVE /* 113 */:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                                        case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                                        case ContentType.USER_GENERATED_LIVE /* 123 */:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case SemanticState.Focused /* 128 */:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    }
                    e3 = z;
                    d3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    public static int V0(bkh0 bkh0Var, ie30 ie30Var) {
        int i = ie30Var.w;
        int i2 = ie30Var.x;
        if (i != -1 && i2 != -1) {
            String str = ie30Var.f66p;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairC = kwg.c(ie30Var);
                if (pairC == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairC.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    HashSet hashSet = hph0.a;
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !bkh0Var.f)))) {
                        return ((zoi1.g(i2, 16) * zoi1.g(i, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static List W0(Context context, ie30 ie30Var, boolean z, boolean z2) {
        bg11 bg11VarF;
        String str = ie30Var.f66p;
        if (str == null) {
            w280 w280Var = b380.b;
            return bg11.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !kw7.s(context)) {
            String strC = hkh0.c(ie30Var);
            if (strC == null) {
                w280 w280Var2 = b380.b;
                bg11VarF = bg11.e;
            } else {
                bg11VarF = hkh0.f(strC, z, z2);
            }
            if (!bg11VarF.isEmpty()) {
                return bg11VarF;
            }
        }
        return hkh0.h(ie30Var, z, z2);
    }

    public static int X0(bkh0 bkh0Var, ie30 ie30Var) {
        int i = ie30Var.q;
        List list = ie30Var.s;
        if (i == -1) {
            return V0(bkh0Var, ie30Var);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return ie30Var.q + length;
    }

    @Override // p.jca
    public final void A() {
        x1k1 x1k1Var = this.y2;
        if (x1k1Var == null || !this.i2) {
            return;
        }
        x1k1Var.release();
    }

    @Override // p.dkh0
    public final void A0(gar garVar) {
        ByteBuffer byteBuffer;
        int iP;
        int i;
        ByteBuffer byteBuffer2;
        x8h x8hVar;
        bkh0 bkh0Var = this.t1;
        bkh0Var.getClass();
        String str = bkh0Var.b;
        if (str.equals("video/av01") && (byteBuffer2 = garVar.d) != null) {
            ie30 ie30Var = this.n1;
            boolean z = (ie30Var == null || (x8hVar = ie30Var.H) == null || x8hVar.e <= 8) ? false : true;
            if (this.x2 && !byteBuffer2.isReadOnly()) {
                upf.j(byteBuffer2, false);
            } else if (z && this.v2 && !byteBuffer2.isReadOnly()) {
                upf.j(byteBuffer2, true);
            }
            q59 q59Var = this.p2;
            if (q59Var != null && garVar.f(1)) {
                int iPosition = byteBuffer2.position();
                int iLimit = byteBuffer2.limit();
                byteBuffer2.limit(Math.min(iLimit, iPosition + 500));
                ByteBuffer byteBuffer3 = (ByteBuffer) q59Var.b;
                byteBuffer3.clear();
                byteBuffer3.put(byteBuffer2);
                byteBuffer3.flip();
                byteBuffer2.position(iPosition);
                byteBuffer2.limit(iLimit);
            }
        } else if (str.equals("video/hevc") && (byteBuffer = garVar.d) != null && this.x2 && !byteBuffer.isReadOnly()) {
            ByteBuffer byteBuffer4 = garVar.d;
            int iPosition2 = byteBuffer4.position();
            int iLimit2 = byteBuffer4.limit();
            if (iLimit2 - iPosition2 >= 4) {
                while (iPosition2 < iLimit2) {
                    int iP2 = ljo1.p(byteBuffer4, iPosition2, iLimit2);
                    if (iP2 == iLimit2 || (iP = iP2 + 3) >= iLimit2 || ((i = (byteBuffer4.get(iP) & 126) >> 1) >= 0 && i <= 31)) {
                        break;
                    }
                    if (i == 39) {
                        int i2 = iP2 + 5;
                        iP = ljo1.p(byteBuffer4, i2, iLimit2);
                        int i3 = 0;
                        while (i2 < iP) {
                            int i4 = 0;
                            while (i2 < iP) {
                                int i5 = byteBuffer4.get(i2) & 255;
                                if (i5 != 3 || i3 < 2) {
                                    i3 = i5 == 0 ? i3 + 1 : 0;
                                    int i6 = i2 + 1;
                                    i4 += i5;
                                    if (i5 != 255) {
                                        if (i4 == 4) {
                                            byteBuffer4.put(i2, (byte) -2);
                                        }
                                        i2 = i6;
                                        break;
                                    }
                                    i2 = i6;
                                } else {
                                    i2++;
                                    i3 = 0;
                                }
                            }
                            if (i2 >= iP) {
                                break;
                            }
                            int i7 = 0;
                            while (i2 < iP) {
                                int i8 = byteBuffer4.get(i2) & 255;
                                if (i8 != 3 || i3 < 2) {
                                    i3 = i8 == 0 ? i3 + 1 : 0;
                                    i2++;
                                    i7 += i8;
                                    if (i8 != 255) {
                                        break;
                                    }
                                } else {
                                    i2++;
                                    i3 = 0;
                                }
                            }
                            int i9 = 0;
                            while (i9 < i7 && i2 < iP) {
                                int i10 = i2 + 1;
                                int i11 = byteBuffer4.get(i2) & 255;
                                if (i11 != 3 || i3 < 2) {
                                    if (i11 == 0) {
                                        i3++;
                                    }
                                    i9++;
                                    i2 = i10;
                                } else {
                                    i9--;
                                }
                                i3 = 0;
                                i9++;
                                i2 = i10;
                            }
                        }
                    }
                    iPosition2 = iP;
                }
            }
        }
        this.b3 = 0;
        int iF0 = f0(garVar);
        if ((Build.VERSION.SDK_INT < 34 || (iF0 & 32) == 0) && !this.V2) {
            this.L2++;
        }
    }

    @Override // p.jca
    public final void B() {
        try {
            try {
                this.F1 = false;
                G0();
                E0();
                y8v y8vVar = this.h1;
                if (y8vVar != null) {
                    y8vVar.c(null);
                }
                this.h1 = null;
                this.z2 = false;
                this.Z2 = -9223372036854775807L;
                this.x2 = false;
                p6t0 p6t0Var = this.D2;
                if (p6t0Var != null) {
                    p6t0Var.release();
                    this.D2 = null;
                }
            } catch (Throwable th) {
                y8v y8vVar2 = this.h1;
                if (y8vVar2 != null) {
                    y8vVar2.c(null);
                }
                this.h1 = null;
                throw th;
            }
        } catch (Throwable th2) {
            this.z2 = false;
            this.Z2 = -9223372036854775807L;
            this.x2 = false;
            p6t0 p6t0Var2 = this.D2;
            if (p6t0Var2 != null) {
                p6t0Var2.release();
                this.D2 = null;
            }
            throw th2;
        }
    }

    @Override // p.jca
    public final void C() {
        this.J2 = 0;
        this.g.getClass();
        this.I2 = SystemClock.elapsedRealtime();
        this.P2 = 0L;
        this.Q2 = 0;
        x1k1 x1k1Var = this.y2;
        if (x1k1Var != null) {
            x1k1Var.p();
        } else {
            this.m2.d();
        }
    }

    @Override // p.dkh0
    public final boolean C0(long j, long j2, yjh0 yjh0Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ie30 ie30Var) {
        ln20 ln20Var;
        yjh0Var.getClass();
        long j4 = j3 - this.X1.c;
        boolean z3 = this.m2.h != -9223372036854775807L;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.s2;
            Long l = (Long) priorityQueue.peek();
            ln20Var = this.o2;
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            ln20Var.b(1000 * l.longValue());
            if (l.longValue() < this.Y || z3) {
                i5++;
            } else {
                i4++;
            }
        }
        j1(i4, 0);
        this.W1.d += i5;
        ln20Var.b(j3 * 1000);
        x1k1 x1k1Var = this.y2;
        if (x1k1Var != null) {
            if (!z || z2) {
                return x1k1Var.g(j3, new jkh0(this, yjh0Var, i, j4));
            }
            i1(yjh0Var, i);
            return true;
        }
        int iA = this.m2.a(j3, j, j2, this.X1.b, z, z2, ln20Var.a(), ln20Var.h, this.n2);
        x1c x1cVar = this.n2;
        xoj1 xoj1Var = this.r2;
        if (xoj1Var != null && iA != 5 && iA != 4) {
            xoj1Var.a(j3, x1cVar.a);
        }
        if (iA == 0) {
            this.g.getClass();
            long jNanoTime = System.nanoTime();
            moj1 moj1Var = this.Y2;
            if (moj1Var != null) {
                moj1Var.a(j4, jNanoTime, ie30Var, this.o1);
            }
            d1(yjh0Var, i, jNanoTime);
            k1(x1cVar.a);
            return true;
        }
        if (iA == 1) {
            long j5 = x1cVar.b;
            long j6 = x1cVar.a;
            if (j5 == this.R2) {
                i1(yjh0Var, i);
            } else {
                moj1 moj1Var2 = this.Y2;
                if (moj1Var2 != null) {
                    moj1Var2.a(j4, j5, ie30Var, this.o1);
                }
                d1(yjh0Var, i, j5);
            }
            k1(j6);
            this.R2 = j5;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            yjh0Var.l(i);
            Trace.endSection();
            j1(0, 1);
            k1(x1cVar.a);
            return true;
        }
        if (iA == 3) {
            i1(yjh0Var, i);
            k1(x1cVar.a);
            return true;
        }
        if (iA == 4 || iA == 5) {
            return false;
        }
        eg.m(String.valueOf(iA));
        return false;
    }

    @Override // p.jca
    public final void D() {
        b1();
        int i = this.Q2;
        if (i != 0) {
            long j = this.P2;
            bih1 bih1Var = this.j2;
            Handler handler = (Handler) bih1Var.b;
            if (handler != null) {
                handler.post(new owj1(bih1Var, j, i));
            }
            this.P2 = 0L;
            this.Q2 = 0;
        }
        x1k1 x1k1Var = this.y2;
        if (x1k1Var != null) {
            x1k1Var.n();
        } else {
            c cVar = this.m2;
            cVar.d = false;
            cVar.h = -9223372036854775807L;
            e eVar = cVar.b;
            eVar.d = false;
            VideoFrameReleaseHelper$VSyncSampler videoFrameReleaseHelper$VSyncSampler = eVar.c;
            if (videoFrameReleaseHelper$VSyncSampler != null) {
                videoFrameReleaseHelper$VSyncSampler.unregister();
            }
            eVar.a();
        }
        xoj1 xoj1Var = this.r2;
        if (xoj1Var != null) {
            xoj1Var.b();
        }
    }

    @Override // p.dkh0, p.jca
    public final void E(ie30[] ie30VarArr, long j, long j2, p2i0 p2i0Var) {
        super.E(ie30VarArr, j, j2, p2i0Var);
        xoj1 xoj1Var = this.r2;
        if (xoj1Var != null) {
            xoj1Var.b();
        }
    }

    @Override // p.dkh0
    public final void F0() {
        x1k1 x1k1Var = this.y2;
        if (x1k1Var != null) {
            x1k1Var.a();
        } else {
            long j = this.X1.h;
        }
    }

    @Override // p.dkh0
    public final void H0() {
        super.H0();
        this.s2.clear();
        this.L2 = 0;
        this.b3 = 0;
        this.O2 = false;
        q59 q59Var = this.p2;
        if (q59Var != null) {
            q59Var.c = null;
            ByteBuffer byteBuffer = (ByteBuffer) q59Var.b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    @Override // p.dkh0, p.jca
    public final void I(long j, long j2) throws ExoPlaybackException {
        x1k1 x1k1Var = this.y2;
        if (x1k1Var != null) {
            try {
                x1k1Var.u(j, j2);
            } catch (VideoSink$VideoSinkException e) {
                throw c(e, e.a, false, 7001);
            }
        }
        super.I(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:90:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0140  */
    @Override // p.dkh0
    public final boolean L0(gar garVar) {
        boolean z;
        ByteBuffer byteBuffer;
        int iLimit;
        yjp0 yjp0Var;
        m980 m980Var;
        boolean z2 = false;
        if (!a1(garVar)) {
            long j = garVar.f;
            boolean z3 = j < this.Y;
            xoj1 xoj1Var = this.r2;
            if (xoj1Var != null) {
                long j2 = xoj1Var.a;
                long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : (long) (((j - j2) * xoj1Var.c) + xoj1Var.b);
                if (j3 == -9223372036854775807L || j3 >= this.q2) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if ((z3 || z) && !garVar.f(268435456)) {
                if (!garVar.f(67108864)) {
                    q59 q59Var = this.p2;
                    if (q59Var != null) {
                        ByteBuffer byteBuffer2 = (ByteBuffer) q59Var.b;
                        bkh0 bkh0Var = this.t1;
                        bkh0Var.getClass();
                        if (bkh0Var.b.equals("video/av01") && (byteBuffer = garVar.d) != null) {
                            boolean z4 = z3 || this.b3 <= 0;
                            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            byteBufferAsReadOnlyBuffer.flip();
                            if (byteBuffer2.hasRemaining()) {
                                q59Var.v(s9p1.L(byteBuffer2));
                                byteBuffer2.position(byteBuffer2.limit());
                            }
                            ArrayList arrayListL = s9p1.L(byteBufferAsReadOnlyBuffer);
                            q59Var.v(arrayListL);
                            int size = arrayListL.size() - 1;
                            int i = 0;
                            while (size >= 0) {
                                xjp0 xjp0Var = (xjp0) arrayListL.get(size);
                                int i2 = xjp0Var.a;
                                if (i2 != 2 && i2 != 15) {
                                    if ((i2 == 3 && !z4) || ((i2 != 6 && i2 != 3) || (yjp0Var = (yjp0) q59Var.c) == null)) {
                                        break;
                                    }
                                    try {
                                        m980Var = new m980(yjp0Var, xjp0Var);
                                    } catch (wjp0 unused) {
                                        m980Var = null;
                                    }
                                    if (m980Var == null || m980Var.b) {
                                        break;
                                    }
                                }
                                if (((xjp0) arrayListL.get(size)).a == 6 || ((xjp0) arrayListL.get(size)).a == 3) {
                                    i++;
                                }
                                size--;
                            }
                            if (i > 1 || size + 1 >= 8) {
                                iLimit = byteBufferAsReadOnlyBuffer.limit();
                            } else {
                                iLimit = size >= 0 ? ((xjp0) arrayListL.get(size)).b.limit() : byteBufferAsReadOnlyBuffer.position();
                            }
                            if (iLimit == 0) {
                                garVar.g();
                            } else if (iLimit != byteBufferAsReadOnlyBuffer.limit()) {
                                cc9 cc9Var = this.t2;
                                cc9Var.getClass();
                                if (cc9Var.c + iLimit < byteBufferAsReadOnlyBuffer.capacity() && !garVar.f(1073741824)) {
                                    ByteBuffer byteBuffer3 = garVar.d;
                                    byteBuffer3.getClass();
                                    byteBuffer3.position(iLimit);
                                }
                            }
                        }
                    }
                    if (z2) {
                        if (!z3) {
                            this.b3++;
                        }
                        this.s2.add(Long.valueOf(garVar.f));
                    }
                    return z2;
                }
                garVar.g();
                z2 = true;
                if (z2) {
                    if (!z3) {
                        this.b3++;
                    }
                    this.s2.add(Long.valueOf(garVar.f));
                }
                return z2;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @Override // p.dkh0
    public final boolean M0() {
        boolean z;
        if (this.M1) {
            ie30 ie30Var = this.n1;
            long j = this.R0;
            if (j != -9223372036854775807L) {
                if (this.c2 + 1 + j > Long.MAX_VALUE - (this.X1.c + j)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            zu41 zu41Var = this.M2;
            if (zu41Var == null || !zu41Var.c || this.O2 || this.V2 || ((ie30Var != null && ie30Var.r > 0) || z || this.X1.h != -9223372036854775807L)) {
                return true;
            }
        }
        return false;
    }

    @Override // p.dkh0, p.jca
    public final void N(float f, float f2) {
        super.N(f, f2);
        x1k1 x1k1Var = this.y2;
        if (x1k1Var != null) {
            x1k1Var.h(f);
        } else {
            this.m2.g(f);
        }
        xoj1 xoj1Var = this.r2;
        if (xoj1Var != null) {
            xoj1Var.c(f);
        }
    }

    @Override // p.dkh0
    public final boolean N0(bkh0 bkh0Var) {
        return Z0(bkh0Var);
    }

    @Override // p.dkh0
    public final boolean O0() {
        bkh0 bkh0Var = this.t1;
        if (this.y2 != null && bkh0Var != null) {
            String str = bkh0Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.O0();
    }

    @Override // p.dkh0
    public final int Q0(ie30 ie30Var) {
        boolean z;
        int i = 0;
        if (!asj0.o(ie30Var.f66p)) {
            return jca.a(0, 0, 0, 0);
        }
        byte b = 1;
        boolean z2 = ie30Var.t != null;
        Context context = this.h2;
        List listW0 = W0(context, ie30Var, z2, false);
        if (z2 && listW0.isEmpty()) {
            listW0 = W0(context, ie30Var, false, false);
        }
        if (listW0.isEmpty()) {
            return jca.a(1, 0, 0, 0);
        }
        int i2 = ie30Var.T;
        if (i2 != 0 && i2 != 2) {
            return jca.a(2, 0, 0, 0);
        }
        bkh0 bkh0Var = (bkh0) listW0.get(0);
        boolean zE = bkh0Var.e(context, ie30Var);
        if (!zE) {
            int i3 = 1;
            while (true) {
                if (i3 >= listW0.size()) {
                    z = true;
                    break;
                }
                bkh0 bkh0Var2 = (bkh0) listW0.get(i3);
                if (bkh0Var2.e(context, ie30Var)) {
                    z = false;
                    zE = true;
                    bkh0Var = bkh0Var2;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = zE ? 4 : 3;
        int i5 = bkh0Var.f(ie30Var) ? 16 : 8;
        int i6 = bkh0Var.g ? 64 : 0;
        int i7 = z ? SemanticState.Focused : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(ie30Var.f66p) && !kw7.s(context)) {
            i7 = SemanticState.Hidden;
        }
        if (zE) {
            List listW1 = W0(context, ie30Var, z2, true);
            if (!listW1.isEmpty()) {
                HashMap map = hkh0.a;
                ArrayList arrayList = new ArrayList(listW1);
                Collections.sort(arrayList, new yxh(new ekh0(context, ie30Var, b), (byte) 1));
                bkh0 bkh0Var3 = (bkh0) arrayList.get(0);
                if (bkh0Var3.e(context, ie30Var) && bkh0Var3.f(ie30Var)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // p.jca
    public final boolean T(long j) {
        if (this.P1 == -9223372036854775807L || j < this.N2) {
            return false;
        }
        long j2 = this.Y1;
        return j2 == -9223372036854775807L || j > j2;
    }

    @Override // p.dkh0
    public final iar X(bkh0 bkh0Var, ie30 ie30Var, ie30 ie30Var2, boolean z) {
        int i;
        iar iarVarB = bkh0Var.b(ie30Var, ie30Var2);
        float f = ie30Var.B;
        float f2 = ie30Var2.B;
        int i2 = iarVarB.e;
        cc9 cc9Var = this.t2;
        cc9Var.getClass();
        if (ie30Var2.w > cc9Var.a || ie30Var2.x > cc9Var.b) {
            i2 |= SemanticState.Hidden;
        }
        if (X0(bkh0Var, ie30Var2) > cc9Var.c) {
            i2 |= 64;
        }
        if (this.H2 != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!bkh0Var.f || !z))) {
            float fMax = Math.max(f2, f) / Math.min(f2, f);
            if (Math.abs(fMax - Math.round(fMax)) > 0.01f) {
                i2 |= 65536;
            }
        }
        int i3 = i2;
        return new iar(bkh0Var.a, ie30Var, ie30Var2, i3 != 0 ? 0 : iarVarB.d, i3);
    }

    @Override // p.dkh0
    public final MediaCodecDecoderException Y(IllegalStateException illegalStateException, bkh0 bkh0Var) {
        Surface surface = this.C2;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, bkh0Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Surface Y0(bkh0 bkh0Var) {
        boolean z;
        o6t0 o6t0Var;
        int i;
        RuntimeException runtimeException;
        Error error;
        x1k1 x1k1Var = this.y2;
        if (x1k1Var != null) {
            return x1k1Var.c();
        }
        Surface surface = this.C2;
        if (surface != null) {
            return surface;
        }
        p6t0 p6t0Var = null;
        if (Build.VERSION.SDK_INT >= 35 && bkh0Var.h) {
            return null;
        }
        dm5.y(h1(bkh0Var));
        p6t0 p6t0Var2 = this.D2;
        if (p6t0Var2 != null && p6t0Var2.a != bkh0Var.f) {
            if (p6t0Var2 != null) {
                p6t0Var2.release();
                this.D2 = null;
            } else {
                p6t0Var = p6t0Var2;
            }
            p6t0Var2 = p6t0Var;
        }
        if (p6t0Var2 != null) {
            return p6t0Var2;
        }
        Context context = this.h2;
        boolean z2 = bkh0Var.f;
        boolean z3 = false;
        if (z2) {
            if (!p6t0.b(context)) {
                z = false;
            }
            dm5.y(z);
            o6t0Var = new o6t0("ExoPlayer:PlaceholderSurface");
            if (z2) {
                i = p6t0.d;
            } else {
                i = 0;
            }
            o6t0Var.start();
            Handler handler = new Handler(o6t0Var.getLooper(), o6t0Var);
            o6t0Var.b = handler;
            o6t0Var.a = new ljv(handler);
            synchronized (o6t0Var) {
                o6t0Var.b.obtainMessage(1, i, 0).sendToTarget();
                while (o6t0Var.e == null && o6t0Var.d == null && o6t0Var.c == null) {
                    try {
                        o6t0Var.wait();
                    } catch (InterruptedException unused) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            runtimeException = o6t0Var.d;
            if (runtimeException == null) {
                throw runtimeException;
            }
            error = o6t0Var.c;
            if (error == null) {
                throw error;
            }
            p6t0 p6t0Var3 = o6t0Var.e;
            p6t0Var3.getClass();
            this.D2 = p6t0Var3;
            return p6t0Var3;
        }
        int i2 = p6t0.d;
        z = true;
        dm5.y(z);
        o6t0Var = new o6t0("ExoPlayer:PlaceholderSurface");
        if (z2) {
            i = p6t0.d;
        } else {
            i = 0;
        }
        o6t0Var.start();
        Handler handler2 = new Handler(o6t0Var.getLooper(), o6t0Var);
        o6t0Var.b = handler2;
        o6t0Var.a = new ljv(handler2);
        synchronized (o6t0Var) {
            o6t0Var.b.obtainMessage(1, i, 0).sendToTarget();
            while (o6t0Var.e == null) {
                o6t0Var.wait();
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            runtimeException = o6t0Var.d;
            if (runtimeException == null) {
                throw runtimeException;
            }
            error = o6t0Var.c;
            if (error == null) {
                throw error;
            }
            p6t0 p6t0Var4 = o6t0Var.e;
            p6t0Var4.getClass();
            this.D2 = p6t0Var4;
            return p6t0Var4;
        }
    }

    public final boolean Z0(bkh0 bkh0Var) {
        if (this.y2 != null) {
            return true;
        }
        Surface surface = this.C2;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && bkh0Var.h) || h1(bkh0Var);
        }
        return true;
    }

    public final boolean a1(gar garVar) {
        if (q() || garVar.f(536870912)) {
            return true;
        }
        long j = this.R0;
        return j == -9223372036854775807L || j - (garVar.f - this.X1.c) <= 100000;
    }

    @Override // p.dkh0, p.jca
    public final void b(int i, Object obj) {
        if (i == 1) {
            e1(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            moj1 moj1Var = (moj1) obj;
            this.Y2 = moj1Var;
            x1k1 x1k1Var = this.y2;
            if (x1k1Var != null) {
                x1k1Var.q(moj1Var);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.W2 != iIntValue) {
                this.W2 = iIntValue;
                if (this.V2) {
                    E0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.G2 = iIntValue2;
            yjh0 yjh0Var = this.m1;
            if (yjh0Var != null) {
                yjh0Var.k(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.H2 = iIntValue3;
            x1k1 x1k1Var2 = this.y2;
            if (x1k1Var2 != null) {
                x1k1Var2.r(iIntValue3);
                return;
            }
            e eVar = this.m2.b;
            if (eVar.i == iIntValue3) {
                return;
            }
            eVar.i = iIntValue3;
            eVar.c(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(voj1.a)) {
                x1k1 x1k1Var3 = this.y2;
                if (x1k1Var3 == null || !x1k1Var3.isInitialized()) {
                    return;
                }
                this.y2.b();
                return;
            }
            this.B2 = list;
            x1k1 x1k1Var4 = this.y2;
            if (x1k1Var4 != null) {
                x1k1Var4.j(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            l291 l291Var = (l291) obj;
            if (l291Var.a == 0 || l291Var.b == 0) {
                return;
            }
            this.E2 = l291Var;
            x1k1 x1k1Var5 = this.y2;
            if (x1k1Var5 != null) {
                Surface surface = this.C2;
                surface.getClass();
                x1k1Var5.m(surface, l291Var);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.U2 = ((Integer) obj).intValue();
                yjh0 yjh0Var2 = this.m1;
                if (yjh0Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.U2));
                    yjh0Var2.a(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.C2;
                e1(null);
                obj.getClass();
                ((b) obj).b(1, surface2);
                break;
            case 18:
                zu41 zu41Var = this.M2;
                boolean z = zu41Var != null && zu41Var.b;
                zu41 zu41Var2 = (zu41) obj;
                this.M2 = zu41Var2;
                if (z != (zu41Var2 != null && zu41Var2.b)) {
                    R0(this.n1);
                }
                break;
            default:
                super.b(i, obj);
                break;
        }
    }

    public final void b1() {
        if (this.J2 > 0) {
            this.g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.I2;
            int i = this.J2;
            bih1 bih1Var = this.j2;
            Handler handler = (Handler) bih1Var.b;
            if (handler != null) {
                handler.post(new owj1(bih1Var, i, j));
            }
            this.J2 = 0;
            this.I2 = jElapsedRealtime;
        }
    }

    public final void c1() {
        yjh0 yjh0Var;
        if (this.V2 && (yjh0Var = this.m1) != null) {
            this.X2 = new lkh0(this, yjh0Var);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                yjh0Var.a(bundle);
            }
        }
    }

    public final void d1(yjh0 yjh0Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        yjh0Var.o(i, j);
        Trace.endSection();
        this.W1.e++;
        this.K2 = 0;
        if (this.y2 == null) {
            z1k1 z1k1Var = this.S2;
            boolean zEquals = z1k1Var.equals(z1k1.d);
            bih1 bih1Var = this.j2;
            if (!zEquals && !z1k1Var.equals(this.T2)) {
                this.T2 = z1k1Var;
                bih1Var.m(z1k1Var);
            }
            c cVar = this.m2;
            boolean z = cVar.e != 3;
            cVar.e = 3;
            cVar.k.getClass();
            cVar.g = zoi1.W(SystemClock.elapsedRealtime());
            if (!z || (surface = this.C2) == null) {
                return;
            }
            Handler handler = (Handler) bih1Var.b;
            if (handler != null) {
                handler.post(new xdh(bih1Var, surface, SystemClock.elapsedRealtime(), (byte) 4));
            }
            this.F2 = true;
        }
    }

    public final void e1(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.C2;
        bih1 bih1Var = this.j2;
        if (surface2 == surface) {
            if (surface != null) {
                z1k1 z1k1Var = this.T2;
                if (z1k1Var != null) {
                    bih1Var.m(z1k1Var);
                }
                Surface surface3 = this.C2;
                if (surface3 == null || !this.F2 || (handler = (Handler) bih1Var.b) == null) {
                    return;
                }
                handler.post(new xdh(bih1Var, surface3, SystemClock.elapsedRealtime(), (byte) 4));
                return;
            }
            return;
        }
        this.C2 = surface;
        x1k1 x1k1Var = this.y2;
        c cVar = this.m2;
        if (x1k1Var == null) {
            cVar.f(surface);
        }
        boolean z = false;
        this.F2 = false;
        byte b = this.h;
        yjh0 yjh0Var = this.m1;
        if (yjh0Var != null) {
            if (this.y2 == null) {
                bkh0 bkh0Var = this.t1;
                bkh0Var.getClass();
                if (!Z0(bkh0Var) || this.u2) {
                    E0();
                    o0();
                } else {
                    Surface surfaceY0 = Y0(bkh0Var);
                    if (surfaceY0 != null) {
                        yjh0Var.j(surfaceY0);
                    } else {
                        if (Build.VERSION.SDK_INT < 35) {
                            bhn0.w();
                            return;
                        }
                        yjh0Var.g();
                    }
                    z = true;
                }
            } else {
                z = true;
            }
        }
        if (surface != null) {
            z1k1 z1k1Var2 = this.T2;
            if (z1k1Var2 != null) {
                bih1Var.m(z1k1Var2);
            }
        } else {
            this.T2 = null;
            x1k1 x1k1Var2 = this.y2;
            if (x1k1Var2 != null) {
                x1k1Var2.s();
            }
        }
        if (b == 2) {
            x1k1 x1k1Var3 = this.y2;
            if (x1k1Var3 != null) {
                x1k1Var3.v(z);
            } else {
                cVar.c(z);
            }
        }
        c1();
    }

    @Override // p.jca
    public final void f() {
        x1k1 x1k1Var = this.y2;
        if (x1k1Var == null) {
            c cVar = this.m2;
            if (cVar.e == 0) {
                cVar.e = 1;
                return;
            }
            return;
        }
        int i = this.A2;
        if (i == 0 || i == 1) {
            this.A2 = 0;
        } else {
            x1k1Var.l();
        }
    }

    @Override // p.dkh0
    public final int f0(gar garVar) {
        if (Build.VERSION.SDK_INT < 34) {
            return 0;
        }
        zu41 zu41Var = this.M2;
        return (((zu41Var == null || !zu41Var.e) && !this.V2) || garVar.f >= this.Y || a1(garVar)) ? 0 : 32;
    }

    public boolean f1(long j, boolean z) {
        return j < -500000 && !z;
    }

    @Override // p.dkh0
    public final float g0(float f, ie30 ie30Var, ie30[] ie30VarArr) {
        bkh0 bkh0Var;
        float fA = -1.0f;
        for (ie30 ie30Var2 : ie30VarArr) {
            float f2 = ie30Var2.B;
            if (f2 != -1.0f) {
                fA = Math.max(fA, f2);
            }
        }
        if (fA == -1.0f && this.m1 != null) {
            ln20 ln20Var = this.o2;
            if (ln20Var.a() != -9223372036854775807L) {
                fA = 1.0E9f / ln20Var.a();
            }
        }
        float f3 = fA == -1.0f ? -1.0f : fA * f;
        if (this.M2 == null || (bkh0Var = this.t1) == null) {
            return f3;
        }
        int i = ie30Var.w;
        int i2 = ie30Var.x;
        float f4 = -3.4028235E38f;
        if (bkh0Var.i) {
            float f5 = bkh0Var.l;
            if (f5 != -3.4028235E38f && bkh0Var.j == i && bkh0Var.k == i2) {
                f4 = f5;
            } else {
                f4 = 1024.0f;
                if (!bkh0Var.g(1024.0d, i, i2)) {
                    float f6 = 0.0f;
                    while (true) {
                        float f7 = f4 - f6;
                        if (Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f6;
                        if (bkh0Var.g(f8, i, i2)) {
                            f6 = f8;
                        } else {
                            f4 = f8;
                        }
                    }
                    f4 = f6;
                }
                bkh0Var.l = f4;
                bkh0Var.j = i;
                bkh0Var.k = i2;
            }
        }
        return f3 != -1.0f ? Math.max(f3, f4) : f4;
    }

    public final boolean g1(long j, long j2, long j3, boolean z, boolean z2) {
        if (this.y2 != null && this.i2) {
            j2 -= -this.Z2;
        }
        if (f1(j, z)) {
            p641 p641Var = this.i;
            p641Var.getClass();
            int iS = p641Var.s(j2 - this.X);
            if (iS != 0) {
                this.N2 = j2;
                boolean z3 = this.m2.h != -9223372036854775807L;
                PriorityQueue priorityQueue = this.s2;
                Iterator it = priorityQueue.iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    if (((Long) it.next()).longValue() < this.Y || z3) {
                        i2++;
                    } else {
                        i++;
                    }
                }
                priorityQueue.clear();
                far farVar = this.W1;
                if (z2) {
                    int i3 = farVar.d + iS;
                    farVar.f += this.L2;
                    farVar.d = i3 + i + i2;
                } else {
                    farVar.j++;
                    j1(iS + i, this.L2);
                    this.W1.d += i2;
                }
                if (d0()) {
                    o0();
                }
                x1k1 x1k1Var = this.y2;
                if (x1k1Var != null) {
                    x1k1Var.t(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p.dkh0
    public final ArrayList h0(ie30 ie30Var, boolean z) {
        boolean z2 = this.V2;
        Context context = this.h2;
        List listW0 = W0(context, ie30Var, z, z2);
        HashMap map = hkh0.a;
        ArrayList arrayList = new ArrayList(listW0);
        Collections.sort(arrayList, new yxh(new ekh0(context, ie30Var, (byte) 1), (byte) 1));
        return arrayList;
    }

    public final boolean h1(bkh0 bkh0Var) {
        if (this.V2 || U0(bkh0Var.a)) {
            return false;
        }
        return !bkh0Var.f || p6t0.b(this.h2);
    }

    @Override // p.jca
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    public final void i1(yjh0 yjh0Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        yjh0Var.l(i);
        Trace.endSection();
        this.W1.f++;
    }

    public final void j1(int i, int i2) {
        far farVar = this.W1;
        farVar.h += i;
        int i3 = i + i2;
        farVar.g += i3;
        this.J2 += i3;
        int i4 = this.K2 + i3;
        this.K2 = i4;
        farVar.i = Math.max(i4, farVar.i);
        byte b = this.k2;
        if (b <= 0 || this.J2 < b) {
            return;
        }
        b1();
    }

    /* JADX WARN: Code duplicated, block: B:67:0x013c  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x013c, please report this as an issue */
    @Override // p.dkh0
    public final g2z k0(bkh0 bkh0Var, ie30 ie30Var, MediaCrypto mediaCrypto, float f) {
        int i;
        cc9 cc9Var;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        byte b;
        boolean z;
        Pair pairC;
        int iV0;
        String str = bkh0Var.c;
        ie30[] ie30VarArr = this.t;
        ie30VarArr.getClass();
        int i2 = ie30Var.w;
        float f2 = ie30Var.B;
        x8h x8hVar = ie30Var.H;
        int i3 = ie30Var.x;
        int iX0 = X0(bkh0Var, ie30Var);
        if (ie30VarArr.length == 1) {
            if (iX0 != -1 && (iV0 = V0(bkh0Var, ie30Var)) != -1) {
                iX0 = Math.min((int) (iX0 * 1.5f), iV0);
            }
            cc9Var = new cc9(i2, i3, iX0, false);
            x8hVar = x8hVar;
            i = i3;
        } else {
            int length = ie30VarArr.length;
            int iMax = i2;
            int i4 = 0;
            boolean z2 = false;
            int iMax2 = i3;
            while (i4 < length) {
                ie30 ie30Var2 = ie30VarArr[i4];
                ie30[] ie30VarArr2 = ie30VarArr;
                if (x8hVar != null && ie30Var2.H == null) {
                    ge30 ge30VarA = ie30Var2.a();
                    ge30VarA.G = x8hVar;
                    ie30Var2 = new ie30(ge30VarA);
                }
                iar iarVarB = bkh0Var.b(ie30Var, ie30Var2);
                int i5 = length;
                int i6 = ie30Var2.x;
                if (iarVarB.d != 0) {
                    int i7 = ie30Var2.w;
                    b = -1;
                    z2 |= i7 == -1 || i6 == -1;
                    iMax = Math.max(iMax, i7);
                    iMax2 = Math.max(iMax2, i6);
                    iX0 = Math.max(iX0, X0(bkh0Var, ie30Var2));
                } else {
                    b = -1;
                }
                length = i5;
                i4++;
                ie30VarArr = ie30VarArr2;
            }
            if (z2) {
                oon1.H("Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z3 = i3 > i2;
                int i8 = z3 ? i3 : i2;
                int i9 = z3 ? i2 : i3;
                boolean z4 = z3;
                float f3 = i9 / i8;
                int i10 = 0;
                while (true) {
                    if (i10 < 9) {
                        int i11 = c3[i10];
                        int i12 = i10;
                        int i13 = (int) (i11 * f3);
                        if (i11 > i8 && i13 > i9) {
                            if (z4) {
                                i11 = i13;
                            }
                            if (z4) {
                                i13 = i11;
                            }
                            int i14 = i8;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = bkh0Var.d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point2 = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point2 = new Point(zoi1.g(i11, widthAlignment) * widthAlignment, zoi1.g(i13, heightAlignment) * heightAlignment);
                            }
                            if (point2 != null) {
                                point = point2;
                                i = i3;
                                if (bkh0Var.g(f2, point2.x, point2.y)) {
                                }
                            } else {
                                i = i3;
                            }
                            i10 = i12 + 1;
                            i3 = i;
                            i8 = i14;
                            x8hVar = x8hVar;
                            i9 = i9;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            ge30 ge30VarA2 = ie30Var.a();
                            ge30VarA2.v = iMax;
                            ge30VarA2.w = iMax2;
                            iX0 = Math.max(iX0, V0(bkh0Var, new ie30(ge30VarA2)));
                            oon1.H("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    x8hVar = x8hVar;
                    i = i3;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        ge30 ge30VarA3 = ie30Var.a();
                        ge30VarA3.v = iMax;
                        ge30VarA3.w = iMax2;
                        iX0 = Math.max(iX0, V0(bkh0Var, new ie30(ge30VarA3)));
                        oon1.H("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                x8hVar = x8hVar;
                i = i3;
            }
            cc9Var = new cc9(iMax, iMax2, iX0, false);
        }
        this.t2 = cc9Var;
        int i15 = this.V2 ? this.W2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        x74.n0(mediaFormat, ie30Var.s);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        x74.a0(mediaFormat, "rotation-degrees", ie30Var.C);
        x74.Z(mediaFormat, x8hVar);
        if ("video/dolby-vision".equals(ie30Var.f66p) && (pairC = kwg.c(ie30Var)) != null) {
            x74.a0(mediaFormat, "profile", ((Integer) pairC.first).intValue());
        }
        mediaFormat.setInteger("max-width", cc9Var.a);
        mediaFormat.setInteger("max-height", cc9Var.b);
        x74.a0(mediaFormat, "max-input-size", cc9Var.c);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.l2) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.U2));
        }
        V(mediaFormat);
        Surface surfaceY0 = Y0(bkh0Var);
        if (this.y2 != null && !zoi1.Q(this.h2)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new g2z(bkh0Var, mediaFormat, ie30Var, surfaceY0, mediaCrypto, (Object) null);
    }

    public final void k1(long j) {
        far farVar = this.W1;
        farVar.k += j;
        farVar.l++;
        this.P2 += j;
        this.Q2++;
    }

    @Override // p.dkh0
    public final void l0(gar garVar) {
        ByteBuffer byteBuffer = garVar.g;
        if (byteBuffer != null && byteBuffer.remaining() >= 7) {
            byte b = byteBuffer.get();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            byteBuffer.position(0);
            if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && (b3 == 0 || b3 == 1)) {
                if (this.w2) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    yjh0 yjh0Var = this.m1;
                    yjh0Var.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    yjh0Var.a(bundle);
                    return;
                }
                return;
            }
            if (Build.VERSION.SDK_INT >= 37 && b == -75 && s == 144 && s2 == 1) {
                byteBuffer.position(5);
                int iRemaining = byteBuffer.remaining();
                byte[] bArr2 = new byte[iRemaining];
                byteBuffer.get(bArr2);
                byteBuffer.position(0);
                boolean z = iRemaining > 0;
                this.x2 = z;
                if (z) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putByteArray("hdr-st2094-50-info", bArr2);
                    yjh0 yjh0Var2 = this.m1;
                    yjh0Var2.getClass();
                    yjh0Var2.a(bundle2);
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    @Override // p.dkh0
    public final boolean q0(ie30 ie30Var) throws ExoPlaybackException {
        x1k1 x1k1Var = this.y2;
        if (x1k1Var == null || x1k1Var.isInitialized()) {
            return true;
        }
        try {
            return this.y2.f(ie30Var);
        } catch (VideoSink$VideoSinkException e) {
            throw c(e, ie30Var, false, 7000);
        }
    }

    @Override // p.dkh0
    public final void r0(Exception exc) {
        oon1.w("Video codec error", exc);
        bih1 bih1Var = this.j2;
        Handler handler = (Handler) bih1Var.b;
        if (handler != null) {
            handler.post(new qub1(bih1Var, exc, (byte) 9));
        }
    }

    @Override // p.dkh0
    public final void s0(long j, long j2, String str) {
        String str2;
        boolean z;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        bih1 bih1Var = this.j2;
        Handler handler = (Handler) bih1Var.b;
        if (handler != null) {
            str2 = str;
            handler.post(new r38(bih1Var, str2, j, j2, (byte) 1));
        } else {
            str2 = str;
        }
        this.u2 = U0(str2);
        bkh0 bkh0Var = this.t1;
        bkh0Var.getClass();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(bkh0Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = bkh0Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else {
                    if (codecProfileLevelArr[i].profile == 16384) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
        } else {
            z = false;
            break;
        }
        this.w2 = z;
        if (Build.VERSION.SDK_INT < 37) {
            bkh0 bkh0Var2 = this.t1;
            bkh0Var2.getClass();
            if (bkh0Var2.b.equals("video/av01")) {
                z2 = true;
            }
        }
        this.v2 = z2;
        c1();
    }

    @Override // p.jca
    public final boolean t() {
        if (!this.S1) {
            return false;
        }
        x1k1 x1k1Var = this.y2;
        return x1k1Var == null || x1k1Var.d();
    }

    @Override // p.dkh0
    public final void t0(iwg iwgVar) {
        bih1 bih1Var = this.j2;
        Handler handler = (Handler) bih1Var.b;
        if (handler != null) {
            handler.post(new qub1(bih1Var, iwgVar, (byte) 10));
        }
    }

    @Override // p.dkh0
    public final void u0(String str) {
        bih1 bih1Var = this.j2;
        Handler handler = (Handler) bih1Var.b;
        if (handler != null) {
            handler.post(new qub1(bih1Var, str, (byte) 7));
        }
    }

    @Override // p.jca
    public final boolean v() {
        boolean z;
        boolean zIsReady;
        if (this.e1 == null) {
            z = false;
        } else {
            if (q()) {
                zIsReady = this.N0;
            } else {
                p641 p641Var = this.i;
                p641Var.getClass();
                zIsReady = p641Var.isReady();
            }
            if (!zIsReady && this.D1 < 0) {
                if (this.B1 != -9223372036854775807L) {
                    this.g.getClass();
                    if (SystemClock.elapsedRealtime() < this.B1) {
                    }
                }
                z = false;
            }
            z = true;
        }
        x1k1 x1k1Var = this.y2;
        if (x1k1Var != null) {
            return x1k1Var.k(z);
        }
        if (z && (this.m1 == null || this.V2)) {
            return true;
        }
        return this.m2.b(z);
    }

    @Override // p.dkh0
    public final iar v0(w2z w2zVar) {
        iar iarVarV0 = super.v0(w2zVar);
        this.x2 = false;
        ie30 ie30Var = (ie30) w2zVar.c;
        ie30Var.getClass();
        bih1 bih1Var = this.j2;
        Handler handler = (Handler) bih1Var.b;
        if (handler != null) {
            handler.post(new vqh0((Object) bih1Var, (Object) ie30Var, (Object) iarVarV0, (byte) 19));
        }
        xoj1 xoj1Var = this.r2;
        if (xoj1Var != null) {
            xoj1Var.b();
        }
        return iarVarV0;
    }

    @Override // p.dkh0
    public final void w0(ie30 ie30Var, MediaFormat mediaFormat) {
        int integer;
        int i;
        yjh0 yjh0Var = this.m1;
        if (yjh0Var != null) {
            yjh0Var.k(this.G2);
        }
        if (this.V2) {
            i = ie30Var.w;
            integer = ie30Var.x;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = ie30Var.E;
        int i2 = ie30Var.C;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.S2 = new z1k1(i, integer, f);
        x1k1 x1k1Var = this.y2;
        if (x1k1Var == null || !this.a3) {
            float f2 = ie30Var.B;
            ln20 ln20Var = this.o2;
            ln20Var.f = f2;
            ln20Var.a.c();
            ln20Var.b.c();
            ln20Var.c = false;
            ln20Var.d = -9223372036854775807L;
            ln20Var.e = 0;
            ln20Var.c();
        } else {
            if (i <= 0 || integer <= 0) {
                return;
            }
            ge30 ge30VarA = ie30Var.a();
            ge30VarA.v = i;
            ge30VarA.w = integer;
            ge30VarA.D = f;
            ie30 ie30Var2 = new ie30(ge30VarA);
            int i4 = this.A2;
            List list = this.B2;
            if (list == null) {
                w280 w280Var = b380.b;
                list = bg11.e;
            }
            x1k1Var.o(i4, this.X1.b, list, ie30Var2);
            this.A2 = 2;
        }
        this.a3 = false;
    }

    @Override // p.dkh0, p.jca
    public final void x() {
        far farVar;
        bih1 bih1Var = this.j2;
        this.T2 = null;
        c1();
        this.F2 = false;
        this.X2 = null;
        this.O2 = M0();
        try {
            super.x();
            farVar = this.W1;
            bih1Var.getClass();
            synchronized (farVar) {
            }
        } finally {
            farVar = this.W1;
            bih1Var.getClass();
            synchronized (farVar) {
                Handler handler = (Handler) bih1Var.b;
                if (handler != null) {
                    handler.post(new pwj1(bih1Var, farVar, (byte) 1));
                }
                bih1Var.m(z1k1.d);
            }
        }
    }

    @Override // p.jca
    public final void y(boolean z, boolean z2) {
        x1k1 x1k1Var;
        this.W1 = new far();
        ld21 ld21Var = this.d;
        ld21Var.getClass();
        boolean z3 = ld21Var.b;
        dm5.y((z3 && this.W2 == 0) ? false : true);
        if (this.V2 != z3) {
            this.V2 = z3;
            E0();
        }
        far farVar = this.W1;
        bih1 bih1Var = this.j2;
        Handler handler = (Handler) bih1Var.b;
        if (handler != null) {
            handler.post(new pwj1(bih1Var, farVar, (byte) 0));
        }
        boolean z4 = this.z2;
        c cVar = this.m2;
        if (!z4) {
            if (this.B2 != null && this.y2 == null) {
                o7u0 o7u0Var = new o7u0(this.h2, cVar);
                o7u0Var.d = true;
                long j = this.q2;
                o7u0Var.g = j != -9223372036854775807L ? -j : -9223372036854775807L;
                rdd1 rdd1Var = this.g;
                rdd1Var.getClass();
                o7u0Var.e = rdd1Var;
                dm5.y(!o7u0Var.f);
                if (o7u0Var.c == null) {
                    o7u0Var.c = new dz81();
                }
                u7u0 u7u0Var = new u7u0(o7u0Var);
                o7u0Var.f = true;
                if (1 >= u7u0Var.z) {
                    u7u0Var.z = 1;
                }
                SparseArray sparseArray = u7u0Var.c;
                if (zoi1.l(sparseArray, 0)) {
                    x1k1Var = (x1k1) sparseArray.get(0);
                } else {
                    r7u0 r7u0Var = new r7u0(u7u0Var, u7u0Var.a);
                    u7u0Var.h.add(r7u0Var);
                    sparseArray.put(0, r7u0Var);
                    x1k1Var = r7u0Var;
                }
                this.y2 = x1k1Var;
            }
            this.z2 = true;
        }
        x1k1 x1k1Var2 = this.y2;
        if (x1k1Var2 == null) {
            rdd1 rdd1Var2 = this.g;
            rdd1Var2.getClass();
            cVar.k = rdd1Var2;
            cVar.e(!z2 ? 1 : 0);
            return;
        }
        x1k1Var2.e(new ikh0(this));
        moj1 moj1Var = this.Y2;
        if (moj1Var != null) {
            this.y2.q(moj1Var);
        }
        if (this.C2 != null && !this.E2.equals(l291.c)) {
            this.y2.m(this.C2, this.E2);
        }
        this.y2.r(this.H2);
        this.y2.h(this.k1);
        List list = this.B2;
        if (list != null) {
            this.y2.j(list);
        }
        this.A2 = !z2 ? 1 : 0;
        this.a2 = true;
    }

    @Override // p.dkh0
    public final void y0(long j) {
        super.y0(j);
        if (this.V2) {
            return;
        }
        this.L2--;
    }

    @Override // p.dkh0, p.jca
    public final void z(long j, boolean z, boolean z2) {
        x1k1 x1k1Var = this.y2;
        if (x1k1Var != null && !z) {
            x1k1Var.t(true);
        }
        if (z2) {
            this.N2 = j;
        }
        super.z(j, z, z2);
        x1k1 x1k1Var2 = this.y2;
        c cVar = this.m2;
        if (x1k1Var2 == null) {
            cVar.b.b();
            cVar.f = -9223372036854775807L;
            cVar.e = Math.min(cVar.e, 1);
            cVar.h = -9223372036854775807L;
            cVar.m = false;
        }
        xoj1 xoj1Var = this.r2;
        if (xoj1Var != null) {
            xoj1Var.b();
        }
        if (z) {
            x1k1 x1k1Var3 = this.y2;
            if (x1k1Var3 != null) {
                x1k1Var3.v(false);
            } else {
                cVar.c(false);
            }
        }
        c1();
        this.K2 = 0;
    }

    @Override // p.dkh0
    public final void z0() {
        x1k1 x1k1Var = this.y2;
        if (x1k1Var != null) {
            x1k1Var.a();
            long j = this.Z2;
            if (j == -9223372036854775807L) {
                j = this.X1.b;
                this.Z2 = j;
            }
            this.y2.i(-j);
        } else {
            this.m2.e(2);
        }
        this.a3 = true;
        c1();
    }
}
