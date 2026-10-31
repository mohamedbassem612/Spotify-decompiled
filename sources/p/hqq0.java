package p;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;
import io.reactivex.rxjava3.core.Observable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class hqq0 {
    public static final float[] a = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] b = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static b180 c;

    public static final void A(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1221931517);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, 120.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarR, er31.b(4.0f)), cbx.a(x340Var).a.b.a(), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            Uri uri = Uri.parse(str == null ? "" : str);
            qim0 qim0VarB = h2c.a.b(nim0Var);
            ltx ltxVar = ltx.c;
            eso1.e(uri, isl.a, qim0VarB, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(ltxVar, ltxVar), false, false, x340Var, 1073741872, 0, 3576);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zsd1(str, i, (byte) 7);
        }
    }

    public static final void B(quf1 quf1Var, abu0 abu0Var, iac0 iac0Var, yqg yqgVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1681893127);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(quf1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(abu0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iac0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(yqgVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            String strO0 = cwl1.o0(x340Var, 2131963352);
            qim0 qim0VarU = qxy0.u(nim0.a, null, 3);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new ysf1(strO0, (byte) 2);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarU, false, (iu30) objT);
            if (((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 2) {
                x340Var.i0(-189217789);
                m(quf1Var, abu0Var, iac0Var, yqgVar, iu30Var, qim0VarB, x340Var, i2 & 65534);
                x340Var.r(false);
            } else {
                x340Var.i0(-189110684);
                u(quf1Var, abu0Var, iac0Var, yqgVar, iu30Var, qim0VarB, x340Var, i2 & 65534);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71(quf1Var, abu0Var, iac0Var, false, yqgVar, iu30Var, i, (byte) 14);
        }
    }

    public static final vk80 C(erl1 erl1Var, b0k b0kVar) {
        return poo1.x(new bgc0(erl1Var, 32), b0kVar);
    }

    public static final int D(l0l l0lVar) {
        nnr nnrVar = l0lVar instanceof nnr ? (nnr) l0lVar : null;
        kx7 kx7Var = nnrVar != null ? nnrVar.B.a : null;
        if (kx7Var != null) {
            int iOrdinal = kx7Var.d.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return 4;
                }
                if (iOrdinal == 2) {
                    return 5;
                }
                if (iOrdinal == 3) {
                    return 2;
                }
                if (iOrdinal == 4) {
                    return 6;
                }
                eg.o();
                return 0;
            }
        } else {
            int iC = l1d.C(l0lVar.p());
            if (iC != 0) {
                if (iC == 1) {
                    return 0;
                }
                eg.o();
                return 0;
            }
            if (!l0lVar.l()) {
                return 0;
            }
        }
        return 3;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    public static final boolean E(d030 d030Var, pg pgVar) {
        int iOrdinal = d030Var.L1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                d030 d030VarM = dm5.M(d030Var);
                if (d030VarM == null) {
                    eg.m("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = d030VarM.L1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (E(d030VarM, pgVar) || H(d030Var, d030VarM, 2, pgVar) || (d030VarM.J1().a && ((Boolean) pgVar.invoke(d030VarM)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            eg.o();
                            return false;
                        }
                        eg.m("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return H(d030Var, d030VarM, 2, pgVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    eg.o();
                    return false;
                }
                if (!h0(d030Var, pgVar)) {
                    if (!(d030Var.J1().a ? ((Boolean) pgVar.invoke(d030Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return h0(d030Var, pgVar);
    }

    public static ktm0 F(itm0 itm0Var, boolean z) {
        if (!(itm0Var instanceof ftm0)) {
            return new ktm0(itm0Var, null);
        }
        return new ktm0(htm0.a, new vsm0(((ftm0) itm0Var).a.a, z));
    }

    public static final boolean G(d030 d030Var, pg pgVar) {
        int iOrdinal = d030Var.L1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                d030 d030VarM = dm5.M(d030Var);
                if (d030VarM != null) {
                    return G(d030VarM, pgVar) || H(d030Var, d030VarM, 1, pgVar);
                }
                eg.m("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return d030Var.J1().a ? ((Boolean) pgVar.invoke(d030Var)).booleanValue() : i0(d030Var, pgVar);
                }
                eg.o();
                return false;
            }
        }
        return i0(d030Var, pgVar);
    }

    public static final boolean H(final d030 d030Var, final d030 d030Var2, final int i, final pg pgVar) {
        if (j0(d030Var, d030Var2, i, pgVar)) {
            return true;
        }
        final d030 d030VarH = oap1.C(d030Var).getFocusOwner().h();
        Boolean bool = (Boolean) uap1.q(d030Var, i, new iu30() { // from class: p.jhq0
            public final Object invoke(Object obj) {
                yqa yqaVar = (yqa) obj;
                d030 d030Var3 = d030Var;
                if (d030VarH != oap1.C(d030Var3).getFocusOwner().h()) {
                    return Boolean.TRUE;
                }
                boolean zJ0 = hqq0.j0(d030Var3, d030Var2, i, pgVar);
                Boolean boolValueOf = Boolean.valueOf(zJ0);
                if (zJ0 || !yqaVar.a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final spq0 I(g0l g0lVar) {
        kx7 kx7Var;
        inr inrVar = (inr) g0lVar;
        nnr nnrVarC = inrVar.c();
        nnr nnrVarK = inrVar.k();
        if (((nnrVarK == null || (kx7Var = nnrVarK.B.a) == null) ? null : kx7Var.d) != luq0.e) {
            nnrVarK = null;
        }
        if (nnrVarC == null || (nnrVarK != null && nnrVarC.l())) {
            nnrVarC = nnrVarK;
        }
        return spq0.a(nnrVarC);
    }

    public static final Observable J(g0l g0lVar) {
        inr inrVar = (inr) g0lVar;
        return Observable.combineLatest(inrVar.d(), inrVar.l().map(stf0.V0), olj0.R0);
    }

    public static final Observable K(g0l g0lVar) {
        inr inrVar = (inr) g0lVar;
        return Observable.combineLatest(inrVar.d(), inrVar.l(), pzs0.R0);
    }

    public static final spq0 L(List list) {
        Object obj;
        Object next;
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((l0l) next).isActive());
        l0l l0lVar = (l0l) next;
        if (l0lVar == null) {
            for (Object obj2 : list2) {
                if (((l0l) obj2).l()) {
                    obj = obj2;
                    break;
                }
            }
            l0lVar = (l0l) obj;
        }
        return spq0.a(l0lVar);
    }

    public static final int M(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static String N(nnr nnrVar) {
        kx7 kx7Var = nnrVar.B.a;
        return (kx7Var == null || kx7Var.b()) ? nnrVar.d : kx7Var.a;
    }

    public static final Observable O(g0l g0lVar) {
        inr inrVar = (inr) g0lVar;
        return Observable.combineLatest(inrVar.d(), inrVar.l().map(qzs0.S0), inrVar.j(), rzs0.R0);
    }

    public static final rtt P(l0l l0lVar) {
        up7 up7Var;
        kx7 kx7Var = l0lVar instanceof nnr ? ((nnr) l0lVar).B.a : null;
        if (kx7Var != null) {
            luq0 luq0Var = kx7Var.d;
            luq0 luq0Var2 = luq0.d;
            luq0 luq0Var3 = luq0.c;
            luq0 luq0Var4 = luq0.e;
            if (f46.S0(new luq0[]{luq0Var4, luq0Var2, luq0Var3}).contains(luq0Var)) {
                String str = kx7Var.b;
                f0u f0uVarQ = Q(kx7Var);
                int i = 0;
                if (luq0Var == luq0Var4 && (up7Var = kx7Var.e) != null) {
                    i = up7Var.a;
                }
                return new rtt(str, luq0Var, f0uVarQ, i);
            }
        }
        return null;
    }

    public static final f0u Q(kx7 kx7Var) {
        up7 up7Var;
        luq0 luq0Var = kx7Var != null ? kx7Var.d : null;
        int i = luq0Var == null ? -1 : f1l.a[luq0Var.ordinal()];
        if (i == -1 || i == 1) {
            return f0u.d;
        }
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    int i2 = (kx7Var == null || (up7Var = kx7Var.e) == null) ? 0 : up7Var.a;
                    switch (i2 != 0 ? f1l.b[l1d.C(i2)] : -1) {
                        case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                        case 1:
                        case 5:
                        case 7:
                            break;
                        case 0:
                        default:
                            eg.o();
                            return null;
                        case 2:
                            break;
                        case 3:
                            return f0u.N0;
                        case 4:
                            return f0u.R0;
                        case 6:
                            return f0u.e;
                    }
                } else if (i != 5) {
                    eg.o();
                    return null;
                }
            }
            return f0u.Z;
        }
        return f0u.a;
    }

    public static final String R(nnr nnrVar) {
        kx7 kx7Var = nnrVar.B.a;
        if (kx7Var == null || kx7Var.b()) {
            return nnrVar.o;
        }
        up7 up7Var = kx7Var.e;
        return up7Var != null ? up7Var.b : "UNKNOWN";
    }

    public static final int S(l0l l0lVar) {
        kx7 kx7Var;
        up7 up7Var;
        nnr nnrVar = l0lVar instanceof nnr ? (nnr) l0lVar : null;
        if (nnrVar == null || (kx7Var = nnrVar.B.a) == null || (up7Var = kx7Var.e) == null) {
            return 0;
        }
        return up7Var.a;
    }

    public static final f0u T(l0l l0lVar) {
        nnr nnrVar = l0lVar instanceof nnr ? (nnr) l0lVar : null;
        kx7 kx7Var = nnrVar != null ? nnrVar.B.a : null;
        return kx7Var != null ? Q(kx7Var) : l0lVar.getType();
    }

    public static final String U(nnr nnrVar) {
        kx7 kx7Var = nnrVar.B.a;
        if (kx7Var == null || kx7Var.b()) {
            return nnrVar.o;
        }
        up7 up7Var = kx7Var.e;
        return up7Var != null ? up7Var.c : "UNKNOWN";
    }

    public static final String V(l0l l0lVar) {
        nnr nnrVar = l0lVar instanceof nnr ? (nnr) l0lVar : null;
        kx7 kx7Var = nnrVar != null ? nnrVar.B.a : null;
        return (kx7Var == null || kx7Var.b()) ? l0lVar.getName() : kx7Var.b;
    }

    public static final String W(Method method) {
        return method.getName() + f46.s0(method.getParameterTypes(), "", "(", ")", j141.b, 24) + bb11.b(method.getReturnType());
    }

    public static final boolean X(l0l l0lVar) {
        nnr nnrVar = l0lVar instanceof nnr ? (nnr) l0lVar : null;
        kx7 kx7Var = nnrVar != null ? nnrVar.B.a : null;
        return kx7Var != null && kx7Var.d == luq0.d;
    }

    public static final boolean Y(l0l l0lVar) {
        boolean z = l0lVar.getType() == f0u.X || l0lVar.getType() == f0u.Y;
        if (!z) {
            for (t880 t880Var : l0lVar.h()) {
                String str = t880Var.a;
                if (str.equals("CAST") || str.equals("CAST_JS")) {
                    return t880Var.c;
                }
            }
        }
        return z;
    }

    public static final boolean Z(l0l l0lVar) {
        kx7 kx7Var;
        up7 up7Var;
        nnr nnrVar = l0lVar instanceof nnr ? (nnr) l0lVar : null;
        int i = (nnrVar == null || (kx7Var = nnrVar.B.a) == null || (up7Var = kx7Var.e) == null) ? 0 : up7Var.a;
        if ((i == 0 ? -1 : f1l.b[l1d.C(i)]) == 2) {
            return true;
        }
        return (l0lVar != null ? l0lVar.getType() : null) == f0u.Z;
    }

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, hux huxVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1797862491);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.i(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gra graVar = een.h;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
            ogx ogxVar = ogx.e;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                cwl1.b(qim0Var2, graVar, (hw61) null, ogxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(str), function0), (gbx) null, apo.r(-290898148, new cex((Object) huxVar, (Object) str, (byte) 29), b0kVar3), b0kVar2, (i2 >> 6) & 14, 48, 1508);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new glf(str, huxVar, qim0Var, function0, i, (byte) 3);
        }
    }

    public static final boolean a0(l0l l0lVar) {
        up7 up7Var;
        nnr nnrVar = l0lVar instanceof nnr ? (nnr) l0lVar : null;
        kx7 kx7Var = nnrVar != null ? nnrVar.B.a : null;
        return ((kx7Var == null || (up7Var = kx7Var.e) == null) ? 0 : up7Var.a) == 3;
    }

    public static final void b(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1114334525);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131956932);
            fux fuxVar = fux.c;
            if (0.5f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarN = anm1.N("endJamButton", new wnb0(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true));
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new zi80(iu30Var, (byte) 27);
                x340Var.s0(objT);
            }
            a(fux.d << 3, strO0, (Function0) objT, x340Var, fuxVar, qim0VarN);
            String strO1 = cwl1.o0(x340Var, 2131956933);
            knx knxVar = knx.c;
            if (0.5f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarN2 = anm1.N("guestSettingsButton", new wnb0(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true));
            boolean z2 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new zi80(iu30Var, (byte) 28);
                x340Var.s0(objT2);
            }
            a(knx.d << 3, strO1, (Function0) objT2, x340Var, knxVar, qim0VarN2);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 19, i, iu30Var, false);
        }
    }

    public static final boolean b0(l0l l0lVar) {
        up7 up7Var;
        nnr nnrVar = l0lVar instanceof nnr ? (nnr) l0lVar : null;
        kx7 kx7Var = nnrVar != null ? nnrVar.B.a : null;
        return ((kx7Var == null || (up7Var = kx7Var.e) == null) ? 0 : up7Var.a) == 4;
    }

    public static final void c(y5a0 y5a0Var, String str, gx90 gx90Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1647200451);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(y5a0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(gx90Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("autoInviteNearbySection", nim0.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            otw.c(y5a0Var, new w5a0(str, gx90Var.a, new x5a0(gx90Var.b, 11)), (qim0) null, (ipb1) null, x340Var, i2 & 14, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60((Object) y5a0Var, (Object) str, (Object) gx90Var, i, (byte) 14);
        }
    }

    public static final boolean c0(l0l l0lVar) {
        nnr nnrVar = l0lVar instanceof nnr ? (nnr) l0lVar : null;
        kx7 kx7Var = nnrVar != null ? nnrVar.B.a : null;
        return kx7Var != null ? kx7Var.b() : l0lVar.l();
    }

    public static final void d(m7c m7cVar, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-190071950);
        int i2 = (x340Var.g(m7cVar) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            jap1.l(uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, qim0VarF), (qim0) null, m7cVar.a, m7cVar.b, m7cVar.c, new gbx(z50.c, function0), new idx(4), (vu30) null, x340Var, 0, 386);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6(m7cVar, qim0Var, function0, i, (byte) 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0216  */
    public static final long d0(int i, int i2, String str) {
        char cCharAt;
        int i3;
        long j;
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j2;
        char c4;
        int i9;
        int i10;
        int i11;
        int i12;
        long j3 = 4294967295L;
        if (i == i2) {
            return (((long) i) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
        }
        char cCharAt2 = str.charAt(i);
        boolean z = cCharAt2 == '-';
        if (z) {
            i3 = i + 1;
            if (i3 == i2) {
                return (((long) i3) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
            cCharAt = str.charAt(i3);
            if (((char) (cCharAt - '0')) >= '\n' && cCharAt != '.') {
                return (((long) i3) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
        } else {
            cCharAt = cCharAt2;
            i3 = i;
        }
        int length = str.length();
        int i13 = i3;
        long j4 = 0;
        while (true) {
            if (i13 == i2) {
                j = j3;
                break;
            }
            j = j3;
            int i14 = cCharAt - '0';
            if (((char) i14) >= '\n') {
                break;
            }
            j4 = (j4 * 10) + ((long) i14);
            i13++;
            cCharAt = i13 < length ? str.charAt(i13) : (char) 0;
            j3 = j;
        }
        int i15 = i13 - i3;
        char c5 = '0';
        if (i13 == i2 || cCharAt != '.') {
            c2 = ' ';
            c3 = 1;
            i4 = i13;
            i5 = i4;
            i6 = 0;
        } else {
            int i16 = i13 + 1;
            c2 = ' ';
            i4 = i16;
            while (true) {
                c3 = 1;
                if (i2 - i4 < 4) {
                    i12 = i16;
                    break;
                }
                i12 = i16;
                long jCharAt = ((long) str.charAt(i4)) | (((long) str.charAt(i4 + 1)) << 16) | (((long) str.charAt(i4 + 2)) << 32) | (((long) str.charAt(i4 + 3)) << 48);
                long j5 = jCharAt - 13511005043687472L;
                int i17 = (((jCharAt + 19703549022044230L) | j5) & (-35747867511423104L)) != 0 ? -1 : (int) ((j5 * 281475406208040961L) >>> 48);
                if (i17 < 0) {
                    break;
                }
                j4 = (j4 * 10000) + ((long) i17);
                i4 += 4;
                i16 = i12;
            }
            char cCharAt3 = i4 < length ? str.charAt(i4) : (char) 0;
            loop2: while (true) {
                cCharAt = cCharAt3;
                while (true) {
                    if (i4 == i2) {
                        break loop2;
                    }
                    int i18 = cCharAt - '0';
                    if (((char) i18) >= '\n') {
                        break loop2;
                    }
                    j4 = (j4 * 10) + ((long) i18);
                    i4++;
                    if (i4 < length) {
                        break;
                    }
                    cCharAt = 0;
                }
                cCharAt3 = str.charAt(i4);
            }
            i6 = i12 - i4;
            i15 -= i6;
            i5 = i12;
        }
        if (i15 == 0) {
            return (((long) i4) << c2) | (((long) Float.floatToRawIntBits(Float.NaN)) & j);
        }
        if ((cCharAt | ' ') == 101) {
            i7 = i4 + 1;
            char cCharAt4 = i7 < length ? str.charAt(i7) : (char) 0;
            char c6 = cCharAt4 == '-' ? c3 : (char) 0;
            if (c6 != 0 || cCharAt4 == '+') {
                i7 = i4 + 2;
            }
            char cCharAt5 = str.charAt(i7);
            i8 = 0;
            while (true) {
                if (i7 == i2) {
                    i11 = i6;
                    break;
                }
                int i19 = cCharAt5 - c5;
                i11 = i6;
                if (((char) i19) >= '\n') {
                    break;
                }
                if (i8 < 1024) {
                    i8 = (i8 * 10) + i19;
                }
                i7++;
                cCharAt5 = i7 < length ? str.charAt(i7) : (char) 0;
                i6 = i11;
                c5 = '0';
            }
            if (c6 != 0) {
                i8 = -i8;
            }
            i6 = i11 + i8;
        } else {
            i7 = i4;
            i8 = 0;
        }
        int i20 = 19;
        if (i15 > 19) {
            char cCharAt6 = str.charAt(i3);
            int i21 = i3;
            while (true) {
                if (i7 == i2) {
                    i9 = i20;
                    break;
                }
                if (cCharAt6 != '0' && cCharAt6 != '.') {
                    i9 = 19;
                    break;
                }
                if (cCharAt6 == '0') {
                    i15--;
                }
                i21++;
                cCharAt6 = i21 < length ? str.charAt(i21) : (char) 0;
                i20 = 19;
            }
            if (i15 > i9) {
                char cCharAt7 = str.charAt(i3);
                long j6 = 0;
                while (true) {
                    i10 = i3;
                    if (i3 == i13 || Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                        break;
                    }
                    j6 = (j6 * 10) + ((long) (cCharAt7 - '0'));
                    i3 = i10 + 1;
                    cCharAt7 = i3 < length ? str.charAt(i3) : (char) 0;
                }
                if (Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                    i6 = (i13 - i10) + i8;
                } else {
                    char cCharAt8 = str.charAt(i5);
                    int i22 = i5;
                    while (i22 != i4 && Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                        j6 = (j6 * 10) + ((long) (cCharAt8 - '0'));
                        i22++;
                        cCharAt8 = i22 < length ? str.charAt(i22) : (char) 0;
                    }
                    i6 = (i5 - i22) + i8;
                }
                j2 = j6;
                c4 = c3;
            } else {
                j2 = j4;
                c4 = 0;
            }
        } else {
            j2 = j4;
            c4 = 0;
        }
        if (-10 <= i6 && i6 < 11 && c4 == 0 && Long.compare(j2 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
            float f = j2;
            float[] fArr = a;
            float f2 = i6 < 0 ? f / fArr[-i6] : f * fArr[i6];
            if (z) {
                f2 = -f2;
            }
            return (((long) i7) << c2) | (((long) Float.floatToRawIntBits(f2)) & j);
        }
        if (j2 == 0) {
            return (((long) i7) << c2) | (((long) Float.floatToRawIntBits(z ? -0.0f : 0.0f)) & j);
        }
        if (-126 > i6 || i6 >= 128) {
            return (((long) i7) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        long j7 = b[i6 + 325];
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
        long j8 = j2 << iNumberOfLeadingZeros;
        long j9 = j8 & j;
        long j10 = j8 >>> c2;
        long j11 = j7 & j;
        long j12 = j7 >>> c2;
        long j13 = j10 * j12;
        long j14 = j12 * j9;
        long j15 = j13 + ((((j10 * j11) + ((j9 * j11) >>> c2)) + (j14 & j)) >>> c2) + (j14 >>> c2);
        int i23 = (int) (j15 >>> 63);
        long j16 = j15 >>> (i23 + 9);
        int i24 = iNumberOfLeadingZeros + (i23 ^ 1);
        long j17 = j15 & 511;
        if (j17 == 511 || (j17 == 0 && (3 & j16) == 1)) {
            return (((long) i7) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        long j18 = (j16 + 1) >>> c3;
        if (j18 >= 9007199254740992L) {
            i24--;
            j18 = 4503599627370496L;
        }
        long j19 = j18 & (-4503599627370497L);
        long j20 = (((((long) i6) * 217706) >> 16) + 1087) - ((long) i24);
        if (j20 < 1 || j20 > 2046) {
            return (((long) i7) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        return (((long) i7) << c2) | (((long) Float.floatToRawIntBits((float) Double.longBitsToDouble((j20 << 52) | j19 | (z ? Long.MIN_VALUE : 0L)))) & j);
    }

    public static final void e(quf1 quf1Var, int i, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        iu30 iu30Var2 = iu30Var;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1290512301);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar2.i(quf1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar2.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar2.i(iu30Var2) ? 256 : 128;
        }
        if (b0kVar2.Y(i3 & 1, (i3 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, i == 3 ? een.Q0 : een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String strO0 = cwl1.o0(b0kVar2, quf1Var.d);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).e;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bpf1.a1;
                b0kVar2.s0(objT);
            }
            int i4 = (i3 << 9) & 57344;
            int i5 = i3;
            uwo1.e(strO0, s161.b(qim0VarF2, false, (iu30) objT), lee1Var, 0L, new a0e1(i), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, i4, 0, 2024);
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 8.0f));
            uwo1.e(cwl1.o0(b0kVar2, quf1Var.e), u291.f(nim0Var, 1.0f), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(i), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, i4, 0, 2016);
            b0kVar2 = b0kVar2;
            op71.g(b0kVar2, u291.h(nim0Var, cbx.b(b0kVar2).b.b));
            boolean z = (i5 & 896) == 256;
            Object objT2 = b0kVar2.T();
            if (z || objT2 == m4cVar) {
                objT2 = new fgf1(iu30Var, (byte) 6);
                b0kVar2.s0(objT2);
            }
            iu30Var2 = iu30Var;
            foo1.c(new gbx(z50.c, (Function0) objT2), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-851290088, new wcf1(quf1Var, (byte) 11), b0kVar2), b0kVar2, 0, 48, 2044);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ux1(quf1Var, i, iu30Var2, i2);
        }
    }

    public static final k1r e0(k1r k1rVar) {
        if (!(k1rVar instanceof h1r)) {
            return k1rVar;
        }
        wyq wyqVar = ((h1r) k1rVar).a;
        wyq wyqVar2 = wyqVar instanceof wyq ? wyqVar : null;
        return u890.j(wyqVar2 != null ? wyqVar2.b : null, c3r.a) ? new i1r(new qaa1(false), (Integer) null) : k1rVar;
    }

    public static final void f(sru sruVar, gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        p1v p1vVar = sruVar.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1986906614);
        int i4 = i | (x340Var.g(sruVar) ? 4 : 2) | (x340Var.g(gbxVar) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (x340Var.g(qim0Var) ? 256 : 128);
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = i5 != 0 ? nim0.a : qim0Var;
            if (p1vVar.equals(m1v.a)) {
                x340Var.i0(1304997464);
                x340Var.r(false);
            } else {
                x340Var.i0(1304512159);
                String strQ = rwq0.q((Context) x340Var.k(AndroidCompositionLocals_androidKt.b), sruVar);
                strQ.getClass();
                hax haxVar = p1vVar.equals(f1v.a) ? new hax(strQ) : jax.a;
                boolean zG = x340Var.g(strQ);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new i3o(strQ, (byte) 19);
                    x340Var.s0(objT);
                }
                dxo1.f(gbxVar, s161.b(qim0Var3, false, (iu30) objT), haxVar, (gdx) null, apo.r(-1692423043, new utt(sruVar, (byte) 4), x340Var), x340Var, ((i3 >> 3) & 14) | 1572864, 52);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(sruVar, gbxVar, qim0Var2, i, i2, (byte) 8);
        }
    }

    public static final boolean f0(d030 d030Var, int i, pg pgVar) {
        if (i == 1) {
            return G(d030Var, pgVar);
        }
        if (i == 2) {
            return E(d030Var, pgVar);
        }
        eg.m("This function should only be used for 1-D focus search");
        return false;
    }

    public static final void g(p1v p1vVar, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(380518363);
        int i4 = (x340Var.g(p1vVar) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (x340Var.g(qim0Var) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                qim0Var = nim0.a;
            }
            n(p1vVar, qim0Var, x340Var, i3 & 126);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(p1vVar, qim0Var2, i, i2, (byte) 5);
        }
    }

    public static final k1r g0(d0r d0rVar, o3r o3rVar, Object obj) {
        k1r k1rVarB = d0rVar.b(o3rVar.a(obj));
        return k1rVarB instanceof h1r ? j1r.a : k1rVarB;
    }

    public static final void h(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(523425630);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        nim0 nim0Var = nim0.a;
        int i3 = i2 | (x340Var.i(nim0Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            y(x340Var, 0);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("leaveJamButton", uyn1.z(0.0f, 8.0f, 1, nim0Var));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            gra graVar = een.g;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            String strO0 = cwl1.o0(x340Var, 2131956937);
            boolean z2 = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new zi80(iu30Var, (byte) 29);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                cwl1.b((qim0) null, graVar, (hw61) null, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, vti.a, x340Var, 0, 48, 1517);
                x340Var.r(true);
                x340Var.r(true);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d720(iu30Var, i, (byte) 16);
        }
    }

    public static final boolean h0(d030 d030Var, pg pgVar) {
        Object[] objArr = new d030[16];
        if (!((pim0) d030Var).a.N0) {
            qf80.c("visitChildren called on an unattached node");
        }
        bfn0 bfn0Var = new bfn0(0, new pim0[16]);
        pim0 pim0Var = ((pim0) d030Var).a;
        pim0 pim0Var2 = pim0Var.f;
        if (pim0Var2 == null) {
            oap1.g(bfn0Var, pim0Var);
        } else {
            bfn0Var.b(pim0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = bfn0Var.c;
            if (i2 == 0) {
                break;
            }
            pim0 pim0VarS = (pim0) bfn0Var.l(i2 - 1);
            if ((pim0VarS.d & 1024) == 0) {
                oap1.g(bfn0Var, pim0VarS);
            } else {
                while (pim0VarS != null) {
                    if ((pim0VarS.c & 1024) != 0) {
                        bfn0 bfn0Var2 = null;
                        while (pim0VarS != null) {
                            if (pim0VarS instanceof d030) {
                                d030 d030Var2 = (d030) pim0VarS;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = d030Var2;
                                i = i3;
                            } else if ((pim0VarS.c & 1024) != 0 && (pim0VarS instanceof l5t)) {
                                int i4 = 0;
                                for (pim0 pim0Var3 = ((l5t) pim0VarS).P0; pim0Var3 != null; pim0Var3 = pim0Var3.f) {
                                    if ((pim0Var3.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            pim0VarS = pim0Var3;
                                        } else {
                                            if (bfn0Var2 == null) {
                                                bfn0Var2 = new bfn0(0, new pim0[16]);
                                            }
                                            if (pim0VarS != null) {
                                                bfn0Var2.b(pim0VarS);
                                                pim0VarS = null;
                                            }
                                            bfn0Var2.b(pim0Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            pim0VarS = oap1.s(bfn0Var2);
                        }
                        break;
                    }
                    pim0VarS = pim0VarS.f;
                }
            }
        }
        Arrays.sort(objArr, 0, i, k0d.e);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                d030 d030Var3 = (d030) objArr[i5];
                if (dm5.R(d030Var3) && E(d030Var3, pgVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final void i(hx90 hx90Var, y5a0 y5a0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1502325892);
        int i2 = (x340Var.i(hx90Var) ? 4 : 2) | i | (x340Var.i(y5a0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        nim0 nim0Var = nim0.a;
        int i3 = i2 | (x340Var.i(nim0Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            y(x340Var, 0);
            gx90 gx90Var = hx90Var.e;
            if (gx90Var == null) {
                x340Var.i0(-159955643);
                x340Var.r(false);
            } else {
                x340Var.i0(-159955642);
                c(y5a0Var, hx90Var.b.a, gx90Var, x340Var, (i3 >> 3) & 14);
                x340Var.r(false);
            }
            b(iu30Var, x340Var, (i3 >> 6) & 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(hx90Var, y5a0Var, iu30Var, i, (byte) 8);
        }
    }

    public static final boolean i0(d030 d030Var, pg pgVar) {
        Object[] objArr = new d030[16];
        if (!((pim0) d030Var).a.N0) {
            qf80.c("visitChildren called on an unattached node");
        }
        bfn0 bfn0Var = new bfn0(0, new pim0[16]);
        pim0 pim0Var = ((pim0) d030Var).a;
        pim0 pim0Var2 = pim0Var.f;
        if (pim0Var2 == null) {
            oap1.g(bfn0Var, pim0Var);
        } else {
            bfn0Var.b(pim0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = bfn0Var.c;
            if (i2 == 0) {
                break;
            }
            pim0 pim0VarS = (pim0) bfn0Var.l(i2 - 1);
            if ((pim0VarS.d & 1024) == 0) {
                oap1.g(bfn0Var, pim0VarS);
            } else {
                while (pim0VarS != null) {
                    if ((pim0VarS.c & 1024) != 0) {
                        bfn0 bfn0Var2 = null;
                        while (pim0VarS != null) {
                            if (pim0VarS instanceof d030) {
                                d030 d030Var2 = (d030) pim0VarS;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = d030Var2;
                                i = i3;
                            } else if ((pim0VarS.c & 1024) != 0 && (pim0VarS instanceof l5t)) {
                                int i4 = 0;
                                for (pim0 pim0Var3 = ((l5t) pim0VarS).P0; pim0Var3 != null; pim0Var3 = pim0Var3.f) {
                                    if ((pim0Var3.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            pim0VarS = pim0Var3;
                                        } else {
                                            if (bfn0Var2 == null) {
                                                bfn0Var2 = new bfn0(0, new pim0[16]);
                                            }
                                            if (pim0VarS != null) {
                                                bfn0Var2.b(pim0VarS);
                                                pim0VarS = null;
                                            }
                                            bfn0Var2.b(pim0Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            pim0VarS = oap1.s(bfn0Var2);
                        }
                        break;
                    }
                    pim0VarS = pim0VarS.f;
                }
            }
        }
        Arrays.sort(objArr, 0, i, k0d.e);
        for (int i5 = 0; i5 < i; i5++) {
            d030 d030Var3 = (d030) objArr[i5];
            if (dm5.R(d030Var3) && G(d030Var3, pgVar)) {
                return true;
            }
        }
        return false;
    }

    public static final void j(jx90 jx90Var, y5a0 y5a0Var, tob1 tob1Var, iu30 iu30Var, d6o0 d6o0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1011608378);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(jx90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(y5a0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(tob1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(d6o0Var) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            b0kVar2 = b0kVar3;
            ggo1.s(tob1Var, apo.r(-1804121971, new mb90(jx90Var, y5a0Var, iu30Var), b0kVar3), (qim0) null, 0.0f, 0L, (iu30) null, apo.r(-672621228, new cy00(jx90Var, iu30Var, d6o0Var), b0kVar3), b0kVar2, ((i3 >> 6) & 14) | 1572912, 60);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(jx90Var, y5a0Var, tob1Var, iu30Var, d6o0Var, qim0Var2, i, (byte) 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
      0x013a: PHI (r13v13 p.pim0) = (r13v7 p.pim0), (r13v14 p.pim0) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    public static final boolean j0(d030 d030Var, d030 d030Var2, int i, pg pgVar) {
        pim0 pim0Var;
        pim0 pim0Var2;
        hmb0 hmb0VarB;
        jdo0 jdo0Var;
        pim0 pim0VarS;
        bfn0 bfn0Var;
        if (d030Var.L1() != wz20.b) {
            eg.m("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new d030[16];
        if (!((pim0) d030Var).a.N0) {
            qf80.c("visitChildren called on an unattached node");
        }
        bfn0 bfn0Var2 = new bfn0(0, new pim0[16]);
        pim0 pim0Var3 = ((pim0) d030Var).a;
        pim0 pim0Var4 = pim0Var3.f;
        if (pim0Var4 == null) {
            oap1.g(bfn0Var2, pim0Var3);
        } else {
            bfn0Var2.b(pim0Var4);
        }
        int i2 = 0;
        while (true) {
            int i3 = bfn0Var2.c;
            pim0Var = null;
            if (i3 == 0) {
                break;
            }
            pim0 pim0VarS2 = (pim0) bfn0Var2.l(i3 - 1);
            if ((pim0VarS2.d & 1024) == 0) {
                oap1.g(bfn0Var2, pim0VarS2);
            } else {
                while (pim0VarS2 != null) {
                    if ((pim0VarS2.c & 1024) != 0) {
                        bfn0 bfn0Var3 = null;
                        while (pim0VarS2 != null) {
                            if (pim0VarS2 instanceof d030) {
                                d030 d030Var3 = (d030) pim0VarS2;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = d030Var3;
                                i2 = i4;
                            } else if ((pim0VarS2.c & 1024) != 0 && (pim0VarS2 instanceof l5t)) {
                                int i5 = 0;
                                for (pim0 pim0Var5 = ((l5t) pim0VarS2).P0; pim0Var5 != null; pim0Var5 = pim0Var5.f) {
                                    if ((pim0Var5.c & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            pim0VarS2 = pim0Var5;
                                        } else {
                                            if (bfn0Var3 == null) {
                                                bfn0Var3 = new bfn0(0, new pim0[16]);
                                            }
                                            if (pim0VarS2 != null) {
                                                bfn0Var3.b(pim0VarS2);
                                                pim0VarS2 = null;
                                            }
                                            bfn0Var3.b(pim0Var5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            pim0VarS2 = oap1.s(bfn0Var3);
                        }
                        break;
                    }
                    pim0VarS2 = pim0VarS2.f;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, k0d.e);
        if (i != 1) {
            if (i != 2) {
                eg.m("This function should only be used for 1-D focus search");
                return false;
            }
            tr80 tr80VarQ = yoi1.Q(0, i2);
            int i6 = ((rr80) tr80VarQ).a;
            int i7 = ((rr80) tr80VarQ).b;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        d030 d030Var4 = (d030) objArr[i7];
                        if (dm5.R(d030Var4) && E(d030Var4, pgVar)) {
                            return true;
                        }
                    }
                    if (u890.j(objArr[i7], d030Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!((pim0) d030Var).a.N0) {
                    qf80.c("visitAncestors called on an unattached node");
                }
                pim0Var2 = ((pim0) d030Var).a.e;
                hmb0VarB = oap1.B(d030Var);
                loop5: while (hmb0VarB != null) {
                    if ((((pim0) hmb0VarB.e1.g).d & 1024) != 0) {
                        while (pim0Var2 != null) {
                            if ((pim0Var2.c & 1024) != 0) {
                                pim0VarS = pim0Var2;
                                bfn0Var = null;
                                while (pim0VarS != null) {
                                    if (pim0VarS instanceof d030) {
                                        pim0Var = pim0VarS;
                                        break loop5;
                                    }
                                    if ((pim0VarS.c & 1024) == 0) {
                                    }
                                    pim0VarS = oap1.s(bfn0Var);
                                }
                            }
                            pim0Var2 = pim0Var2.e;
                        }
                    }
                    hmb0VarB = hmb0VarB.v();
                    if (hmb0VarB != null) {
                    }
                }
                if (pim0Var != null) {
                    return ((Boolean) pgVar.invoke(d030Var)).booleanValue();
                }
            }
            return false;
        }
        tr80 tr80VarQ2 = yoi1.Q(0, i2);
        int i8 = ((rr80) tr80VarQ2).a;
        int i9 = ((rr80) tr80VarQ2).b;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    d030 d030Var5 = (d030) objArr[i8];
                    if (dm5.R(d030Var5) && G(d030Var5, pgVar)) {
                        return true;
                    }
                }
                if (u890.j(objArr[i8], d030Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && d030Var.J1().a) {
            if (!((pim0) d030Var).a.N0) {
                qf80.c("visitAncestors called on an unattached node");
            }
            pim0Var2 = ((pim0) d030Var).a.e;
            hmb0VarB = oap1.B(d030Var);
            loop5: while (hmb0VarB != null) {
                if ((((pim0) hmb0VarB.e1.g).d & 1024) != 0) {
                    while (pim0Var2 != null) {
                        if ((pim0Var2.c & 1024) != 0) {
                            pim0VarS = pim0Var2;
                            bfn0Var = null;
                            while (pim0VarS != null) {
                                if (pim0VarS instanceof d030) {
                                    pim0Var = pim0VarS;
                                    break loop5;
                                }
                                if ((pim0VarS.c & 1024) == 0 && (pim0VarS instanceof l5t)) {
                                    int i10 = 0;
                                    for (pim0 pim0Var6 = ((l5t) pim0VarS).P0; pim0Var6 != null; pim0Var6 = pim0Var6.f) {
                                        if ((pim0Var6.c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                pim0VarS = pim0Var6;
                                            } else {
                                                if (bfn0Var == null) {
                                                    bfn0Var = new bfn0(0, new pim0[16]);
                                                }
                                                if (pim0VarS != null) {
                                                    bfn0Var.b(pim0VarS);
                                                    pim0VarS = null;
                                                }
                                                bfn0Var.b(pim0Var6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                pim0VarS = oap1.s(bfn0Var);
                            }
                        }
                        pim0Var2 = pim0Var2.e;
                    }
                }
                hmb0VarB = hmb0VarB.v();
                pim0Var2 = (hmb0VarB != null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
            }
            if (pim0Var != null) {
                return ((Boolean) pgVar.invoke(d030Var)).booleanValue();
            }
        }
        return false;
    }

    public static final void k(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-470006882);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("inviteFriendsRow", nim0.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            zzq0 zzq0VarH = uyn1.h(1, 0.0f, 12.0f);
            String strO0 = cwl1.o0(x340Var, 2131956934);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ux90(iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            cwl1.b(qim0VarN, (tl3) null, (hw61) null, (pgx) null, zzq0VarH, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, vti.b, x340Var, 0, 48, 1518);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d720(iu30Var, i, (byte) 17);
        }
    }

    public static final k1r k0(k1r k1rVar, k1r k1rVar2, vu30 vu30Var) {
        Object obj = null;
        if ((k1rVar instanceof i1r) && (k1rVar2 instanceof i1r)) {
            return new i1r(vu30Var.invoke(((i1r) k1rVar).a, ((i1r) k1rVar2).a), (Integer) null);
        }
        List listM = p7h.M(new k1r[]{k1rVar, k1rVar2});
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listM) {
            if (obj2 instanceof h1r) {
                arrayList.add(obj2);
            }
        }
        for (Object obj3 : arrayList) {
            if (zjy.a(2, (h1r) obj3)) {
                obj = obj3;
                break;
            }
        }
        h1r h1rVar = (h1r) obj;
        return h1rVar != null ? h1rVar : j1r.a;
    }

    public static final void l(lx90 lx90Var, tob1 tob1Var, d6o0 d6o0Var, y5a0 y5a0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-415260206);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(lx90Var) : x340Var.i(lx90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(tob1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(d6o0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(y5a0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.b0();
        } else if (lx90Var instanceof kx90) {
            x340Var.i0(-1510703666);
            x340Var.r(false);
        } else {
            if (!(lx90Var instanceof jx90)) {
                throw p3d1.k(x340Var, 366908599, false);
            }
            x340Var.i0(366910765);
            j((jx90) lx90Var, y5a0Var, tob1Var, iu30Var, d6o0Var, null, x340Var, (i2 & 14) | ((i2 >> 6) & 112) | ((i2 << 3) & 896) | ((i2 >> 3) & 7168) | ((i2 << 6) & 57344));
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 23, i, (Object) lx90Var, (Object) tob1Var, (Object) d6o0Var, (Object) y5a0Var, (Object) iu30Var);
        }
    }

    public static final f0u l0(g0u g0uVar) {
        switch (g0uVar.ordinal()) {
            case 0:
                return f0u.a;
            case 1:
                return f0u.b;
            case 2:
                return f0u.c;
            case 3:
                return f0u.d;
            case 4:
                return f0u.e;
            case 5:
                return f0u.f;
            case 6:
                return f0u.g;
            case 7:
                return f0u.h;
            case 8:
                return f0u.i;
            case 9:
                return f0u.t;
            case 10:
                return f0u.X;
            case 11:
                return f0u.Y;
            case 12:
                return f0u.Z;
            case 13:
                return f0u.N0;
            case 14:
                return f0u.O0;
            case 15:
                return f0u.P0;
            case 16:
                return f0u.Q0;
            default:
                eg.o();
                return null;
        }
    }

    public static final void m(quf1 quf1Var, abu0 abu0Var, iac0 iac0Var, yqg yqgVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        iac0 iac0Var2;
        yqg yqgVar2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1917494887);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(quf1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(abu0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            iac0Var2 = iac0Var;
            i2 |= x340Var.i(iac0Var2) ? 256 : 128;
        } else {
            iac0Var2 = iac0Var;
        }
        if ((i & 3072) == 0) {
            yqgVar2 = yqgVar;
            i2 |= x340Var.g(yqgVar2) ? 2048 : 1024;
        } else {
            yqgVar2 = yqgVar;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarH = l6o1.H(dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), d4o1.a), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarX = uyn1.x(x0d.p(lhc.g(x340Var).g, 32, qim0VarH), cbx.b(x340Var).e.b);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            d7e.g(0, 1, x340Var, (qim0) null);
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarO = ab80.o(nim0Var, 16.0f, x340Var, nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarO);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarC = u291.c(u291.v(nim0Var, 120.0f), 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarC);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            int i4 = i3 & 14;
            v(quf1Var, abu0Var, iac0Var2, yqgVar2, x340Var, i3 & 8190);
            x340Var.r(true);
            wnb0 wnb0VarK = c13.k(nim0Var, cbx.b(x340Var).b.c, x340Var, 1.0f, true);
            mbh mbhVarA2 = jbh.a(h36.e, een.P0, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, wnb0VarK);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            iu30Var2 = iu30Var;
            e(quf1Var, 5, iu30Var2, x340Var, ((i3 >> 6) & 896) | i4);
            us71.m(x340Var, true, true, true);
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new huf1(quf1Var, abu0Var, iac0Var, yqgVar, iu30Var2, qim0Var, i, (byte) 0);
        }
    }

    public static final v3y m0(u3y u3yVar) {
        Object q3yVar;
        boolean z = u3yVar.b;
        int i = u3yVar.a;
        int[] iArrH = l1d.H(6);
        ArrayList arrayList = new ArrayList(iArrH.length);
        int length = iArrH.length;
        boolean z2 = false;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArrH[i2];
            boolean z3 = i3 == i;
            boolean z4 = !z;
            int iC = l1d.C(i3);
            if (iC == 0) {
                q3yVar = new q3y(z3, z4);
            } else if (iC == 1) {
                q3yVar = new s3y(z3, z4);
            } else if (iC == 2) {
                q3yVar = new p3y(z3, z4);
            } else if (iC == 3) {
                q3yVar = new n3y(z3, z4);
            } else if (iC == 4) {
                q3yVar = new o3y(z3, z4);
            } else {
                if (iC != 5) {
                    eg.o();
                    return null;
                }
                q3yVar = new r3y(z3, z4);
            }
            arrayList.add(q3yVar);
        }
        c380 c380VarA = mqo1.A(arrayList);
        lj80 lj80Var = new lj80(i == 6, !z);
        boolean z5 = (i == 1 || z) ? false : true;
        String str = u3yVar.c;
        if (z && str.length() > 0) {
            z2 = true;
        }
        return new v3y(c380VarA, lj80Var, z5, new bu91(z2, str), u3yVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0272  */
    public static final void n(p1v p1vVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Integer numP;
        int i3;
        p1v p1vVar2 = p1vVar;
        qim0 qim0Var2 = qim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1231514908);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? x340Var.g(p1vVar2) : x340Var.i(p1vVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var2) ? 32 : 16;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            int i5 = i4 & 14;
            int i6 = i5 | 48;
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            m1v m1vVar = m1v.a;
            if (objT == obj) {
                objT = v8r.q(m1vVar);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z = (((i6 & 14) ^ 6) > 4 && x340Var.i(p1vVar2)) || (i6 & 6) == 4;
            Object objT2 = x340Var.T();
            lnm lnmVar = null;
            if (z || objT2 == obj) {
                objT2 = new nnu(p1vVar2, ven0Var, lnmVar, b2);
                x340Var.s0(objT2);
            }
            qxd0.t(p1vVar2, x340Var, (vu30) objT2);
            p1v p1vVar3 = (p1v) ven0Var.getValue();
            boolean z2 = i5 == 4 || ((i4 & 8) != 0 && x340Var.g(p1vVar2));
            Object objT3 = x340Var.T();
            if (z2 || objT3 == obj) {
                objT3 = ot11.P(p1vVar3, p1vVar2);
                x340Var.s0(objT3);
            }
            Integer num = (Integer) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == obj) {
                objT4 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) objT4;
            boolean zG = x340Var.g(num);
            Object objT5 = x340Var.T();
            byte b3 = 3;
            if (zG || objT5 == obj) {
                objT5 = new nnu(num, ven0Var2, lnmVar, b3);
                x340Var.s0(objT5);
            }
            qxd0.t(p1vVar2, x340Var, (vu30) objT5);
            ncf0 ncf0VarG = h5p1.G(new ocf0(num != null ? num.intValue() : 0), (String) null, (xu30) null, x340Var, 0, 62);
            f1v f1vVar = f1v.a;
            boolean zEquals = p1vVar2.equals(f1vVar);
            l1v l1vVar = l1v.a;
            i1v i1vVar = i1v.a;
            n1v n1vVar = n1v.a;
            h1v h1vVar = h1v.a;
            if (zEquals || p1vVar2.equals(h1vVar)) {
                numP = ot11.P(h1vVar, n1vVar);
            } else if (p1vVar2.equals(i1vVar)) {
                numP = ot11.P(p1vVar2, h1vVar);
            } else if (p1vVar2 instanceof k1v) {
                numP = Integer.valueOf(((k1v) p1vVar2).a == null ? 2131886104 : 2131886103);
            } else if (p1vVar2.equals(l1vVar)) {
                numP = ot11.P(p1vVar2, h1vVar);
            } else if (p1vVar2.equals(n1vVar)) {
                numP = 2131886109;
            } else {
                if (!p1vVar2.equals(m1vVar)) {
                    eg.o();
                    return;
                }
                numP = 0;
            }
            numP.getClass();
            ncf0 ncf0VarG2 = h5p1.G(new ocf0(numP.intValue()), (String) null, (xu30) null, x340Var, 0, 62);
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                x340Var.i0(-449267151);
                kbf0 kbf0VarN = zpn1.n(ncf0VarG.c(), false, false, (bcf0) null, 0.0f, 1, x340Var, 958);
                fcf0 fcf0VarC = ncf0VarG.c();
                boolean zG2 = x340Var.g(kbf0VarN);
                Object objT6 = x340Var.T();
                if (zG2 || objT6 == obj) {
                    objT6 = new uk1(kbf0VarN, (byte) 3);
                    x340Var.s0(objT6);
                }
                mp10.e(fcf0VarC, (Function0) objT6, qim0Var2, false, false, false, (xc21) null, false, (ddf0) null, (tl3) null, (j6m) null, false, false, (Map) null, (jj7) null, false, x340Var, (i4 << 3) & 896, 0, 65528);
                x340Var = x340Var;
                if (kbf0VarN.f() == 1.0f) {
                    ven0Var2.setValue(Boolean.FALSE);
                }
                x340Var.r(false);
                p1vVar2 = p1vVar;
                qim0Var2 = qim0Var;
            } else {
                x340Var.i0(-448958050);
                fcf0 fcf0VarC2 = ncf0VarG2.c();
                p1vVar2 = p1vVar;
                boolean z3 = p1vVar2.equals(n1vVar) || ((p1vVar2 instanceof k1v) && ((k1v) p1vVar2).a == null);
                if (p1vVar2.equals(f1vVar) || p1vVar2.equals(h1vVar) || p1vVar2.equals(i1vVar) || p1vVar2.equals(l1vVar) || p1vVar2.equals(m1vVar)) {
                    i3 = 1;
                } else {
                    if (!p1vVar2.equals(n1vVar)) {
                        if (!(p1vVar2 instanceof k1v)) {
                            eg.o();
                            return;
                        } else if (((k1v) p1vVar2).a != null) {
                            i3 = 1;
                        }
                    }
                    i3 = Integer.MAX_VALUE;
                }
                kbf0 kbf0VarN2 = zpn1.n(fcf0VarC2, z3, false, (bcf0) null, 0.0f, i3, x340Var, 956);
                fcf0 fcf0VarC3 = ncf0VarG2.c();
                boolean zG3 = x340Var.g(kbf0VarN2) | (i5 == 4 || ((i4 & 8) != 0 && x340Var.i(p1vVar2)));
                Object objT7 = x340Var.T();
                if (zG3 || objT7 == obj) {
                    objT7 = new f2t(p1vVar2, kbf0VarN2, (byte) 14);
                    x340Var.s0(objT7);
                }
                qim0Var2 = qim0Var;
                mp10.e(fcf0VarC3, (Function0) objT7, qim0Var2, false, false, false, (xc21) null, false, (ddf0) null, (tl3) null, (j6m) null, false, false, (Map) null, (jj7) null, false, x340Var, (i4 << 3) & 896, 0, 65528);
                x340Var = x340Var;
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(p1vVar2, qim0Var2, i, (byte) 21);
        }
    }

    public static final Bundle n0() {
        Bundle bundleF = pzm.f("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", "1046568431490-ij1gi5shcp2gtorls09frkc56d4mjbe2.apps.googleusercontent.com", "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", (String) null);
        bundleF.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundleF.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundleF.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundleF;
    }

    public static final void o(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1751649278);
        if (x340Var.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(cwl1.o0(x340Var, 2131956940), anm1.N("messageTitle", uyn1.y(nim0.a, 16.0f, 8.0f)), cbx.d(x340Var).h, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 28);
        }
    }

    public static final void p(ix90 ix90Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1167240010);
        int i2 = (x340Var.i(ix90Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            shx.a(ix90Var.e, anm1.N("participantImage", nim0.a), hcx.d, (idn0) null, x340Var, 392, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gs90(ix90Var, i, (byte) 3);
        }
    }

    public static final void q(ix90 ix90Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1895438632);
        int i2 = (x340Var.i(ix90Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarN = anm1.N("participantRemoveButton", nim0.a);
            String strO0 = cwl1.o0(x340Var, 2131956939);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4 || x340Var.i(ix90Var));
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new x680(iu30Var, ix90Var, (byte) 14);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), jdx.c, qim0VarN, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, vti.c, x340Var, 0, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(ix90Var, iu30Var, i, (byte) 11);
        }
    }

    public static final void r(ix90 ix90Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1943333282);
        int i2 = (x340Var.i(ix90Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("participantRow", u291.f(nim0.a, 1.0f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i3 = (i2 & 14) | 8;
            p(ix90Var, x340Var, i3);
            s(ix90Var, new wnb0(1.0f, true), x340Var, i3);
            if (z) {
                x340Var.i0(1202871067);
                q(ix90Var, iu30Var, x340Var, ((i2 >> 3) & 112) | i3);
                x340Var.r(false);
            } else {
                x340Var.i0(1202933532);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs(ix90Var, z, iu30Var, i, (byte) 25);
        }
    }

    public static final void s(ix90 ix90Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1720437408);
        int i2 = (x340Var.i(ix90Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("participantName", nim0Var);
            String str = ix90Var.c;
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarN, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            uwo1.e(cwl1.o0(x340Var, ix90Var.d ? 2131956936 : 2131956935), anm1.N("participantRole", nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(ix90Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void t(jx90 jx90Var, d6o0 d6o0Var, iu30 iu30Var, zzq0 zzq0Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-42883758);
        int i2 = i | (b0kVar3.g(jx90Var) ? 4 : 2) | (b0kVar3.i(d6o0Var) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | (b0kVar3.i(zzq0Var) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            List listC = jx90Var.c();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarL = bmq0.L(qim0Var3, d6o0Var, (g6o0) null);
            era eraVar = een.P0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            boolean zI = ((i2 & 14) == 4) | b0kVar3.i(listC) | ((i2 & 896) == 256);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new lb50((Object) listC, (Object) jx90Var, (Object) iu30Var, (byte) 10);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarL, (xtb0) null, zzq0Var, false, d36Var, eraVar, (iq20) null, false, (hxq0) null, (iu30) objT, b0kVar2, (i2 >> 3) & 896, 458);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20((byte) 16, i, jx90Var, d6o0Var, iu30Var, zzq0Var, qim0Var2);
        }
    }

    public static final void u(quf1 quf1Var, abu0 abu0Var, iac0 iac0Var, yqg yqgVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        abu0 abu0Var2;
        yqg yqgVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(437150109);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(quf1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            abu0Var2 = abu0Var;
            i2 |= x340Var.i(abu0Var2) ? 32 : 16;
        } else {
            abu0Var2 = abu0Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iac0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            yqgVar2 = yqgVar;
            i2 |= x340Var.g(yqgVar2) ? 2048 : 1024;
        } else {
            yqgVar2 = yqgVar;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            qim0 qim0VarB = u291.b(0.0f, 260.0f, 1, u291.f(qim0Var, 1.0f));
            uwr uwrVar = cbx.a;
            qim0 qim0VarH = l6o1.H(dug.f(qim0VarB, cbx.a(x340Var).a.a.a(), d4o1.a), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarX = uyn1.x(x0d.p(lhc.g(x340Var).g, 32, qim0VarH), cbx.b(x340Var).e.b);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            d7e.g(0, 1, x340Var, (qim0) null);
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            v(quf1Var, abu0Var2, iac0Var, yqgVar2, x340Var, i3 & 8190);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            e(quf1Var, 3, iu30Var, x340Var, ((i3 >> 6) & 896) | (i3 & 14));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new huf1(quf1Var, abu0Var, iac0Var, yqgVar, iu30Var, qim0Var, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void v(quf1 quf1Var, abu0 abu0Var, iac0 iac0Var, yqg yqgVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1614618638);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(quf1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(abu0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iac0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(yqgVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            puf1 puf1Var = quf1Var.c;
            if (u890.j(puf1Var, muf1.a)) {
                x340Var.i0(1165323742);
                w(x340Var, 0);
                x340Var.r(false);
            } else if (puf1Var instanceof ouf1) {
                x340Var.i0(1165325295);
                A(((ouf1) puf1Var).a, x340Var, 0);
                x340Var.r(false);
            } else {
                if (!(puf1Var instanceof nuf1)) {
                    throw p3d1.k(x340Var, 1165322088, false);
                }
                x340Var.i0(1165327788);
                nuf1 nuf1Var = (nuf1) puf1Var;
                x(quf1Var.a, quf1Var.b, nuf1Var.a, nuf1Var.b, abu0Var, iac0Var, yqgVar, x340Var, (i2 << 9) & 4186112);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, quf1Var, abu0Var, iac0Var, yqgVar, (byte) 8);
        }
    }

    public static final void w(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1324051336);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, 120.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarR, er31.b(4.0f)), cbx.a(x340Var).a.b.a(), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xto1.e(h2c.a.a(nim0Var, een.h), 5, cbx.a(x340Var).c.a, 0L, x340Var, 48, 8);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvd1(i, (byte) 13);
        }
    }

    public static final void x(String str, cvf1 cvf1Var, String str2, String str3, abu0 abu0Var, iac0 iac0Var, yqg yqgVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        Object e971Var;
        tob1 tob1Var;
        boolean z;
        zau0 zau0Var;
        tob1 tob1Var2;
        tob1 tob1Var3;
        rih1 rih1Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(345589028);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(cvf1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(abu0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(iac0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.g(yqgVar) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = abu0Var.e("reinvent-free-track-preview-upsell", false);
                b0kVar3.s0(objT);
            }
            zau0 zau0Var2 = (zau0) objT;
            tob1 tob1VarB = qxy0.B(zau0Var2, b0kVar3);
            tob1 tob1VarH = rwq.h(zau0Var2.b, b0kVar3, 0);
            ven0 ven0VarS = v8r.s((r091) tob1VarB.getValue(), b0kVar3);
            boolean zI = b0kVar3.i(ven0VarS) | b0kVar3.i(abu0Var) | b0kVar3.i(zau0Var2) | b0kVar3.i(iac0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                tob1Var = tob1VarH;
                z = false;
                zau0Var = zau0Var2;
                tob1Var2 = tob1VarB;
                e971Var = new e971(iac0Var, abu0Var, zau0Var, ven0VarS, (byte) 22);
                b0kVar3.s0(e971Var);
            } else {
                tob1Var = tob1VarH;
                z = false;
                e971Var = objT2;
                zau0Var = zau0Var2;
                tob1Var2 = tob1VarB;
            }
            qxd0.h(zau0Var, iac0Var, (iu30) e971Var, b0kVar3);
            boolean zI2 = b0kVar3.i(abu0Var) | b0kVar3.i(zau0Var);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new kwb1(abu0Var, zau0Var, (lnm) null, (byte) 14);
                b0kVar3.s0(objT3);
            }
            qxd0.t(zau0Var, b0kVar3, (vu30) objT3);
            Boolean bool = (Boolean) tob1Var.getValue();
            bool.getClass();
            r091 r091Var = (r091) tob1Var2.getValue();
            tob1 tob1Var4 = tob1Var;
            boolean zI3 = b0kVar3.i(tob1Var4) | b0kVar3.i(tob1Var2) | ((i2 & 14) == 4 ? true : z) | ((i2 & 896) != 256 ? z : true);
            Object objT4 = b0kVar3.T();
            if (zI3 || objT4 == m4cVar) {
                tob1Var3 = tob1Var2;
                b0kVar2 = b0kVar3;
                wba1 wba1Var = new wba1(str, str2, tob1Var4, tob1Var3, (lnm) null, (byte) 9);
                b0kVar2.s0(wba1Var);
                objT4 = wba1Var;
            } else {
                b0kVar2 = b0kVar3;
                tob1Var3 = tob1Var2;
            }
            qxd0.r(bool, r091Var, str2, (vu30) objT4, b0kVar2);
            r091 r091Var2 = (r091) tob1Var3.getValue();
            if (r091Var2 == null) {
                b0kVar2.i0(407593386);
                b0kVar2.r(z);
                rih1Var = null;
            } else {
                b0kVar2.i0(407593387);
                otw.c(new yup0(yqgVar, r091Var2), new fuf1(str, cvf1Var, str2, str3), (qim0) null, (ipb1) null, b0kVar2, 0, 12);
                b0kVar2.r(z);
                rih1Var = rih1.a;
            }
            if (rih1Var == null) {
                b0kVar2.i0(1398631156);
                w(b0kVar2, z);
            } else {
                b0kVar2.i0(1398621081);
            }
            b0kVar2.r(z);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(str, cvf1Var, str2, str3, abu0Var, iac0Var, yqgVar, i, (byte) 23);
        }
    }

    public static final void y(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(368743354);
        if (x340Var.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, nim0.a);
            avw0 avw0Var = cbx.b(x340Var).c;
            hr80.d(qim0VarZ, 2.0f, cbx.a(x340Var).d.b, x340Var, 0, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 29);
        }
    }

    public static final void z(k1r k1rVar, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1637456375);
        int i2 = (x340Var.i(k1rVar) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (k1rVar instanceof i1r) {
            x340Var.i0(-1637541797);
            j2iVar.invoke(((i1r) k1rVar).a, x340Var, 48);
            x340Var.r(false);
        } else if (zjy.a(2, k1rVar)) {
            x340Var.i0(775908505);
            x340Var.r(false);
        } else {
            x340Var.i0(-1637539613);
            crm0.n(x340Var, 0);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(k1rVar, j2iVar, i, (byte) 25);
        }
    }
}
